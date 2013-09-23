package com.deltaxml.core;

import java.lang.reflect.InvocationTargetException;

/**
 * Thrown to indicate that a filter parameterization problem has been detected.
 *
 * <p>
 * In order to set parameters on Java filters, they should be coded to provide
 * methods which allow parameter setting. The methods should have a name which
 * is comprised of "set" concatenated with the parameter name and they should
 * take a single {@link String} parameter.</p>
 *
 * <p>
 * A number of issues can arise with the location and invocation of the
 * parameter setting method. The underlying exception is available through
 * {@link #getCause()} and will typically be one of:</p>
 *
 * <ul>
 * <li>{@link NoSuchMethodException}</li>
 * <li>{@link SecurityException}</li>
 * <li>{@link IllegalAccessException}</li>
 * <li>{@link InvocationTargetException}</li>
 * </ul>
 *
 * <p>
 * Ideally these exceptions should be thrown when parameters are associated with
 * the {@link ParameterizedFilter}. However, due to invocation issues they may
 * not be reported until the filter lists are associated with the
 * {@link PipelinedComparator}.</p>
 *
 * @see <a href="http://docs.deltaxml.com/core/current/docs/api/com/deltaxml/core/FilterParameterizationException.html">
 * Class FilterParameterizationException</a>
 */
public class FilterParameterizationException extends PipelinedComparatorException {

    public FilterParameterizationException(String message, Throwable t, String parameterName) {
        super(message, t);
        throw new UnsupportedOperationException();
    }

    public FilterParameterizationException(String message, String parameterName) {
        super(message);
        throw new UnsupportedOperationException();
    }

    public FilterParameterizationException(String message, Throwable t, String parameterName, int aggregatePosition, PipelineIOIdentifier locationId) {
        super(message, t);
        throw new UnsupportedOperationException();
    }

    public String getParameterName() {
        throw new UnsupportedOperationException();
    }

    public PipelineIOIdentifier getLocationId() {
        throw new UnsupportedOperationException();
    }

    public int getAggregatePosition() {
        throw new UnsupportedOperationException();
    }

}
