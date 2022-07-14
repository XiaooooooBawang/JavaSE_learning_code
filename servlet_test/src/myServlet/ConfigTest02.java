package myServlet;

import javax.servlet.*;
import java.io.IOException;

public class ConfigTest02 implements Servlet {
    private ServletConfig config;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("configtest02的init方法中ServletConfig:" + servletConfig);
        this.config = servletConfig;
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        // 获取ServletContext对象
        ServletContext application = this.config.getServletContext();
        System.out.println("ContextTest02:" + application);

        // 获取 web.xml 文件的中指定名称的上下文参数值
        String driver = application.getInitParameter("MySQLDriver");
        System.out.println(driver);

        //获取当前应用在 Web 容器中的名称
        String contextPath = application.getContextPath();
        System.out.println("contextPath:" + contextPath);

        // 获取当前 Web 应用中指定文件或目录在本地文件系统中的路径
        // 文件在硬盘中的绝对路径
        String realPath = application.getRealPath("FirstServlet");
        System.out.println("realPath:" + realPath);

        //向ServletContext中添加属性
        application.setAttribute("admin", "tiger");
        application.setAttribute("password", 123456);

        // 从 ServletContext 的域属性空间中删除指定名称的数据
        // 删除password属性
        application.removeAttribute("password");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
