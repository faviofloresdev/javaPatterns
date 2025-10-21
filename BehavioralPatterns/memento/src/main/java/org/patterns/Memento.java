package org.patterns;

public class Memento {

    private final String state;

    protected Memento(String state) {
        this.state = state;
    }
    protected String getState() {
        return state;
    }

}
