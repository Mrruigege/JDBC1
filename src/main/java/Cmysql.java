import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//创建数据库连接
public class Cmysql {
    private static final String DATABASE_DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://120.78.183.227:3306/gc";
    private static final String USER = "root";
    private static final String PASSWORD = "aa123456";
    private static   Connection conn = null;
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(DATABASE_DRIVER);
        conn = DriverManager.getConnection(URL, USER, PASSWORD);
        return conn;
    }

}
