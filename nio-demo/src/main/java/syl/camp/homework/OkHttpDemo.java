package syl.camp.homework;

import lombok.extern.slf4j.Slf4j;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

import java.io.IOException;

/**
 * 【第二周】【作业6】
 * 使用 OkHttpClient 访问 🔗http://127.0.0.1:8801
 *
 * @author sunyl
 * @date 2021/8/21 5:50 下午
 * @see syl.camp.homework
 */
@Slf4j
public class OkHttpDemo {

    private final static String BASE_URL = "http://127.0.0.1:8801";

    public static void syncGetRequest() {
        try {
            OkHttpClient client = new OkHttpClient();

            Request request = new Request.Builder()
                    .url(BASE_URL + "")
                    .build();

            Call call = client.newCall(request);
            Response response = call.execute();
            ResponseBody body = response.body();

            assert body != null;
            log.info("Response : {}", body.string());

        } catch (IOException e) {
            log.error("Something Wrong:{}", e.getMessage());
        }
    }

    public static void main(String[] args) {
        syncGetRequest();
    }

}
