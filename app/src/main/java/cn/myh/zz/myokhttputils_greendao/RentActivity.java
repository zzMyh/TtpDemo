package cn.myh.zz.myokhttputils_greendao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.cjj.MaterialRefreshLayout;
import com.cjj.MaterialRefreshListener;
import com.squareup.okhttp.Response;

import java.util.List;

import cn.myh.zz.myokhttputils_greendao.Bean.BaseInfo;
import cn.myh.zz.myokhttputils_greendao.Bean.HouseWantedsBean;
import cn.myh.zz.myokhttputils_greendao.Bean.RentBean;
import cn.myh.zz.myokhttputils_greendao.Bean.TrentBean;
import cn.myh.zz.myokhttputils_greendao.adapter.MyRentAdapter;
import cn.myh.zz.myokhttputils_greendao.http.OkHttpHelper;
import cn.myh.zz.myokhttputils_greendao.http.SpotsCallBack;
import cn.myh.zz.myokhttputils_greendao.view.RecyclerViewNoBugLinearLayoutManager;

public class RentActivity extends AppCompatActivity {

    //当前页码
    private int curPage = 1;
    //请求每页数据的数量
    private int pageSize = 10;
    //用于记录当前是何种操作状态，在请求完数据之后根据不同的状态进行不同的操作
    private static final int STATE_INT = 0;//默认初始化状态
    private static final int STATE_REFRESH = 1;//下拉刷新状态
    private static final int STATE_LOAD_MORE = 2;//上拉加载更多
    //用于记录当前状态
    private int curState = 0;//默认是初始化状态
    //用于记录总页数，在上拉的时候判断还有没有更多的数据
    private int totalPage = 1;//默认页数


