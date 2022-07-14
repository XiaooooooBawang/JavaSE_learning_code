package myServlet;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

public class ConfigTest01 implements Servlet {
    private ServletConfig config;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("configtest01的init方法中ServletConfig" + servletConfig);
        this.config = servletConfig;
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String userName = config.getInitParameter("userName");
        System.out.println("userName=" + userName);
        Enumeration<String> param = config.getInitParameterNames();

        while(param.hasMoreElements()){
            String name = param.nextElement();
            String value = config.getInitParameter(name);
            System.out.println(name + "=" +  value);
        }

        System.out.println("ServletName=" + config.getServletName());

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
