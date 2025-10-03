package org.patterns.buscomp;

import org.patterns.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Registro {

    static Logger log = LoggerFactory.getLogger(Registro.class);

    public void registrar(String origen, String destino, double monto) {
        log.debug("Registrando transacción: {} -> {} por ${}", origen, destino, monto);
    }

}
