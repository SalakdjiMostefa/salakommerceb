package com.salakommerceb.common.exception;

/**
 * This exception is thrown when an object cannot be found.
 */
public class FinderException extends ApplicationException {

    /**
     * Instantiates a new Finder exception.
     */
    public FinderException() {
    }

    /**
     * Instantiates a new Finder exception.
     *
     * @param message the message
     */
    public FinderException(final String message) {
        super(message);
    }
}
