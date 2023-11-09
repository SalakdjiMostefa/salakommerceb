package com.salakommerceb.common.exception;

/**
 * This exception is thrown when some checking validation error is found.
 */
public final class CheckException extends ApplicationException {

    /**
     * Instantiates a new Check exception.
     *
     * @param message the message
     */
    public CheckException(final String message) {
        super(message);
    }
}
