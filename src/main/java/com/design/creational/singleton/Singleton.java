package com.design.creational.singleton;

/**
 * Реализация ленивая несинхронизированная
 *
 * @author Nicolas Asinovich.
 */
public class Singleton {

    private static Singleton instance;
    private Singleton () {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
