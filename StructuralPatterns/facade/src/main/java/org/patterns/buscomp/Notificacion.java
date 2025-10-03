package org.patterns.buscomp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Notificacion {

    static Logger log = LoggerFactory.getLogger(Notificacion.class);

    public void enviarNotificacion(String usuario, String mensaje) {
        log.debug("Enviando notificación a {}: {}", usuario, mensaje);
    }

}
