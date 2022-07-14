package myServlet;

import javax.servlet.*;
import java.io.IOException;

public class ConfigTest03 implements Servlet {
    private ServletConfig config;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config = servletConfig;
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        // 获取ServletContext对象，可发现Context03与Context02的application是同一个
        ServletContext application = this.config.getServletContext();
        System.out.println("Context03中的application:" + application);

        // 从 ServletContext 的域属性空间中获取指定名称的数据
        String admin = (String)application.getAttribute("admin");
        System.out.println(admin);
        String password = (String)application.getAttribute("password");
        System.out.println(password);
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
