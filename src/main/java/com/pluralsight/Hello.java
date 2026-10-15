package com.pluralsight;

public class Hello {
    public static void main(String[] args) {
        sayHello();
        sayGoodBye();
        sayGoodMorning();
    }

    public static void sayHello() {
        System.out.println("Hello, World!");
    }

    public static void sayGoodBye() {
        System.out.println("Goodbye!");
    }

    public static void sayGoodMorning() {
        System.out.println("Good morning!");
    }
}