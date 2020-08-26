package com.dfbz.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpServletRequest;
@Configuration
public class TokenFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";  //在请求被路由调用前执行
    }

    @Override
    public int filterOrder() {
        return 0;  //filter的执行顺序，数字越大，优先级越低
    }

    @Override
    public boolean shouldFilter() {
        return true; //是否执行该过滤器
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        System.out.println("模拟对request进行了一些操作。。。。");
        String token = request.getParameter("token");
        if (StringUtils.isNotBlank(token)){
            ctx.setSendZuulResponse(true); // 进行路由请求操作
            ctx.setResponseStatusCode(200);
            return null;
        } else{
            ctx.setSendZuulResponse(false); // 不进行路由请求操作
            ctx.setResponseStatusCode(400);
            return null;
        }

    }
}
