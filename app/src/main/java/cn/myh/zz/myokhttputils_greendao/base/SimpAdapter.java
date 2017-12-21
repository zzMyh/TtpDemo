package cn.myh.zz.myokhttputils_greendao.base;

import android.content.Context;

import java.util.List;

/**
 * Created by lenovo on 2017/12/8.
 */

public abstract class SimpAdapter<T> extends BaseRecyclerAdapter<T,BaseViewHolder> {
    public SimpAdapter(Context context, int layoutResId) {
        super(context, layoutResId);
    }

    public SimpAdapter(List<T> datas, Context context, int layoutResId) {
        super(context, layoutResId);
    }
}
