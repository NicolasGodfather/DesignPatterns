package com.design.creational.builder;

/**
 *  StringBuffer реализует шаблон Builder. Методы append(...), insert(...),
 *  delete(...) позволяют конструировать необходимую строку, а метод toString() создает ее.
 *
 * @author Nicolas Asinovich.
 */
public class MyBuffer
{
    public static void main (String[] args)
    {
        StringBuilder s = new StringBuilder();
        s.append("Hello").append(" world!");
        System.out.println(s);
    }
}
