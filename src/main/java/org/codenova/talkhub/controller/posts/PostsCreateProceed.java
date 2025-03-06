package org.codenova.talkhub.controller.posts;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.codenova.talkhub.model.dao.PostsDAO;

import java.io.IOException;

@WebServlet("/post-create-proceed")
public class PostsCreateProceed extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String writerId = req.getParameter("writerId");
        String category = req.getParameter("category");
        String title = req.getParameter("title");
        String context = req.getParameter("context");

        boolean result = PostsDAO.create(
                writerId,
                category,
                title,
                context );
        if (result) {
            resp.sendRedirect(req.getContextPath() + "/list");
        }else {
            req.getRequestDispatcher("WEB-INF/views/posts/fail.jsp").forward(req, resp);
        }
    }
}
