package myServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Cookie的手动绑定路径
 * 这里手动绑定至/cookietest
 * 当再次访问路径包含以上资源路径的url时，会自动将cookie放到请求头中向服务器发出请求
 */

@WebServlet("/cookietest/CookieTest02")
public class CookieTest02 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //创建cookie
        Cookie cookie1 = new Cookie("username","monkey");
        Cookie cookie2 = new Cookie("password","123");

        //手动设置绑定路径
        cookie1.setPath("/cookietest");
        cookie2.setPath("/cookietest");

        //设置cookie的失效时间,单位为秒，整型
        //cookie1.setMaxAge(60 * 60);//一小时
        //cookie2.setMaxAge(60 * 60 * 24);//一天

        //将Cookie添加到响应中
        response.addCookie(cookie1);
        response.addCookie(cookie2);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
