package com.example;

public class App {

    public static final String MESSAGE = "Hello from Jenkins Maven CI!";

    public String getMessage() {
        return MESSAGE;
    }

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }
}
