package com.salakommerceb.common.exception;

/**
 * This exception is thrown when an object cannot be created.
 */
public class CreateException extends ApplicationException {

    /**
     * Instantiates a new Create exception.
     */
    public CreateException() {
    }

    /**
     * Instantiates a new Create exception.
     *
     * @param message the message
     */
    public CreateException(final String message) {
        super(message);
    }
}
