import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
//插入数据库
public class InsertSql {
    private static PreparedStatement pst = null;
    //private static ResultSet rs = null;
    public static void insertSQL (String name,String password) throws SQLException, ClassNotFoundException {
        String insert = "insert into person value(?,?)";
        pst = Cmysql.getConnection().prepareStatement(insert);
        pst.setString(1,name);
        pst.setString(2,password);
        pst.executeUpdate();
        pst.close();
    }
}
