package cn.myh.zz.myokhttputils_greendao;

import android.graphics.Color;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import cn.myh.zz.myokhttputils_greendao.adapter.MyRecAdapter;

public class MyActivity extends AppCompatActivity {

    private List<String> datas;
    private MyRecAdapter adapter;
    private RecyclerView recy_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        datas = new ArrayList<>();
        initData();
        initView();

    }

    private void initView() {

        recy_view = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new MyRecAdapter(datas,this);
        recy_view.setAdapter(adapter);
        //设置布局管理器，以渲染出不同的效果
        recy_view.setLayoutManager(new LinearLayoutManager(this));
        //设置插入、删除数据的动画效果（这里使用默认的动画）
        recy_view.setItemAnimator(new DefaultItemAnimator());
        //设置每个Item之间的装饰（这里设置为分隔线）
        recy_view.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        //设置条目监听，需要自定义接口
        adapter.setOnItemClickListener(new MyRecAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View v, int position, String data) {
                Toast.makeText(MyActivity.this,data,Toast.LENGTH_SHORT).show();
            }
        });

        ////////////////////////////////////////////////

        final SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipRefresh_view);
        //设置进度条颜色变化
        swipeRefreshLayout.setColorSchemeColors(Color.RED,Color.BLUE,Color.WHITE);
        //设置进度条的背景颜色
//        swipeRefreshLayout.setBackgroundColor(Color.YELLOW);
        //设置大小
        swipeRefreshLayout.setSize(SwipeRefreshLayout.LARGE);
        //设置手指划过多少像素开始刷新
        swipeRefreshLayout.setDistanceToTriggerSync(100);
        ////设置刷新的时候监听，三秒钟之后添加数据完毕
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                //模拟网路数据请求
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        for (int i=0;i<10;i++){
                            adapter.addData(i,i+"条");
                            adapter.notifyItemRangeChanged(i,10);
                        }
                        //设置显示第一条数据
                        recy_view.scrollToPosition(0);
                        //刷新完毕关闭下拉刷新控件
                        swipeRefreshLayout.setRefreshing(false);
                    }
                },3000);
            }
        });


    }

    private void initData() {
        for (int i=0;i<100;i++){
            datas.add(i+"只");
        }
    }
}
