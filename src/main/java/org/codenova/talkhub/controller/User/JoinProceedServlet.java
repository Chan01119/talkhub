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

        boolean hasError = false;

        //검증절차가 필요하면 하면 되고,
        String id = req.getParameter("id");
        if (id.length() <= 4) {
            hasError = true;
            req.setAttribute("idError", "아이디는 4글자 이상입니다.");
        }
        String password = req.getParameter("password");
        if (password.length() <6) {
            hasError =true;
            req.setAttribute("passwordError", "비밀번호는 6글자 이상입니다");
        }
        String nickname = req.getParameter("nickname");

        String gender = req.getParameter("gender");
        int birth = Integer.parseInt(req.getParameter("birth"));

        if (hasError) {
            req.getRequestDispatcher("WEB-INF/views/user/join-fail.jsp").forward(req, resp);
        }else {
            UserDAO userDAO = new UserDAO();
            //userDAO.findById(id);
            boolean r = userDAO.create(id, password, nickname, gender, birth);

            if (r) {
                resp.sendRedirect(req.getContextPath() + "/index");
            }else {
                req.getRequestDispatcher("WEB-INF/views/user/join-fail.jsp").forward(req, resp);
            }
        }

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
