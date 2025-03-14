package org.codenova.talkhub.model.vo;

import java.util.Date;

public class User {
    private String id;
    private String password;
    private String nickname;
    private String gender;
    private int birth;
    private Date createAt;  // java.util.Date import


    // 기본생성자, 풀생성자, setter, getter


    public User() {
    }

    public User(String id, String password, String nickname, String gender, int birth, Date createAt) {
        this.id = id;
        this.password = password;
        this.nickname = nickname;
        this.gender = gender;
        this.birth = birth;
        this.createAt = createAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
