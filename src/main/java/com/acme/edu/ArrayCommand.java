package com.acme.edu;

public class ArrayCommand implements LoggerMessage {
    public static final String PREFIX_ARRAY = "primitives array: ";

    private int[] array;
    private StringBuilder message;

    public ArrayCommand(int[] array) {
        this.array = array;
        message = new StringBuilder("{");
        fillStringWithArray();
        message.append("}");
    }

    private void fillStringWithArray() {
        for (int num : array) {
            message.append(num + ", ");
        }
        message.delete(message.length() - 2, message.length());
    }

    @Override
    public String getMessage() {
        return PREFIX_ARRAY + message;
    }

    @Override
    public boolean isSameType(LoggerMessage currentState) {
        return false;
    }

    public void accumulate(LoggerMessage message) {

    }
}
