package com.design.behavioral.command;

/**
 * Realization
 *
 * @author Nicolas Asinovich.
 */
public class Client {
    private static Command command;

    public static Command getCommand(int n){
        if (n == 1) {
            command = new MonCommand();
        } else if(n == 2) {
            command = new TuCommand();
        }
        command.execute();
        return command;
    }
}
