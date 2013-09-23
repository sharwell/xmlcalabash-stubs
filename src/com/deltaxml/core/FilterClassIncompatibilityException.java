package com.deltaxml.core;

/**
 * Thrown to indicate that a filter class incompatibility has been detected.
 *
 * <p>
 * SAX event filters implemented in Java have to be assignment compatible with a
 * small set of appropriate classes in order for them to be deployed in a
 * pipeline. The set of appropriate classes depends on whether the filter is
 * being used for input filtering prior to the comparator, or output filtering
 * after the comparator. See the documentation for the various overloaded
 * {@link PipelinedComparator#setInputFilters} and
 * {@link PipelinedComparator#setOutputFilters} methods for full details of the
 * allowable classes.</p>
 *
 * <p>
 * The classes which are allowable in the given context can be determined with
 * the {@link #getAllowableFilterClasses()} method. The class which is
 * assignment incompatible, and caused the exception, is available with the
 * {@link #getProposedFilterClass()} method.</p>
 *
 * <p>
 * In some cases the filter setting methods take aggregates (Arrays, Lists) of
 * filters. The {@link #getAggregatePosition()} method can be used to report
 * which element of the aggregate caused the problem.</p>
 *
 * @see <a href="http://docs.deltaxml.com/core/current/docs/api/com/deltaxml/core/FilterClassIncompatibilityException.html">
 * Class FilterClassIncompatibilityException</a>
 */
public class FilterClassIncompatibilityException extends PipelinedComparatorException {

    public FilterClassIncompatibilityException(String message, Class<?> proposedFilterClass, Class<?>[] allowableFilterClasses) {
        super(message);
        throw new UnsupportedOperationException();
    }

    public FilterClassIncompatibilityException(String message, Class<?> proposedFilterClass, Class<?>[] allowableFilterClasses, int aggregatePosition) {
        super(message);
        throw new UnsupportedOperationException();
    }

    public FilterClassIncompatibilityException(String message, Class<?> proposedFilterClass, Class<?>[] allowableFilterClasses, int aggregatePosition, PipelineIOIdentifier locationId) {
        super(message);
        throw new UnsupportedOperationException();
    }

    public Class<?> getProposedFilterClass() {
        throw new UnsupportedOperationException();
    }

    public Class<?>[] getAllowableFilterClasses() {
        throw new UnsupportedOperationException();
    }

    public int getAggregatePosition() {
        throw new UnsupportedOperationException();
    }

    public PipelineIOIdentifier getLocationId() {
        throw new UnsupportedOperationException();
    }

}
