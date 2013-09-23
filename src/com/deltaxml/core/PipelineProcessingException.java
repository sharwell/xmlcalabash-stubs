package com.deltaxml.core;

/**
 * @see <a href="http://docs.deltaxml.com/core/current/docs/api/com/deltaxml/core/PipelineProcessingException.html">
 * Class PipelineProcessingException</a>
 */
public class PipelineProcessingException extends PipelinedComparatorException {

    public PipelineProcessingException(String message) {
        super(message);
        throw new UnsupportedOperationException();
    }

    public PipelineProcessingException(Throwable t) {
        super(t);
        throw new UnsupportedOperationException();
    }

    public PipelineProcessingException(String message, Throwable t) {
        super(message, t);
        throw new UnsupportedOperationException();
    }

}
