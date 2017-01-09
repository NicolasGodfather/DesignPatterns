package com.design.structural.adapter.beta_framework;

/**
 * Realization BetaList – это один из интерфейсов,
 * для взаимодействия кода фреймворка и кода, который будет использовать этот фреймворк.
 *
 * @author Nicolas Asinovich.
 */
public interface BetaList
{
    int getValue(int index);
    void setValue(int index, int value);
    int getSize();
    void setSize(int newSize);
}
