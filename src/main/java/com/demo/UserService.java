package com.demo;

public class UserService {

    public String getUser() {
        return "Venkata Sai";
    }

    public static void main(String[] args) {

        UserService userService = new UserService();

        System.out.println(userService.getUser());
    }
}