package com.salakommerceb.common.exception;

/**
 * This exception is thrown when an object cannot be deleted.
 */
public final class RemoveException extends ApplicationException {

    /**
     * Instantiates a new Remove exception.
     *
     * @param message the message
     */
    public RemoveException(final String message) {
        super(message);
    }
}
