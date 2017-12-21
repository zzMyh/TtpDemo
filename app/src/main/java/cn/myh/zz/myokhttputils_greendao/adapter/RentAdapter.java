package cn.myh.zz.myokhttputils_greendao.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import cn.myh.zz.myokhttputils_greendao.Bean.RentBean;
import cn.myh.zz.myokhttputils_greendao.R;

/**
 * Created by lenovo on 2017/12/7.
 */

public class RentAdapter extends RecyclerView.Adapter<RentAdapter.RentHoldr>{

Context context;
    public RentAdapter(List<RentBean.InfoBean.HouseWantedsBean> infoBeen, Context context) {
        this.infoBeens = infoBeen;
        this.context = context;
    }

    List<RentBean.InfoBean.HouseWantedsBean> infoBeens = new ArrayList<>();
    @Override
    public RentHoldr onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.rent_list_item, parent, false);
        return new RentHoldr(view);
    }

    @Override
    public void onBindViewHolder(RentHoldr holder, int position) {
        RentBean.InfoBean.HouseWantedsBean houseWantedsBean = infoBeens.get(position);
        holder.title.setText("求"+houseWantedsBean.getArea()+"|"+houseWantedsBean.getRoomNum()+"室"+houseWantedsBean.getRoomTing()+"厅");
    }

    @Override
    public int getItemCount() {
        return infoBeens.size();
    }

    public class RentHoldr extends RecyclerView.ViewHolder{

        TextView title ;
        public RentHoldr(View itemView) {
            super(itemView);
             title = (TextView) itemView.findViewById(R.id.rent_title);

        }
    }

    /**
     * 下拉刷新，清除原有数据，添加新数据
     *
     * @param
     */
    public void refreshData(List<RentBean.InfoBean.HouseWantedsBean> houses){
        //下拉刷新：下拉刷新就是清除原来的所有数据，如果有分页，把分页回到第一页，然后向服务器请求数据，把数据显示出来以后关闭下拉刷新。

//        notifyItemRangeChanged(0,infoBeens.size());
//        int size = infoBeens.size();
        //清除原有数据
        infoBeens.clear();
//        notifyItemRangeChanged(0,size);
        //添加新数据
        infoBeens.addAll(houses);
        //刷新界面
        notifyItemRangeChanged(0,infoBeens.size());
    }


    /**
     * 上拉加载更多
     * 在原来数据的末尾追加新数据
     *
     * @param
     */

    public void loadMore(List<RentBean.InfoBean.HouseWantedsBean> houses){
        //上拉加载更多：在原来已有的数据的末尾去追加数据。把数据显示出来以后关闭上拉加载更多。
        //当前显示数据的最后一条位置
        int lastPostion = infoBeens.size();
        //追加到最后一个索引位置后刷新
        infoBeens.addAll(lastPostion,houses);
        notifyItemRangeInserted(lastPostion,houses.size());


    }
}
