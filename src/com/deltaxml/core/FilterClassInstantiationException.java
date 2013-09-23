package com.deltaxml.core;

/**
 * Thrown to indicate that a filter class instantiation problem has been
 * detected.
 *
 * <p>
 * SAX event filters implemented in Java need to be instantiated. A class,
 * rather than an object, is used as a parameter as in some cases two distinct
 * object instances are required, one for each comparator input. In the process
 * of creating the filter object exceptions such as
 * {@link InstantiationException} or {@link IllegalAccessException} may be
 * thrown. This exception class wraps these exceptions and also provides
 * information about possible aggregate indices, when use is made of filter
 * lists or arrays.</p>
 *
 * @see <a href="http://docs.deltaxml.com/core/current/docs/api/com/deltaxml/core/FilterClassInstantiationException.html">
 * Class FilterClassInstantiationException</a>
 */
public class FilterClassInstantiationException extends PipelinedComparatorException {

    public FilterClassInstantiationException(String message, Throwable t, Class<?> filterClass) {
        super(message, t);
        throw new UnsupportedOperationException();
    }

    public FilterClassInstantiationException(String message, Throwable t, Class<?> filterClass, int aggregatePosition) {
        super(message, t);
        throw new UnsupportedOperationException();
    }

    public FilterClassInstantiationException(String message, Throwable t, Class<?> filterClass, int aggregatePosition, PipelineIOIdentifier pipelineId) {
        super(message, t);
        throw new UnsupportedOperationException();
    }

    public PipelineIOIdentifier getLocationId() {
        throw new UnsupportedOperationException();
    }

    public Class<?> getFilterClass() {
        throw new UnsupportedOperationException();
    }

    public int getAggregatePosition() {
        throw new UnsupportedOperationException();
    }

}
