package org.codenova.talkhub.model.dao;

import org.codenova.talkhub.model.vo.Posts;
import org.codenova.talkhub.util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;

public class PostsDAO {

    public static boolean create(

            String writerId,
            String category,
            String title,
            String context
            ) {

        boolean result = false;
        try {
            Connection conn = ConnectionFactory.open();

            PreparedStatement ps = conn.prepareStatement("insert into posts values (null, ?, ?, ?, ?, 0, 0, now(), now())");
            ps.setString(1, writerId);
            ps.setString(2, category);
            ps.setString(3, title);
            ps.setString(4, context);

            int r = ps.executeUpdate();
            result = true;

            conn.close();
        } catch (Exception e) {
            System.out.println("PostsDAO.create :" + e.toString());
        }
        return result;
    } // end boolean create===============================


}
