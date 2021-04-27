import entity.User;
import persistence.UserDao;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();

        request.getRequestDispatcher("index.jsp").include(request, response);

        String name=request.getParameter("name");
        String password=request.getParameter("password");

        UserDao userDao = new UserDao();
        List<User> user = userDao.getByPropertyEqual("userName", name);
        String userPassword = user.get(0).getPassword();


        if(password.equals(userPassword)){
            out.print("You are successfully logged in!");
            out.print("<br>Welcome, "+name);

            Cookie ck=new Cookie("userName",name);
            response.addCookie(ck);
        }else{
            out.print("sorry, username or password error!");
            request.getRequestDispatcher("userlogin.jsp").include(request, response);
        }

        out.close();
    }

}