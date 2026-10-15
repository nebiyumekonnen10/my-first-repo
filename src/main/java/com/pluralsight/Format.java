package com.pluralsight;

public class Format {
    public static void main(String[] args) {

        System.out.println(formatName("Nebiyu", "Mekonnen"));

        String formatted = formatName("David", "Michel");
        System.out.println(formatted);
    }

    public static String formatName(String first, String last) {
        return last + ", " + first;
    }
}