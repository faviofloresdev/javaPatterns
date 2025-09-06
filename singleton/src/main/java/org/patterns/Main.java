package org.patterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        log.info("Instance {} saying {}", obj1.hashCode(),  obj1.sayHello());
        log.info("Instance {} saying {}", obj2.hashCode(),  obj2.sayHello());

    }
}