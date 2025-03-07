package org.codenova.talkhub.controller.posts;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.codenova.talkhub.model.dao.PostsDAO;

import java.io.IOException;

@WebServlet("/like-proceed")
public class LikeProceed extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        PostsDAO dao = new PostsDAO();
        dao.increaseLikeById(id);

        resp.sendRedirect(req.getContextPath() + "/posts/view?id=" +id);
    }
}
