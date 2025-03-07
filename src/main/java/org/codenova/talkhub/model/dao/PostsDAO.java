package org.codenova.talkhub.model.dao;

import org.codenova.talkhub.model.vo.Posts;
import org.codenova.talkhub.util.ConnectionFactory;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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


    public static List<Posts> selectPosts() {
        List<Posts> list = new ArrayList<>();

        try {
            Connection conn = ConnectionFactory.open();
            PreparedStatement ps = conn.prepareStatement("select * from Posts order by id asc");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Posts posts = new Posts(rs.getInt("id"),
                        rs.getString("writer_id"),
                        rs.getString("category"),
                        rs.getString("title"),
                        rs.getString("context"),
                        rs.getInt("views"),
                        rs.getInt("likes"),
                        rs.getDate("writed_at"),
                        rs.getDate("modified_at"));

                list.add(posts);
            }
            conn.close();
        } catch (Exception e) {

        }
        return list;
    }

    // 좋회수 증가 (By Id)
    public static boolean updateViews(int postsId) {
        boolean result = false;

        /* try with resources statement */
        try (Connection conn = ConnectionFactory.open()) {
            PreparedStatement ps = conn.prepareStatement("update posts set views = views + 1 where id = ?");
            ps.setInt(1, postsId);
            int r = ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("UserDAO.create :" + e.toString());
        }
        return result;
    }
}