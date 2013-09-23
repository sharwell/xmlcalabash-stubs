package com.deltaxml.core;

/**
 * Thrown to indicate that a feature has been set to a value which is not
 * supported or is disallowed.
 *
 * <p>
 * For correct pipeline operation the use of certain feature settings is
 * restricted. However feature support is still needed, hence this
 * exception.</p>
 *
 * <p>
 * See {@link PipelinedComparator#setParserFeature(String, boolean)} for further
 * details of the restrictions.</p>
 *
 * <p>
 * Methods are provided to determine the feature name that was used and the
 * proposed (incorrect) value.</p>
 *
 * @see <a href="http://docs.deltaxml.com/core/current/docs/api/com/deltaxml/core/FeatureSettingNotSupportedException.html">
 * Class FeatureSettingNotSupportedException</a>
 */
public class FeatureSettingNotSupportedException extends PipelinedComparatorException {

    public FeatureSettingNotSupportedException(String message, String featureName, boolean proposedValue) {
        super(message);
        throw new UnsupportedOperationException();
    }

    public FeatureSettingNotSupportedException(String message, Throwable t, String featureName, boolean proposedValue) {
        super(message, t);
        throw new UnsupportedOperationException();
    }

    public FeatureSettingNotSupportedException(Throwable t, String featureName, boolean proposedValue) {
        super(t);
        throw new UnsupportedOperationException();
    }

    public String getFeatureName() {
        throw new UnsupportedOperationException();
    }

    public boolean getProposedValue() {
        throw new UnsupportedOperationException();
    }

}
