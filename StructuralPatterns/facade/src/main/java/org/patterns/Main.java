package org.patterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        BancoFacade banco = new BancoFacade();
        banco.transferir("Usuario123", "Usuario456", 100.0);

    }
}