package am.aca.ITFinder.servlets;

import am.aca.ITFinder.comman.exception.MyException;
import am.aca.ITFinder.comman.model.User;
import am.aca.ITFinder.repository.implementation.UserRepositoryImpl;
import com.sun.corba.se.spi.protocol.RequestDispatcherDefault;
import com.sun.javaws.exceptions.InvalidArgumentException;

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
import java.util.Random;

/**
 * Created by Armen on 10/24/2016.
 */
@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User regUser = new User();
        resp.setContentType("text/html;charset=UTF-8");
        Random randomIdGenerator = new Random();

        regUser.setID(randomIdGenerator.nextInt(10000000));
        regUser.setFirstName(req.getParameter("first_name"));
        regUser.setLastName(req.getParameter("last_name"));
        regUser.seteMail(req.getParameter("login"));
        regUser.setPassword(req.getParameter("password"));
        regUser.setAbout(req.getParameter("about"));


        try {
            boolean isSignUpUser = false;
            if (UserRepositoryImpl.getInstance().getUser(regUser.geteMail())) {
                isSignUpUser = true;
            }
            if (!isSignUpUser) {
                UserRepositoryImpl.getInstance().addUser(regUser);
                req.getSession().setAttribute("currentSessionUser", regUser);
                RequestDispatcher rs = req.getRequestDispatcher("afterSignIn.jsp");
                rs.forward(req, resp);
            } else {
                RequestDispatcher rs = req.getRequestDispatcher("index.jsp");
                rs.include(req, resp);

                }
                } catch (SQLException e) {
                e.printStackTrace();
                } catch (MyException e) {
            e.printStackTrace();
        }
    }
}

