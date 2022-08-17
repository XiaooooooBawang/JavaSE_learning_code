import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connection_1 {
    public static void main(String[] args) throws Exception{
        //类加载进行驱动的注册,再使用DriverManager来连接（推荐使用）
        //1.数据库凭证
        String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone = GMT";
        String username = "root";
        String pwd = "123456";
        String sql = "select * from stu";
        //2.类加载进行驱动注册
        Class.forName("com.mysql.cj.jdbc.Driver");
        //3.DriverManager获取连接
        Connection connection = DriverManager.getConnection(url,username,pwd);
        System.out.println(connection);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);  //statement 执行静态sql语句并返回结果给resultSet处理
        while (resultSet.next()){
            System.out.println(resultSet.getString("user_name"));
        }
    }
}
