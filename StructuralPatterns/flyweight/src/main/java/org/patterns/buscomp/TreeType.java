package org.patterns.buscomp;

import org.patterns.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TreeType {

    static Logger log = LoggerFactory.getLogger(TreeType.class);

    private String name;
    private String color;
    private String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(int x, int y) {
        log.info("Dibujando árbol de tipo " + name +
                " en (" + x + "," + y + ") con color " + color +
                " y textura " + texture);
    }

}
