package com.deltaxml.core;

/**
 * @see <a href="http://docs.deltaxml.com/core/current/docs/api/com/deltaxml/core/UnsupportedSourceException.html">
 * Class UnsupportedSourceException</a>
 */
public class UnsupportedSourceException extends PipelinedComparatorException {

    public UnsupportedSourceException(String message, Class<?> suppliedClass) {
        super(message);
        throw new UnsupportedOperationException();
    }

    public UnsupportedSourceException(String message, Throwable t, Class<?> suppliedClass) {
        super(message, t);
        throw new UnsupportedOperationException();
    }

    public Class<?> getSuppliedClass() {
        throw new UnsupportedOperationException();
    }

}
