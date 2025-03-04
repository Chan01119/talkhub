package org.codenova.talkhub.controller.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.codenova.talkhub.model.dao.UserDAO;
import org.codenova.talkhub.model.vo.User;

import java.io.IOException;

@WebServlet("/login-proceed")
public class LoginProceedServlet extends HttpServlet {
    @Override
    protected void service(
            HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String password = req.getParameter("password");


        User found = UserDAO.findById(id);

        if (found == null) {
            // id에 해당하는 정보가 없다.
            req.getRequestDispatcher("WEB-INF/views/users/login-fail.jsp").forward(req, resp);
        }else {
            if(found.getPassword().equals(password)) {
                // 인증성공
                resp.sendRedirect(req.getContextPath() + "/index");
            }else {
                //인증실패
                req.getRequestDispatcher("WEB-INF/views/users/login-fail.jsp").forward(req, resp);
            }
        }
    }
}
