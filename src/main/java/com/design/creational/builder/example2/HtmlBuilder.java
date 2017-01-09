package com.design.creational.builder.example2;

/**
 * Realization
 *
 * @author Nicolas Asinovich.
 */
public class HtmlBuilder implements DocumentBuilder {

    @Override
    public void createHeader (String headerText) {
        text.append("<h1>");
        text.append(headerText);
        text.append("</h1>" + "\n");
    }

    @Override
    public void createParagraph (String parText) {
        text.append("<p1>");
        text.append(parText);
        text.append("</p1>"+ "\n");
    }

    @Override
    public void createBody (String bodyText) {
        text.append("<body>");
        text.append(bodyText);
//        createParagraph();
        text.append("</body>"+ "\n");
    }

    @Override
    public String toString () {
        return text.toString();
    }
}
