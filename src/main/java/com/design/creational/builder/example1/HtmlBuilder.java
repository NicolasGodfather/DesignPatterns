package com.design.creational.builder.example1;

/**
 * Realization
 *
 * @author Nicolas Asinovich.
 */
public class HtmlBuilder extends DocumentBuilder{

    @Override
    public void createHeader (String headerText) {
        super.text.append("<h1>");
        super.text.append(headerText);
        super.text.append("</h1>" + "\n");
    }

    @Override
    public void createParagraph (String parText) {
        super.text.append("<p1>");
        super.text.append(parText);
        super.text.append("</p1>"+ "\n");
    }
}
