package org.codenova.talkhub.controller.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.codenova.talkhub.model.dao.UserDAO;

import java.io.IOException;

@WebServlet("/join-proceed")
public class JoinProceedServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("id");
        String password = req.getParameter("password");
        String nickname = req.getParameter("nickname");
        String gender = req.getParameter("gender");
        int birth = Integer.parseInt(req.getParameter("birth"));

        boolean result = UserDAO.create(
                id,
                password,
                nickname,
                gender,
                birth);
        if (result) {
            resp.sendRedirect(req.getContextPath() + "/index");
        }else {
            req.getRequestDispatcher("WEB-INF/views/join-fail").forward(req, resp);
        }
    }
}
