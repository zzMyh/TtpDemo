package cn.myh.zz.myokhttputils_greendao.utils;

import com.google.gson.Gson;
import com.google.gson.internal.$Gson$Types;
import com.zhy.http.okhttp.callback.Callback;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import cn.myh.zz.myokhttputils_greendao.Bean.BaseInfo;
import okhttp3.Response;

/**
 * Created by JimGong on 2016/6/23.
 */

public abstract class GenericsCallback<T> extends Callback<T> {
    IGenericsSerializator mGenericsSerializator;

   public Type mType ;
    static Type getSuperclassTypeParameter(Class<?> subclass)
    {
        Type superclass = subclass.getGenericSuperclass();
        if (superclass instanceof Class)
        {
            throw new RuntimeException("Missing type parameter.");
        }
        ParameterizedType parameterized = (ParameterizedType) superclass;
        return $Gson$Types.canonicalize(parameterized.getActualTypeArguments()[0]);
    }

    public GenericsCallback(IGenericsSerializator serializator) {
        mGenericsSerializator = serializator;
        mType = getSuperclassTypeParameter(getClass());
    }

    @Override
    public T parseNetworkResponse(Response response, int id) throws IOException {

        String string = response.body().string();

        if (mType == String.class){
            return (T) string;
        }
        Object obj = new Gson().fromJson(string, mType);
        //获得超类的泛型参数的实际类型
//        Class<T> entityClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
//        if (entityClass == String.class) {
//            return (T) string;
//        }
//        T bean = mGenericsSerializator.transform(string, entityClass);
        return (T) obj;
    }

}
