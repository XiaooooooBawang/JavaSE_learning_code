import java.sql.*;

public class JDBC_delete {
    static final String DB_URL = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone = GMT";
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String USER = "root";
    static final String PASSWORD = "123456";

    public static void main(String[] args){
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("connecting to select a database");
            connection = DriverManager.getConnection(DB_URL,USER,PASSWORD);
            System.out.println("connect to a database successfully");

            System.out.println("deleting records");
            statement = connection.createStatement();
            String sql = "delete from stu where id=8";
            statement.executeUpdate(sql);
            sql="select * from stu";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                Integer id = resultSet.getInt("id");
                String user_name = resultSet.getString("user_name");
                Integer age = resultSet.getInt("age");

                System.out.println("id:"+id+" user_name:"+user_name+" age:"+age);

            }
            resultSet.close();
        } catch (ClassNotFoundException | SQLException e) {//处理class.forname和JDBC的错误
            e.printStackTrace();
        }
        finally {
            //用于关闭资源
            try {
                if(statement!=null){
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (connection!=null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("goodbye");
        }
    }
}
