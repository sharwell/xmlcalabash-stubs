package com.deltaxml.core;

/**
 * @see <a href="http://docs.deltaxml.com/core/current/docs/api/com/deltaxml/core/ComparatorInstantiationException.html">
 * Class ComparatorInstantiationException</a>
 */
public class ComparatorInstantiationException extends PipelinedComparatorException {

    public ComparatorInstantiationException(String message) {
        super(message);
        throw new UnsupportedOperationException();
    }

    public ComparatorInstantiationException(Throwable t) {
        super(t);
        throw new UnsupportedOperationException();
    }

    public ComparatorInstantiationException(String message, Throwable t) {
        super(message, t);
        throw new UnsupportedOperationException();
    }

}
