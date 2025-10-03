package org.patterns;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BancoFacadeTest {

    private BancoFacade banco;

    @BeforeEach
    void setUp() {
        banco = new BancoFacade();
    }

    @Test
    void transferenciaExitosa() {
        assertTrue(banco.transferir("Usuario123", "Usuario456", 200.0));
    }

}