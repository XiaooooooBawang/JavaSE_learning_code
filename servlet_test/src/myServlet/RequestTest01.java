package myServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

// 这里用@WebServlet注解就可以注册映射路径，不需要在web.xml中手动注册
// 如果用了注解就不能再在web.xml中再注册了，不然会路径冲突而出错
@WebServlet("/RequestTest01")
public class RequestTest01 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //根据html中的name的名字获取用户在input中填写的值
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //获取用户勾选的checkbox的值
        String[] hobby = request.getParameterValues("hobby");

        System.out.println(username);
        System.out.println(password);
        for(String s:hobby){
            System.out.println(s);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}
