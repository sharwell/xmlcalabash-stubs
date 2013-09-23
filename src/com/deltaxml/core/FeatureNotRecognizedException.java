package com.deltaxml.core;

/**
 * Thrown to indicate that a feature name has not been recognized.
 *
 * <p>
 * Features are used to configure various aspects of the
 * {@link PipelinedComparator} operation, including parsing and comparison. They
 * are specified with String values to allow run-time pluggability of
 * implementations with different feature sets. In doing so, compile-time type
 * safety is degraded and replaced by this exception.</p>
 *
 * <p>Associated methods include:</p>
 *
 * <ul>
 * <li>{@link PipelinedComparator#setParserFeature(String, boolean)}</li>
 * <li>{@link PipelinedComparator#getParserFeature(String)}</li>
 * <li>{@link PipelinedComparator#setComparatorFeature(String, boolean)}</li>
 * <li>{@link PipelinedComparator#getComparatorFeature(String)}</li>
 * </ul>
 *
 * @see <a href="http://docs.deltaxml.com/core/current/docs/api/com/deltaxml/core/FeatureNotRecognizedException.html">
 * Class FeatureNotRecognizedException</a>
 */
public class FeatureNotRecognizedException extends PipelinedComparatorException {

    public FeatureNotRecognizedException(String message, String featureName) {
        super(message);
        throw new UnsupportedOperationException();
    }

    public FeatureNotRecognizedException(String message, Throwable t, String featureName) {
        super(message, t);
        throw new UnsupportedOperationException();
    }

    public FeatureNotRecognizedException(Throwable t, String featureName) {
        super(t);
        throw new UnsupportedOperationException();
    }

    public String getFeatureName() {
        throw new UnsupportedOperationException();
    }

}
