package com.design.structural.decorator;

/**
 * Realization
 *
 * @author Nicolas Asinovich.
 */
public interface InterfaceComponent
{
    void doOperation();
    public static InterfaceComponent s = new InterfaceComponent()
    {
        @Override
        public void doOperation ()
        {

        }
    };
}
