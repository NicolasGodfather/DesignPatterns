package com.design.structural.decorator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Observable;

/**
 * Realization
 *
 * @author Nicolas Asinovich.
 */
public class Main extends Observable
{
    public static void main (String... s) {
        Decorator c = new DecoratorHello(new DecoratorComma(new DecoratorSpace(new MainComponent())));
        c.doOperation(); // Результат выполнения программы "Hello, World!"
        c.newOperation(); // New hello operation

        Decorator c2 = new DecoratorSpace(new DecoratorHello(new DecoratorComma(new MainComponent())));
        c2.doOperation();
        c2.newOperation();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Observable ob;
    }

    public enum Factory {
        PROXY
    }
}
