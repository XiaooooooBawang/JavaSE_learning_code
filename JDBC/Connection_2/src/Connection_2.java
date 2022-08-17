import java.sql.*;
import java.util.Properties;

public class Connection_2 {
    public static void main(String[] args) throws SQLException {
        //创建驱动
        Driver driver = new com.mysql.cj.jdbc.Driver();
        String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone = GMT";
        String sql = "select * from stu";
        //用properties配置文件来管理数据库凭证
        Properties properties = new Properties();
        properties.setProperty("user","root");
        properties.setProperty("password","123456");
        Connection connection = driver.connect(url,properties);   //驱动获取连接
        System.out.println(connection);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);    //statement 执行静态sql语句并返回结果给resultSet处理
        while (resultSet.next()){
            System.out.println(resultSet.getString("user_name"));
        }
    }
}
