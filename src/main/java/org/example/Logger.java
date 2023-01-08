package org.example;

import java.util.Date;

public class Logger {

    private static Logger instance = null;
    protected int num = 1;
    Date date = new Date();

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) instance = new Logger();
        return instance;
    }

    public void log(String msg) {
        System.out.println("[" + date + "] " + num++ + " - " + msg);
    }
}