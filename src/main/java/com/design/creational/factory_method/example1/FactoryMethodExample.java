package com.design.creational.factory_method.example1;

/**
 * Реализация
 *
 * @author Nicolas Asinovich.
 */
public class FactoryMethodExample {

    public static void main (String[] args) {

        Creator [] creators = {new ConcreteCreatorA(), new ConcreteCreatorB()};
        for (Creator creator : creators) {
            Product product = creator.factoryMethod();
            System.out.printf("Created {%s}\n", product.getClass());
        }
    }
}
