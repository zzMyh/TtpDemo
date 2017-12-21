package cn.myh.zz.myokhttputils_greendao.base;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public abstract class BaseRecyclerAdapter<T,H extends BaseViewHolder> extends RecyclerView.Adapter<BaseViewHolder> {

    protected static final String TAG = BaseRecyclerAdapter.class.getSimpleName();

    protected final Context context;

    protected  int layoutResId;

    protected List<T> datas;


    private OnItemClickListener mOnItemClickListener = null;



    public  interface OnItemClickListener {
        void onItemClick(View view, int position);
    }



    public BaseRecyclerAdapter(Context context, int layoutResId) {
        this(context, layoutResId, null);
    }


    public BaseRecyclerAdapter(Context context, int layoutResId, List<T> datas) {
        this.datas = datas == null ? new ArrayList<T>() : datas;
        this.context = context;
        this.layoutResId = layoutResId;
    }




    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup viewGroup,  int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(layoutResId, viewGroup, false);
        BaseViewHolder vh = new BaseViewHolder(view,mOnItemClickListener);
        return vh;
    }

    @Override
    public void onBindViewHolder(BaseViewHolder viewHoder,  int position) {
        T item = getItem(position);
        convert((H)viewHoder, item);
    }



    @Override
    public int getItemCount() {
        if(datas==null || datas.size()<=0)
            return 0;

        return datas.size();
    }


    public T getItem(int position) {
        if (position >= datas.size()) return null;
        return datas.get(position);
    }


    public void clear(){
//        int itemCount = datas.size();
//        datas.clear();
//        this.notifyItemRangeRemoved(0,itemCount);

        if(datas==null || datas.size()<=0)
            return;

        for (Iterator it = datas.iterator(); it.hasNext();){

            T t = (T) it.next();
            int position = datas.indexOf(t);
            it.remove();
            notifyItemRemoved(position);
        }
    }

    /**
     * 从列表中删除某项
     * @param t
     */
    public  void removeItem(T t){

        int position = datas.indexOf(t);
        datas.remove(position);
        notifyItemRemoved(position);
    }




    public List<T> getDatas(){

        return  datas;
    }




    public void addData(List<T> datas){

        addData(0,datas);
    }

    public void addData(int position,List<T> list){

        if(list !=null && list.size()>0) {

            for (T t:list) {
                datas.add(position, t);
                notifyItemInserted(position);
            }

        }
    }



    public void refreshData(List<T> list){

        clear();
        if(list !=null && list.size()>0){


            int size = list.size();
            for (int i=0;i<size;i++){
                datas.add(i,list.get(i));
                notifyItemInserted(i);
            }

        }
    }

    public void loadMoreData(List<T> list){

        if(list !=null && list.size()>0){

            int size = list.size();
            int begin = datas.size();
            for (int i=0;i<size;i++){
                datas.add(list.get(i));
                notifyItemInserted(i+begin);
            }

        }

    }




    protected abstract void convert(H viewHoder, T item);




    public void setOnItemClickListener(OnItemClickListener listener) {
        this.mOnItemClickListener = listener;

    }





   /* //数据源
    protected List<T> datas ;

    protected Context context;

    protected int layoutResId;

    private OnItemClickListener clickListener = null;

    public BaseRecyclerAdapter(Context context, int layoutResId) {
        this(null,context, layoutResId);
    }

    public BaseRecyclerAdapter(List<T> datas,Context context,int layoutResId) {
        this.datas = datas == null?new ArrayList<T>():datas;
        this.context = context;
        this.layoutResId = layoutResId;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(layoutResId, null, false);
        BaseViewHolder holder = new BaseViewHolder(view,clickListener);
        return holder;
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
            //绑定数据
        T item = getItem(position);
        convert((H)holder,item);


    }

    @Override
    public int getItemCount() {
        if (datas==null||datas.size()<=0){
            return 0;
        }
        return datas.size();
    }

    //获取当前条目数据
    public T getItem(int position){
        if (position>=datas.size()){
            return null;
        }
        return datas.get(position);
    }

    *//**
     * 清空数据
     *//*

     public void clearData(){
         int size = datas.size();
         datas.clear();
         notifyItemRangeRemoved(0,size);
     }

    *//**
     * 下拉刷新，清除原有数据，添加新数据
     *//*

    public void refreshData(List<T> newDatas){
        datas.clear();
        datas.addAll(newDatas);
        notifyItemRangeChanged(0,datas.size());
    }
    *//**
     * 加载更多
     * 在原来数据的末尾追加新数据
     *//*

    public void loadMoreData(List<T> newDatas){
        int lastPosion = datas.size();
        datas.addAll(lastPosion,newDatas);
        notifyItemRangeInserted(lastPosion,newDatas.size());
    }

    *//**
     * 添加监听
     *//*

    public interface OnItemClickListener{
        public void onClick(View view,int position);

    }
    public void setOnclikListener(OnItemClickListener clickListener){
        this.clickListener = clickListener;
    }

    public abstract void convert(H viewHolder,T item);

    public List<T> getDatas(){

        return  datas;
    }*/
}
