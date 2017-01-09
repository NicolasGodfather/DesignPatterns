package com.design.structural.decorator;

/**
 * Realization
 *
 * @author Nicolas Asinovich.
 */
class MainComponent implements InterfaceComponent {

    @Override
    public void doOperation() {
        System.out.print("World!");
    }
}
