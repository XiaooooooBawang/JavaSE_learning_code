package myServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Cookie的默认绑定路径
 * 默认绑定到上一级路径/my_servlet_test
 * 当再次访问路径包含以上资源路径的url时，会自动将cookie放到请求头中向服务器发出请求
 */
@WebServlet("/CookieTest01")
public class CookieTest01 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //创建cookie，第一个参数类似map的key，第二个参数类似map的value，不能存中文
        Cookie cookie1 = new Cookie("username","monkey1024");
        Cookie cookie2 = new Cookie("password","123456");

        //将Cookie添加到响应中
        response.addCookie(cookie1);
        response.addCookie(cookie2);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
