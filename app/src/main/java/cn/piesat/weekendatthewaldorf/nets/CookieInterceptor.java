package cn.piesat.weekendatthewaldorf.nets;

import android.support.annotation.NonNull;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by arvinljw on 2018/11/30 14:26
 * Function：
 * Desc：
 */
class CookieInterceptor implements Interceptor {
    @Override
    public Response intercept(@NonNull Chain chain) throws IOException {
        Request originalRequest = chain.request();
        Request.Builder requestBuilder = originalRequest.newBuilder()
                .addHeader("Content-Type", "application/json")
                .method(originalRequest.method(), originalRequest.body());
        Request request = requestBuilder.build();
        return chain.proceed(request);
    }
//                    .addHeader("Accept-Encoding", "gzip")
//                .addHeader("Accept", "application/json")

//                .addHeader("Authorization", "")//添加请求头信息，服务器进行token有效性验证
}
