package myFilter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter("/*")
public class MyFilter implements Filter {

    public MyFilter(){
        System.out.println("filter实例化");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter初始化");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        /*
        在Filter的doFilter方法内如果没有执行doFilter(request, response)方法，那么服务器中的资源是不会被访问到的。
         */
        System.out.println("过滤请求");
        //通过过滤器继续访问资源
        chain.doFilter(request, response);
        System.out.println("过滤响应");
    }

    @Override
    public void destroy() {
        System.out.println("销毁");
    }

}
