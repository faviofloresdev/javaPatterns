package org.patterns.buscomp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Autenticacion {

    static Logger log = LoggerFactory.getLogger(Autenticacion.class);

    public boolean verificar(String usuario) {

        log.debug("Verificando autenticación para: {}", usuario);

        if(!usuario.equals("Usuario123")){
            log.debug("Credenciales invalidas.");
            return false;
        }

        return true;
    }

}
