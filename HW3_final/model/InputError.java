package model;

public class InputError extends Exception{
    private String message;

    public InputError(String message) {
        this.message = message;
    }

    public InputError() {
    }

    public String getMessage() {
        return message;
    }
}
