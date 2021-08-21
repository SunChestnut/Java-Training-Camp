package syl.camp.homework;

import cn.hutool.http.ContentType;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 【第二周】【作业6】
 * 使用 HttpClient 访问 🔗http://127.0.0.1:8801
 *
 * @author sunyl
 * @date 2021/8/21 5:12 下午
 * @see syl.camp.homework
 */
@Slf4j
public class HttpClientDemo {

    private final static String SAMPLE_URL = "http://127.0.0.1:8801";

    public static void sendGetRequest() {
        try {
            HttpClient client = HttpClients.custom().build();
            HttpUriRequest request = RequestBuilder.get()
                    .setUri(SAMPLE_URL)
                    .setHeader(HttpHeaders.CONTENT_TYPE, ContentType.JSON.getValue())
                    .build();

            HttpResponse response = client.execute(request);
            HttpEntity entity = response.getEntity();

            String text = IOUtils.toString(entity.getContent(), StandardCharsets.UTF_8.name());
            log.info("Response : {}", text);

        } catch (IOException e) {
            log.error("Something Wrong:{}", e.getMessage());
        }
    }

    public static void sendGetRequestWithTimeout() {
        try {
            int timeout = 5;
            RequestConfig config = RequestConfig.custom()
                    .setConnectTimeout(timeout * 1000)
                    .setConnectionRequestTimeout(timeout * 1000)
                    .setSocketTimeout(timeout * 1000)
                    .build();
            CloseableHttpClient client = HttpClientBuilder.create().setDefaultRequestConfig(config).build();

            HttpUriRequest request = RequestBuilder.get()
                    .setUri(SAMPLE_URL)
                    .setHeader(HttpHeaders.CONTENT_TYPE, ContentType.JSON.getValue())
                    .build();
            CloseableHttpResponse response = client.execute(request);
            HttpEntity entity = response.getEntity();

            String text = IOUtils.toString(entity.getContent(), StandardCharsets.UTF_8.name());
            log.info("Response : {}", text);

        } catch (IOException e) {
            log.error("Something Wrong:{}", e.getMessage());
        }
    }

    public static void main(String[] args) {
        sendGetRequest();
        sendGetRequestWithTimeout();
    }

}
