package com.DZkursovik;

public abstract class User {
    public String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
}