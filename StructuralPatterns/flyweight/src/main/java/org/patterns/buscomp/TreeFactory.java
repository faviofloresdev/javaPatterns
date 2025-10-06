package org.patterns.buscomp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

    static Logger log = LoggerFactory.getLogger(TreeFactory.class);

    private static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String texture) {
        String key = name + "-" + color + "-" + texture;
        TreeType result = treeTypes.get(key);
        if (result == null) {
            result = new TreeType(name, color, texture);
            treeTypes.put(key, result);
            log.info("Creando nuevo TreeType: {}", key);
        }
        return result;
    }

}
