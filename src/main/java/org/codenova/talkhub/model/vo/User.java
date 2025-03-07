package org.codenova.talkhub.model.vo;

import lombok.*;

import java.util.Date;

public class User {
    private String id;
    private String password;
    private String nickname;
    private String gender;
    private int birth;
    private Date createdAt;  // java.util.Date import


    // 기본생성자, 풀생성자, setter, getter

    @Setter
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public class PostsLike {
        private int id;
        private String userId;
        private int postId;
        private Date createdAt;
    }
}
