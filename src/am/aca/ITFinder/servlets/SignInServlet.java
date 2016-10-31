package am.aca.ITFinder.servlets;

import am.aca.ITFinder.comman.exception.MyException;
import am.aca.ITFinder.comman.model.User;
import am.aca.ITFinder.repository.implementation.UserRepositoryImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

/**
 * Created by Armen on 10/29/2016.
 */
@WebServlet("/SignInServlet")
public class SignInServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        String login=req.getParameter("e-mail");
        String password=req.getParameter("password");

        try {
         User user = UserRepositoryImpl.getInstance().getUser(login,password);

            if(user != null){
                HttpSession httpServlet = (HttpSession) req.getSession();
                httpServlet.setAttribute("User", login);
                httpServlet.setAttribute("User", password);
                RequestDispatcher requestDispatcher=req.getRequestDispatcher("afterSignIn.jsp");
                requestDispatcher.forward(req,resp);

            }else{

                RequestDispatcher requestDispatcher=req.getRequestDispatcher("index.jsp");
                requestDispatcher.forward(req,resp);
            }
        } catch (MyException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
