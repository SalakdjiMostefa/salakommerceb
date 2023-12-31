package com.salakommerceb.common.exception;

/**
 * This abstract exception is the superclass of all application exception.
 * It is a checked exception because it extends the Exception class.
 */
public abstract class ApplicationException extends Exception {

    /**
     * Instantiates a new Application exception.
     */
    protected ApplicationException() {
    }

    /**
     * Instantiates a new Application exception.
     *
     * @param message the message
     */
    protected ApplicationException(final String message) {
        super(message);
    }
}
