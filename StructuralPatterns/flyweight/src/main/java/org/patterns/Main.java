package org.patterns;

import org.patterns.buscomp.Forest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        Forest forest = new Forest();

        // Plantar muchos árboles pero compartiendo el mismo TreeType
        forest.plantTree(1, 2, "Roble", "Verde", "Áspera");
        forest.plantTree(3, 4, "Roble", "Verde", "Áspera");
        forest.plantTree(5, 6, "Pino", "Verde Oscuro", "Lisa");
        forest.plantTree(7, 8, "Pino", "Verde Oscuro", "Lisa");

        // Dibujar todos los árboles
        forest.draw();

    }
}