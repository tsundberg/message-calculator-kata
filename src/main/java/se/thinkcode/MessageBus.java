package se.thinkcode;

import java.util.ArrayList;
import java.util.List;

public class MessageBus {
    private List<Listener> listeners = new ArrayList<>();

    public void addListener(Listener listener) {
        listeners.add(listener);
    }

    public void sendMessage(String message) {
        for (Listener listener : listeners) {
            listener.receiveMessage(message);
        }
    }
}
