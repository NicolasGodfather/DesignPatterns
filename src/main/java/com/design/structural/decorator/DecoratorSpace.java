package com.design.structural.decorator;

/**
 * Realization
 *
 * @author Nicolas Asinovich.
 */
class DecoratorSpace extends Decorator{

    public DecoratorSpace(InterfaceComponent c) {
        super(c);
    }

    @Override
    public void doOperation() {
        System.out.print(" ");
        super.doOperation();
    }

    @Override
    public void newOperation() {
        System.out.println("New space operation");
    }
}
