package com.design.creational.singleton;

/**
 * Реализация
 *
 * @author Nicolas Asinovich.
 */
public class SingletonSync {

    private static volatile SingletonSync instance;

    private SingletonSync() {}

    public static SingletonSync getInstance() {
        SingletonSync localInstance = instance;
        if (localInstance == null) {
            synchronized (SingletonSync.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new SingletonSync();
                }
            }
        }
        return localInstance;
    }
}
