package myServlet;

import javax.servlet.*;
import java.io.IOException;

public class SimpleServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("SimpleServlet继承自GenericServlet");
    }
}
