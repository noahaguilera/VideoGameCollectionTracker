import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class ProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();

        request.getRequestDispatcher("index.jsp").include(request, response);

        Cookie ck[]=request.getCookies();
        if(ck!=null){
            String userName=ck[1].getValue();
            if(!userName.equals("")||userName!=null){
                out.print("<b>Welcome to Profile</b>");
                out.print("<br>Welcome username, "+userName);
            }
        }else{
            out.print("Please login first");
            request.getRequestDispatcher("userlogin.jsp").include(request, response);
        }
        out.close();
    }
}  