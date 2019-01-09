package com.example;

/**
 * 描述:创建USER持久化类
 * 作用:以满足JavaBean规范需求
 * @Author: mzy
 * @Date: 2019-1-9 14:23
 */
public class User {
    private int id;//编号id属性
    private String username;//编号username属性
    private String password;
    private String email;

    /**
     * 描述:user类的构造函数
     * 作用:初始化对象
     * 是否必须:yes
     **/
    public User(){}

    /**
     * 描述:属性ID的get方法
     **/
    public int getId() {
        return id;
    }
    /**
     * 描述:属性ID的set方法
     **/
    public void setId(int id) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
