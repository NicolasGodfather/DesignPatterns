package com.design.creational.builder.example2;

/**
 * Realization применяется когда нужно создать на основе исходных
 * данных сложный составной объект.
 *
 *
 * @author Nicolas Asinovich.
 */
public interface DocumentBuilder {

    StringBuilder text = new StringBuilder();
    void createHeader(String headerText);
    void createParagraph(String headerText);
    void createBody(String bodyText);

}
