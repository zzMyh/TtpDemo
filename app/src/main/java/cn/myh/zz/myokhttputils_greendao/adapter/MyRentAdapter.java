package cn.myh.zz.myokhttputils_greendao.adapter;

import android.content.Context;

import java.util.List;

import cn.myh.zz.myokhttputils_greendao.Bean.HouseWantedsBean;
import cn.myh.zz.myokhttputils_greendao.R;
import cn.myh.zz.myokhttputils_greendao.base.BaseViewHolder;
import cn.myh.zz.myokhttputils_greendao.base.SimpAdapter;

/**
 * Created by lenovo on 2017/12/8.
 */

public class MyRentAdapter extends SimpAdapter<HouseWantedsBean> {
//public class MyRentAdapter extends SimpAdapter<RentBean.InfoBean.HouseWantedsBean> {
    public MyRentAdapter(Context context, int layoutResId) {
        super(context, layoutResId);
    }

//    public MyRentAdapter(List<RentBean.InfoBean.HouseWantedsBean> datas, Context context, int layoutResId) {
    public MyRentAdapter(List<HouseWantedsBean> datas, Context context, int layoutResId) {
        super(datas, context, layoutResId);
    }

    @Override
    public void convert(BaseViewHolder viewHolder, HouseWantedsBean item) {
//    public void convert(BaseViewHolder viewHolder, RentBean.InfoBean.HouseWantedsBean item) {
        viewHolder.getTextView(R.id.rent_title).setText(item.getArea()+"区"+item.getRoomNum()+"室"+item.getRentType()+"厅");
        viewHolder.getTextView(R.id.rent_name).setText("求租人姓名："+item.getRealName());
    }
}
