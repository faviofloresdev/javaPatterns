package org.patterns.buscomp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Transferencia {

    static Logger log = LoggerFactory.getLogger(Registro.class);

    public void procesar(String origen, String destino, double monto) {
        log.debug("Transfiriendo ${} de {} a {}", monto, origen, destino);
    }

}
