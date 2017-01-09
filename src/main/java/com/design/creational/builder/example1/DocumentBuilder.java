package com.design.creational.builder.example1;

/**
 * Realization применяется когда нужно создать на основе исходных
 * данных сложный составной объект.
 * Нипримаер конвертация из формата doc в html.
 * @author Nicolas Asinovich.
 */
public abstract class DocumentBuilder {

    StringBuilder text = new StringBuilder();
    public abstract void createHeader(String headerText);
    public abstract void createParagraph(String headerText);

    @Override
    public String toString () {
        return text.toString();
    }
}
