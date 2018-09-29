import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
//注册时验证和插入
@WebServlet(name = "insert",urlPatterns = "/insert")
public class insertServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        PrintWriter out = response.getWriter();
        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");
        try {
            if(InquirySql.isExsit(name) == 0) {
                Connection conn = Cmysql.getConnection();
                InsertSql.insertSQL(name, password);
                conn.close();
                out.println("ok,3秒跳转");
                response.setHeader("Refresh","3;loging.jsp");
            }else {
                response.sendRedirect("existP.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
