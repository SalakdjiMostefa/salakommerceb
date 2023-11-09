package com.salakommerceb.common.exception;

/**
 * This exception is thrown when an object cannot be updated.
 */
public final class UpdateException extends ApplicationException {

    /**
     * Instantiates a new Update exception.
     *
     * @param message the message
     */
    public UpdateException(final String message) {
        super(message);
    }
}
