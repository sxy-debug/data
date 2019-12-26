package com.fh.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName TestZuulFilter
 * @Description TODO
 * @Author 孙新宇
 * @Date 2019/12/16 11:35
 * @Version 1.0
 **/
public class TestZuulFilter extends ZuulFilter {

    /**
     * 过滤器的类型,它决定过滤器在请求的哪个生命周期中执行,
     * pre:请求被路由之前做一些前置工作 ,比如请求和校验
     * routing : 在路由请求时被调用,路由请求转发,即是将请求转发到具体的服务实例上去.
     * post : 在routing 和 error过滤器之后被调用..所以post类型的过滤器可以对请求结果进行一些加工
     * error :处理请求发生错误时调用
     */
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    /*这个方法表示Filter执行的顺序，数值越小优先级越高。*/
    @Override
    public int filterOrder() {
        return 0;
    }

    /*该方法表示是否执行该过滤器，也可以说是该过滤器的一个开关。*/
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /*过滤器的具体逻辑。*/
    @Override
    public Object run() throws ZuulException {//编写过虑器拦截业务逻辑代码
        //获取项目上下文
        RequestContext ctx = RequestContext.getCurrentContext();
        //获取request对象
        HttpServletRequest request = ctx.getRequest();
        //设置请求头
        ctx.addZuulResponseHeader("Content-type", "text/json;charset=UTF-8");
        //设置编码
        ctx.getResponse().setCharacterEncoding("UTF-8");
        System.out.println("请求地址:"+request.getRequestURI());
        //获取token
        String token = request.getParameter("token");
        String msg="请求成功!";
        if(token==null) {
            //返回错误提示
            //false，不会继续往下执行，不会调用服务接口了，网关直接响应给客户了
            ctx.setSendZuulResponse(false);
            msg="请求失败！";
            //设置错误编码401
            ctx.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
            //设置返回信息
            ctx.setResponseBody(msg);
        }
        //否则正常执行 调用服务接口...
        return msg;
    }

    @Bean
    public TestZuulFilter zuulFilter() {
        return new TestZuulFilter();
    }

}