    private RecyclerView rentRecycler;
    private MaterialRefreshLayout materialRefresh;
    private MyRentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rent);
        initView();
        initData();
    }

    /**
     * 向服务器请求数据，实现getData()方法，在请求成功的时候，
     * 得到数据，这个数据可能是初始化的时候的数据、下拉刷新的数据、或者上拉加载更多的“更多数据”。
     * 服务器的Uri的请求参数需要有当前页以及页的大小。
     */
    private void initData() {
        final String url = "http://aixiangjia.com.cn:9010/house_rent_app/houseWanted/list?pagesize="+pageSize+"&pageNum="+curPage;
        OkHttpHelper httpHelper = OkHttpHelper.getInstance();
        httpHelper.get(url, new SpotsCallBack<BaseInfo<HouseWantedsBean>>(RentActivity.this) {
            @Override
            public void onSuccess(Response response, BaseInfo rentBean) {
                Log.d("RentAct","请求的数据是++++"+rentBean.toString());
                List<HouseWantedsBean> houseWanteds = rentBean.getInfo().getHouseWanteds();
//                        RentAdapter rentAdapter = new RentAdapter(houseWanteds,RentActivity.this);
                totalPage = rentBean.getInfo().getTotalPage();//总页码
                showData(houseWanteds);
//                        rentRecycler.setAdapter(rentAdapter);
                Log.d("RentAct","成功url:++"+url);
            }

            @Override
            public void onError(Response response, int code, Exception e) {
                Toast.makeText(RentActivity.this,"请求失败"+e.getMessage(),Toast.LENGTH_SHORT).show();
                Log.d("RentAct",e.getMessage());
                Log.d("RentAct","失败url:++"+url);
            }
        });
        /*httpHelper.get(url, new SpotsCallBack<TrentBean.InfoBean<HouseWantedsBean>>(RentActivity.this) {
            @Override
            public void onSuccess(Response response, TrentBean.InfoBean<HouseWantedsBean> rentBean) {
                Log.d("RentAct","请求的数据是++++"+rentBean.toString());
                List<HouseWantedsBean> houseWanteds = rentBean.getList();
//                        RentAdapter rentAdapter = new RentAdapter(houseWanteds,RentActivity.this);
                totalPage = rentBean.getTotalPage();//总页码
                showData(houseWanteds);
//                        rentRecycler.setAdapter(rentAdapter);
                Log.d("RentAct","成功url:++"+url);
            }

            @Override
            public void onError(Response response, int code, Exception e) {
                Toast.makeText(RentActivity.this,"请求失败"+e.getMessage(),Toast.LENGTH_SHORT).show();
                Log.d("RentAct",e.getMessage());
                Log.d("RentAct","失败url:++"+url);
            }
        });*/
       /* httpHelper.get(url, new SpotsCallBack<RentBean>(RentActivity.this) {


            @Override
            public void onSuccess(Response response, RentBean rentBean) {
                Log.d("RentAct","请求的数据是++++"+rentBean.toString());
                List<RentBean.InfoBean.HouseWantedsBean> houseWanteds = rentBean.getInfo().getHouseWanteds();
//                        RentAdapter rentAdapter = new RentAdapter(houseWanteds,RentActivity.this);
                totalPage = rentBean.getInfo().getTotalPage();//总页码
                showData(houseWanteds);
//                        rentRecycler.setAdapter(rentAdapter);
                Log.d("RentAct","成功url:++"+url);
            }

            @Override
            public void onError(Response response, int code, Exception e) {
                Toast.makeText(RentActivity.this,"请求失败"+e.getMessage(),Toast.LENGTH_SHORT).show();
                Log.d("RentAct",e.getMessage());
                Log.d("RentAct","失败url:++"+url);
            }
        });*/


        /*final String url = "http://aixiangjia.com.cn:9010/house_rent_app/houseWanted/list?pagesize="+pageSize+"&pageNum="+curPage;
        //获取网络数据
        OkHttpUtils.get()
                .url(url)
//                .addParams("pageSize",pageSize+"")
//                .addParams("pageNum",curPage+"")
                .build()
                .execute(new Callback() {
                    @Override
                    public Object parseNetworkResponse(Response response, int id) throws Exception {
                        return response.body().string();
                    }

                    @Override
                    public void onError(Call call, Exception e, int id) {
                        Toast.makeText(RentActivity.this,"请求失败"+e.getMessage(),Toast.LENGTH_SHORT).show();
                        Log.d("RentAct",e.getMessage());
                        Log.d("RentAct","失败url:++"+url);
                    }

                    @Override
                    public void onResponse(Object response, int id) {
                        String json = (String) response;
                        Log.d("RentAct",json);
                        RentBean rentBean = new Gson().fromJson(json, RentBean.class);
                        List<RentBean.InfoBean.HouseWantedsBean> houseWanteds = rentBean.getInfo().getHouseWanteds();
//                        RentAdapter rentAdapter = new RentAdapter(houseWanteds,RentActivity.this);
                        totalPage = rentBean.getInfo().getTotalPage();//总页码
                        showData(houseWanteds);
//                        rentRecycler.setAdapter(rentAdapter);
                        Log.d("RentAct","成功url:++"+url);
                    }
                });*/
    }

    private void initView() {
        rentRecycler = (RecyclerView) findViewById(R.id.rent_list);
        rentRecycler.setLayoutManager(new RecyclerViewNoBugLinearLayoutManager(this));
        //设置每个Item之间的装饰（这里设置为分隔线）
        rentRecycler.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        materialRefresh = (MaterialRefreshLayout) findViewById(R.id.rent_materialRefreshLayout_view);
        ////设置支持下拉加载更多
        materialRefresh.setLoadMore(true);
        //刷新以及回调监听;
        materialRefresh.setMaterialRefreshListener(new MaterialRefreshListener() {
            @Override
            public void onRefresh(MaterialRefreshLayout materialRefreshLayout) {
                //下拉刷新监听
                //下拉刷新回调，更改当前状态为下拉刷新状态，把当前页置为第一页，
                //向服务器请求数据
                curState = STATE_REFRESH;
                curPage = 1;
                initData();
            }

            @Override
            public void onRefreshLoadMore(MaterialRefreshLayout materialRefreshLayout) {
                super.onRefreshLoadMore(materialRefreshLayout);
                //上拉加载更多监听
                //上拉加载更多回调，更改当前状态为上拉加载更多状态，页数加1
                //并且在判断还有更多的情况下向服务器请求数据
                //否则提示用户没有更多数据，关闭上拉加载更多
                curState = STATE_LOAD_MORE;
                curPage = curPage+1;
                Log.d("RentActiviyt","当前curPage是++"+curPage);
                if (curPage<=totalPage){
                    initData();
                }else {
                    Toast.makeText(RentActivity.this,"已经没有更多数据了",Toast.LENGTH_SHORT).show();
                    materialRefreshLayout.finishRefreshLoadMore();
                }

            }
        });

    }

    /**
     * 实现showData()方法，把得到的数据显示多来。这里需要判断是初始化状态、下拉刷新状态、上拉加载更多状态。不同状态干不同的事情：
     初始化状态：初始化列表。
     下拉刷新状态：刷新数据，列表回到最顶端，关闭下拉刷新
     上拉加载更多状态：追加数据，关闭上拉加载更多
     */

//    private void showData(List<RentBean.InfoBean.HouseWantedsBean> datas){
    private void showData(List<HouseWantedsBean> datas){

        switch (curState){//判断当前操作状态
            case STATE_INT:
                //初始化状态
//                adapter = new RentAdapter(datas,this);
                adapter = new MyRentAdapter(datas,this,R.layout.rent_list_item);
                rentRecycler.setAdapter(adapter);
                break;
            case STATE_REFRESH:
                //下拉刷新状态，刷新数据，列表回到最顶端，关闭下拉刷新控件
                adapter.refreshData(datas);
                rentRecycler.scrollToPosition(0);
                materialRefresh.finishRefresh();
                break;
            case STATE_LOAD_MORE:
                //上拉加载更多状态，追加数据，关闭上拉加载更多
//                adapter.loadMore(datas);
                adapter.loadMoreData(datas);
                materialRefresh.finishRefreshLoadMore();
                break;
        }
    }
}
