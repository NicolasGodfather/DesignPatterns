package com.design.behavioral.command;

import java.util.Scanner;

/**
 * Realization класс запускающий выполнение.
 *
 * @author Nicolas Asinovich.
 */
public class Invoker {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        if (scanner.hasNext()){
            int num2 = scanner.nextInt();
            Client.getCommand(num2);
        }
    }
}
