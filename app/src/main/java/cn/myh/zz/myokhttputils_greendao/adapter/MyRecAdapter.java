package cn.myh.zz.myokhttputils_greendao.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import cn.myh.zz.myokhttputils_greendao.R;

/**
 * Created by lenovo on 2017/12/7.
 */

public class MyRecAdapter extends RecyclerView.Adapter<MyRecAdapter.MyViewHolder> {

    List<String> mDatas = new ArrayList<>();
    Context ctx;
    //通过构造函数把要显示的数据读取进来


    public MyRecAdapter(List<String> mDatas,Context context) {
        this.mDatas = mDatas;
        this.ctx = context;
    }

    @Override
    //相当于ListView中的getView()方法
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View view = View.inflate(ctx, R.layout.recy_item, null);
        LayoutInflater inflater = LayoutInflater.from(ctx);
        View v = inflater.inflate(R.layout.recy_item, parent, false);
        MyViewHolder holder = new MyViewHolder(v);
        return holder;
    }

    @Override
    //在这里需要设置显示的数据
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.textView.setText(mDatas.get(position));
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }
    //自定义ViewHolder必须继承RecyclerView.ViewHolder，在构造函数中进行ID绑定控件，条目监听等
    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textView ;
        public MyViewHolder(final View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.item_text);
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (onItemClickListener!=null) {
                        onItemClickListener.onItemClick(itemView,getLayoutPosition(),mDatas.get(getLayoutPosition()));
                    }
                }
            });
        }
    }
    //自定义监听
    private OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.onItemClickListener = listener;
    }

    public interface OnItemClickListener {
        void onItemClick(View v, int position, String data);
    }

    public void addData(int position, String data) {
        mDatas.add(position, data);
        notifyItemInserted(position);
    }

    public void removeData(int position) {
        mDatas.remove(position);
        notifyItemRemoved(position);
    }

}


