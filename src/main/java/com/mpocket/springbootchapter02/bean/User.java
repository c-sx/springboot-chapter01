package com.mpocket.springbootchapter02.bean;

import javax.validation.constraints.Pattern;
import java.io.Serializable;

public class User implements Serializable {
    public enum Grade {
        Freshman, Sophomore, Junior, Senior;
    }

    private static final long serialVersionUID = 1L;
    private Integer id;

    @Pattern(regexp = "(^[a-zA-Z0-9_-]{4,16}$)", message = "请输入4-16位字母或数字")
    private String username;

    @Pattern(regexp = "(^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{6,14}$)", message = "请输入6-14位字母或数字")
    private String password;

    @Pattern(regexp = "(^(?:[1-9][0-9]?|1[01][0-9]|120)$)", message = "请输入小于120数字")
    private String age;

    private Grade grade;

    @Pattern(regexp = "(^([A-Za-z0-9_\\-.])+@([A-Za-z0-9_\\-.])+\\.([A-Za-z]{2,4})$)", message = "请输入正确邮箱格式")
    private String email;

    @Pattern(regexp = "(^[1]([3-9])[0-9]{9}$)", message = "请输入正确电话号码")
    private String teleNum;


    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeleNum() {
        return teleNum;
    }

    public void setTeleNum(String teleNum) {
        this.teleNum = teleNum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
