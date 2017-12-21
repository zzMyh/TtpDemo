package cn.myh.zz.myokhttputils_greendao.http;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import cn.myh.zz.myokhttputils_greendao.RentActivity;


/**
 * Created by <a href="http://www.cniao5.com">菜鸟窝</a>
 * 一个专业的Android开发在线教育平台
 */
public abstract class SimpleCallback<T> extends BaseCallback<T> {

    protected Context mContext;

    public SimpleCallback(Context context){

        mContext = context;

    }

    @Override
    public void onBeforeRequest(Request request) {

    }

    @Override
    public void onFailure(Request request, Exception e) {

    }

    @Override
    public void onResponse(Response response) {

    }

    @Override
    public void onTokenError(Response response, int code) {
//        ToastUtils.show(mContext, mContext.getString(R.string.token_error));
        Toast.makeText(mContext,"加载失败",Toast.LENGTH_SHORT).show();
//        ToastUtils.show(mContext, mContext.getString(R.string.token_error));

        Intent intent = new Intent();
        intent.setClass(mContext, RentActivity.class);
        mContext.startActivity(intent);

//        CniaoApplication.getInstance().clearUser();

    }


}
