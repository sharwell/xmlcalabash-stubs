package com.deltaxml.core;

/**
 * Indicates an error condition in the {@link PipelinedComparator}.
 *
 * <p>
 * This class is the super-class of most of the <em>checked</em> exceptions
 * thrown by the {@link PipelinedComparator} methods. As such it could be used
 * for simplified, coarse-grain catch or throws clauses.</p>
 *
 * @see <a href="http://docs.deltaxml.com/core/current/docs/api/com/deltaxml/core/PipelinedComparatorException.html">
 * Class PipelinedComparatorException</a>
 */
public class PipelinedComparatorException extends DeltaXMLException {

    public PipelinedComparatorException(String message) {
        super(message);
        throw new UnsupportedOperationException();
    }

    public PipelinedComparatorException(Throwable e) {
        super(e);
        throw new UnsupportedOperationException();
    }

    public PipelinedComparatorException(String message, Throwable e) {
        super(message, e);
        throw new UnsupportedOperationException();
    }

}
