package com.salakommerceb.common.exception;

/**
 * This exception is throw when a general problem occurs in the persistent layer.
 */
public final class DataAccessException extends RuntimeException {

    /**
     * Instantiates a new Data access exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public DataAccessException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
