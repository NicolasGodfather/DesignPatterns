package com.design.creational.factory_method.example1;

/**
 * Реализация
 *
 * @author Nicolas Asinovich.
 */
public class ConcreteCreatorA extends Creator {

    @Override
    public Product factoryMethod () {
        return new ConcreteProductA();
    }
}
