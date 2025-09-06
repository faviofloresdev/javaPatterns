package org.patterns;

public class Singleton {

    // Unique static instance
    private static Singleton instance;

    // Private constructor to prevent external instantiation
    private Singleton() {}

    // Global access point to the Singleton
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }

    // Example method
    public String sayHello() {
        return "Hello from Singleton";
    }
}
