package org.codenova.talkhub.model.dao;

import com.mysql.cj.jdbc.Driver;
import org.codenova.talkhub.model.vo.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

/*
    user 테이블에 관련된 DB 작업을 처리하게 될거임.
 */
public class UserDAO {

    //1. 데이터 등록
    //  insert into user values(?, ?, ?, ?, ?, now() );
    public static boolean create(String id, String password, String nickname, String gender, int birth) {

        boolean result = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://database-1.c1sqywyu24kc.ap-northeast-2.rds.amazonaws.com:3306/talkhub",
                    "admin", "1q2w3e4r");

            PreparedStatement ps = connection.prepareStatement("insert into users values(?, ?, ?, ?, ?, now())");
            ps.setString(1, id);
            ps.setString(2, password);
            ps.setString(3, nickname);
            ps.setString(4, gender);
            ps.setInt(5, birth);

            int r = ps.executeUpdate();
            result = true;  //r값을 확인만하고 result 를 true 로 설정한 이유는 ?

            connection.close();
        } catch (Exception e) {
            System.out.println("UserDAO.create :" + e.toString());
        }
        return result;
    } // end boolean create(String id, String password, ....) ======================================


    public User findByuId(String specificId) {
        User one = null;



        return null;
    }
    public static User findById(String specificId) {
        User one = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://database-1.c1sqywyu24kc.ap-northeast-2.rds.amazonaws.com:3306/talkhub",
                                                                "admin", "1q2w3e4r");

            PreparedStatement ps = conn.prepareStatement("select * from users where id = ?");
            ps.setString(1, specificId);

            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                one = new User(
                    specificId,
                    rs.getString("password"),
                    rs.getString("nickname"),
                    rs.getString("gender"),
                    rs.getInt("birth"),
                    rs.getDate("created_at")
                );
            }
            conn.close();
        } catch (Exception e) {
            System.out.println("userDAO.create :" + e.toString());
        }
        return one;
    }


}
