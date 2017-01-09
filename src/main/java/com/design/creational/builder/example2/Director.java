package com.design.creational.builder.example2;

/**
 * Realization
 *
 * @author Nicolas Asinovich.
 */
public class Director {
    public static void main (String[] args) {
        DocumentBuilder builder = new HtmlBuilder();
        builder.createHeader("1-head");
        builder.createParagraph("1-par");
        builder.createHeader("2-head");
        builder.createParagraph("2-par");
        String result = builder.toString();
        System.out.println(result);
    }
}
