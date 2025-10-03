package org.patterns;

import org.patterns.buscomp.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BancoFacade {

    static Logger log = LoggerFactory.getLogger(BancoFacade.class);

    private final Autenticacion objAutenticacion = new Autenticacion();
    private final Saldo objSaldo = new Saldo();
    private final Transferencia objTransferencia = new Transferencia();
    private final Notificacion objNotificacion = new Notificacion();
    private final Registro objRegistro = new Registro();

    public boolean transferir(String usuario, String destinatario, double monto) {
        if (!objAutenticacion.verificar(usuario)) {
            log.error("Usuario no autenticado.");
            return false;
        }

        if (!objSaldo.validar(usuario, monto)) {
            log.error("Saldo insuficiente.");
            return false;
        }

        objTransferencia.procesar(usuario, destinatario, monto);
        objNotificacion.enviarNotificacion(usuario, "Transferencia exitosa de $" + monto);
        objRegistro.registrar(usuario, destinatario, monto);

        log.info("Transferencia completada.");

        return true;
    }

}
