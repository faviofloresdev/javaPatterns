package org.patterns;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LaboratoryTest {

    private Laboratory lab;

    @BeforeEach
    void setUp() {
        lab = new Laboratory();
        lab.saveState("State 1");
        lab.saveState("State 2");
        lab.saveState("State 3");
    }

    @Test
    void testInitialState() {
        assertEquals("State 3", lab.getCurrentText(), "Must be the last state saved");
    }

    @Test
    void testUndoRestoresPreviousState() {
        lab.undo();
        assertEquals("State 2", lab.getCurrentText(), "Must undo the last state");

        lab.undo();
        assertEquals("State 1", lab.getCurrentText(), "Must restore the first state");

        lab.undo();
        assertEquals("", lab.getCurrentText(), "If not items must be empty");
    }

    @Test
    void testRevertToSpecificState() {
        lab.revertToState("State 1");
        assertEquals("State 1", lab.getCurrentText(), "Must revert at State 1");

        lab.undo();
        assertEquals("", lab.getCurrentText(), "Before revert, must be present one state");
    }

    @Test
    void testRevertToStateNotFoundDoesNothing() {
        lab.revertToState("State X");
        assertEquals("State 3", lab.getCurrentText(), "If the state is not present, not apply revert");
    }

    @Test
    void testSaveStateAddsNewSnapshot() {
        lab.saveState("State 4");
        assertEquals("State 4", lab.getCurrentText(), "The current state must be updated to the new one");
    }

}