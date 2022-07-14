package myServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/Forward01")
public class Forward01 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置字符编码
        request.setCharacterEncoding("UTF-8");
        //获取请求参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        request.setAttribute("username", username);
        request.setAttribute("password", password);

        //转发到 Other servlet
        request.getRequestDispatcher("Other").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
