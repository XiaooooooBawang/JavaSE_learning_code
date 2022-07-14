package myServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ResponseTest01")
public class ResponseTest01 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置post请求的字符编码，此方式只对post请求有效
        request.setCharacterEncoding("UTF-8");
        response.setHeader("Content-type","text/html;charset=UTF-8");
        //根据html中的name的名字获取用户在input中填写的value值
        String username = request.getParameter("username");

        //从response中取得PrintWriter对象
        PrintWriter out = response.getWriter();
        //向客户端发送数据
        out.print("用户：" + username + "添加成功！<br>");
        out.print("感谢您的注册");
        //关闭PrintWriter
        out.close();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}
