import java.sql.*;

public class JDBC_insert {
    static final String DB_URL = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone = GMT";
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String USER = "root";
    static final String PASSWORD = "123456";

    public static void main(String[] args){
        Connection connection = null;
        PreparedStatement preparedStatement = null;   //预编译的preparedStatement对象
        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("connecting to select a database");
            connection = DriverManager.getConnection(DB_URL,USER,PASSWORD);
            System.out.println("connect to a database successfully");

            System.out.println("Inserting records into table");
            String sql = "insert into stu values (8,?,5)";
            preparedStatement = connection.prepareStatement(sql);  //sql语句填入preparedStatement对象
            preparedStatement.setString(1,"邹智俊");
            preparedStatement.executeUpdate();     //这里就不用再传sql了
            /*
            sql="insert into stu values (4,'邹智俊',8)";
            statement.executeUpdate(sql);
            */
            System.out.println("inserted successfully");
        } catch (ClassNotFoundException | SQLException e) {//处理class.forname和JDBC的错误
            e.printStackTrace();
        }
        finally {
            //用于关闭资源
            try {
                if(preparedStatement!=null){
                    preparedStatement.close();
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
