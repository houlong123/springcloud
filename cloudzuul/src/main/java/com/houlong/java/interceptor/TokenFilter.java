package com.houlong.java.interceptor;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.codec.binary.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by houlong on 2018/3/11.
 */
public class TokenFilter extends ZuulFilter {
    @Override
    public String filterType() {
        // 可以在请求被路由之前调用
        return "pre";
    }

    @Override
    public int filterOrder() {
        // filter执行顺序，通过数字指定 ,优先级为0，数字越大，优先级越低
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        // 是否执行该过滤器，此处为true，说明需要过滤
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        //filter需要执行的具体操作
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        String token = request.getParameter("token");
        if ("".equals(token) || null == token) {
            //不对其进行路由
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(400);
            context.setResponseBody("token is empty");
            context.set("isSuccess", false);
            return null;
        } else {
            context.setSendZuulResponse(true);
            context.setResponseStatusCode(200);
            context.set("isSuccess", true);
            return null;
        }
    }
}
