package com.design.structural.adapter.alpha_framework;

/**
 * AlphaListManager – класс фреймворка, метод которого createList создает объект типа AlphaList
 *
 * @author Nicolas Asinovich.
 */
public class AlphaListManager
{
    public static AlphaList createList()
    {
        //какой-то код по созданию объекта
        return new AlphaList()
        {
            @Override
            public void add (int value)
            {

            }

            @Override
            public void insert (int index, int value)
            {

            }

            @Override
            public int get (int index)
            {
                return 0;
            }

            @Override
            public void set (int index, int value)
            {

            }

            @Override
            public int count ()
            {
                return 0;
            }

            @Override
            public void remove (int index)
            {

            }
        };
    }
}
