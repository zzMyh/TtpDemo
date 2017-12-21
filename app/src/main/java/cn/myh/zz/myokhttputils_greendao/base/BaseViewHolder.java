package cn.myh.zz.myokhttputils_greendao.base;

import android.content.IntentFilter;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by lenovo on 2017/12/8.
 */

public class BaseViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    //使用数组吧view 存起来
    private SparseArray<View> views;

    //监听
    private BaseRecyclerAdapter.OnItemClickListener mOnClickListener;


    public BaseViewHolder(View itemView,BaseRecyclerAdapter.OnItemClickListener listener) {
        super(itemView);
        itemView.setOnClickListener(this);
        this.mOnClickListener = listener;
        this.views = new SparseArray<View>();
    }

    public TextView getTextView(int viewId) {
        return findView(viewId);
    }

    public Button getButton(int viewId) {
        return findView(viewId);
    }

    public ImageView getImageView(int viewId) {
        return findView(viewId);
    }

    public View getView(int viewId) {
        return findView(viewId);
    }

    protected   <T extends View> T  findView(int viewId){
        View mView = views.get(viewId);
        if (mView == null){
             mView = itemView.findViewById(viewId);
            views.put(viewId,mView);
        }
        return (T)mView;
    }

    @Override
    public void onClick(View v) {

        if (mOnClickListener!=null){
            mOnClickListener.onItemClick(v,getLayoutPosition());
        }
    }
}
