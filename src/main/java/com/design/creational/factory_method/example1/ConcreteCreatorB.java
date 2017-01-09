package com.design.creational.factory_method.example1;

/**
 * Реализация
 *
 * @author Nicolas Asinovich.
 */
public class ConcreteCreatorB extends Creator {

    @Override
    public Product factoryMethod () {
        return new ConcreteProductB();
    }
}
