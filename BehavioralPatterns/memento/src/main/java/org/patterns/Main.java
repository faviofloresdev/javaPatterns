package org.patterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        Laboratory lab = new Laboratory();

        lab.saveState("State 1");
        lab.saveState("State 2");
        lab.saveState("State 3");
        lab.saveState("State 4");
        lab.saveState("State 5");

        log.info("Current state: {} ", lab.getCurrentText());

        lab.undo();
        lab.undo();

        log.info("Current state: {} ", lab.getCurrentText());

        lab.revertToState("State 2");

        log.info("Revert to: {}", lab.getCurrentText());

    }
}