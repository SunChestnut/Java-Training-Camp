package syl.camp.homework.gateway;

import io.netty.handler.codec.http.FullHttpResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpStatus;
import syl.camp.example.gateway.filter.HttpResponseFilter;

/**
 * 【第二周】【作业3】
 * 自定义响应体过滤器
 *
 * @author sunyl
 * @date 2021/8/22 8:20 下午
 * @see syl.camp.homework.gateway
 */
@Slf4j
public class CustomerHttpResponseFilter implements HttpResponseFilter {

    @Override
    public void filter(FullHttpResponse response) {
        if (response.status().code() == HttpStatus.SC_OK) {
            response.headers().set("WoW", "You Got It ✓☆(￣▽￣)");
        }
    }
}
