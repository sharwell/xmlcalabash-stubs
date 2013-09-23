package com.deltaxml.core;

/**
 * Thrown to indicate a problem setting a property on the
 * {@link PipelinedComparator}.
 *
 * <p>
 * Properties provide an extensible mechanism for configuring the operation of
 * the pipeline. Unlike features these methods accept or provide complex String,
 * or more generally Object, values rather than booleans. They are used in
 * different contexts:</p>
 *
 * <ul>
 * <li>SAX Parser configuration:
 * {@link PipelinedComparator#setParserProperty(String, Object)}</li>
 * <li>Comparator configuration:
 * {@link PipelinedComparator#setComparatorProperty(String, Object)}</li>
 * <li>Output format specification:
 * {@link PipelinedComparator#setOutputProperty(String, String)}</li>
 * </ul>
 *
 * <p>
 * The {@link #getPropertyName()} method provides access to the name that was
 * attempted to be set and which was not recognized. Please consult the
 * appropriate method descriptions for full details of the supported
 * properties.</p>
  * 
 * @see <a href="http://docs.deltaxml.com/core/current/docs/api/com/deltaxml/core/PropertyNotRecognizedException.html">
 * Class PropertyNotRecognizedException</a>
 */
public class PropertyNotRecognizedException extends PipelinedComparatorException {

    public PropertyNotRecognizedException(String message, Throwable e, String propertyName) {
        super(message, e);
        throw new UnsupportedOperationException();
    }

    public PropertyNotRecognizedException(String message, String propertyName) {
        super(message);
        throw new UnsupportedOperationException();
    }

    public PropertyNotRecognizedException(Throwable e, String propertyName) {
        super(e);
        throw new UnsupportedOperationException();
    }

    public String getPropertyName() {
        throw new UnsupportedOperationException();
    }

}
