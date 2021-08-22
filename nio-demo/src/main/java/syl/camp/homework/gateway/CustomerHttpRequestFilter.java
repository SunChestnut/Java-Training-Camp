package syl.camp.homework.gateway;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.FullHttpRequest;
import lombok.extern.slf4j.Slf4j;
import syl.camp.example.gateway.filter.HttpRequestFilter;

/**
 * 【第二周】【作业3】
 * 自定义请求体过滤器
 *
 * @author sunyl
 * @date 2021/8/22 8:00 下午
 * @see syl.camp.homework.gateway
 */
@Slf4j
public class CustomerHttpRequestFilter implements HttpRequestFilter {

    @Override
    public void filter(FullHttpRequest fullRequest, ChannelHandlerContext ctx) {

        if (fullRequest.uri().contains("/whatever")) {
            log.info("😋😋😋 Add Customer Header Info");
            fullRequest.headers().set("WhoAreYou", "BiuBiuBiu~");
        }
    }
}
