package org.patterns.buscomp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Saldo {

    static Logger log = LoggerFactory.getLogger(Saldo.class);


    public boolean validar(String usuario, double monto) {
        log.debug("Validando saldo para: {} por ${}", usuario, monto);
        return monto <= 1000.0; // Simulación: saldo máximo de 1000
    }

}
