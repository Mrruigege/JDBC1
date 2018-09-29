import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//查询用户名和密码是否存在
public class InquirySql {
    private static PreparedStatement pst = null;
    private static ResultSet rs = null;

    public static int isExsit(String name) throws SQLException, ClassNotFoundException {
        String check = "select name from person ";
        pst = Cmysql.getConnection().prepareStatement(check);
        rs = pst.executeQuery();
        while (rs.next()){
            String Rname = rs.getString("name");
            if (name.equals(Rname)) {
                return 1;
            }
        }
        pst.close();
        rs.close();
        return 0;
    }
    public static int isExsitpass(String password) throws SQLException, ClassNotFoundException {
        String check = "select passworld from person ";
        pst = Cmysql.getConnection().prepareStatement(check);
        rs = pst.executeQuery();
        while (rs.next()){
            String pass = rs.getString("passworld");
            if (password.equals(pass)) {
                return 1;
            }
        }
        pst.close();
        rs.close();
        return 0;
    }
}
