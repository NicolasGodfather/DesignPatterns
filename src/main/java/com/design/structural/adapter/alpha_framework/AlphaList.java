package com.design.structural.adapter.alpha_framework;

/**
 *  Код из первого(Alpha) фреймворка.
 *  AlphaList – это один из интерфейсов, для взаимодействия кода фреймворка и кода,
 *  который будет использовать этот фреймворк.
 *
 * @author Nicolas Asinovich.
 */
public interface AlphaList
{
    void add(int value);
    void insert(int index, int value);
    int get(int index);
    void set(int index, int value);
    int count();
    void remove(int index);
}
