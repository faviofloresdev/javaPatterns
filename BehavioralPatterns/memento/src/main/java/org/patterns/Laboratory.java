package org.patterns;

import java.util.Deque;
import java.util.LinkedList;

public class Laboratory {

    private Deque<Memento> stateHistory;
    private InputText inputText;

    public Laboratory() {
        this.stateHistory = new LinkedList<>();
        this.inputText = new InputText();
    }

    public void saveState(String state) {
        this.inputText.setText(state);
        stateHistory.push(inputText.takeSnapshot());
    }

    public void undo() {
        if (stateHistory.isEmpty()) throw new IllegalStateException("NOT ITEMS TO UNDO");
        stateHistory.pop();
        if (stateHistory.isEmpty()) {
            inputText.setText("");
            return;
        }
        Memento prev = stateHistory.peek();
        inputText.restore(prev);
    }

    public void revertToState(String state) {

        for (Memento m : stateHistory) {
            if (m.getState().equals(state)) {
                inputText.restore(m);
                while (stateHistory.peek() != m) {
                    stateHistory.pop();
                }
                break;
            }
        }
    }

    public String getCurrentText() {
        return inputText.getText();
    }

}
