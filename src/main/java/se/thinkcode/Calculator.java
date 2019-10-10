package se.thinkcode;

public class Calculator implements Listener {
    private String message;

    public String getMessage() {
        return message;
    }

    @Override
    public void receiveMessage(String message) {
        this.message = message;
    }
}
