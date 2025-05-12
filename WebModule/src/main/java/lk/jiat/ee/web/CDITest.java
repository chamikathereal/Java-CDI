package lk.jiat.ee.web;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lk.jiat.ee.ejb.remote.Appsetting;
import lk.jiat.ee.ejb.remote.UserRegistration;

import java.io.IOException;

@WebServlet("/cdi-test")
public class CDITest extends HttpServlet {

    @EJB
    Appsetting appsetting;

    @EJB
    UserRegistration userRegistration;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.getWriter().write(appsetting.getName() + " " + appsetting.getVersion());
        userRegistration.registerUser("Chamika", "Gayashan","chamika@gmail.com","1234");
    }
}
