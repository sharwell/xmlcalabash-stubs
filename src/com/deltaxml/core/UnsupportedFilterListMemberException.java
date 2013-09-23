package com.deltaxml.core;

/**
 * @see <a href="http://docs.deltaxml.com/core/current/docs/api/com/deltaxml/core/UnsupportedFilterListMemberException.html">
 * Class UnsupportedFilterListMemberException</a>
 */
public class UnsupportedFilterListMemberException extends PipelinedComparatorException {

    public UnsupportedFilterListMemberException(String message, Class<?> filterClass) {
        super(message);
        throw new UnsupportedOperationException();
    }

    public UnsupportedFilterListMemberException(String message, Class<?> filterClass, int aggregatePosition) {
        super(message);
        throw new UnsupportedOperationException();
    }

    public UnsupportedFilterListMemberException(String message, Class<?> filterClass, int aggregatePosition, PipelineIOIdentifier locationId) {
        super(message);
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
