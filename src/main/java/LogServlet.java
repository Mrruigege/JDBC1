import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
//登录验证与登录成功
@WebServlet(name = "log",urlPatterns = "/log")
public class LogServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        try {
            if(InquirySql.isExsit(name) == 0){
                request.setAttribute("err","用户名不存在");
                request.getRequestDispatcher("err.jsp").forward(request,response);
            }else if (InquirySql.isExsitpass(password) == 0){
                request.setAttribute("err","密码错误");
                request.getRequestDispatcher("err.jsp").forward(request,response);
            }else{
                response.sendRedirect("https://cqyyss.club");
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
