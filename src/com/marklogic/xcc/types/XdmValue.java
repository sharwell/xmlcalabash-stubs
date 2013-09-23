package com.marklogic.xcc.types;

/**
 * Base interface for XML Data Model (XDM) values represented as Java objects.
 *
 * @see <a href="http://docs.marklogic.com/javadoc/xcc/com/marklogic/xcc/types/XdmValue.html">
 * Interface XdmValue</a>
 */
public interface XdmValue {

    /**
     * Return a String representation of this item, if possible.
     *
     * @return A Java String representation of this value. Note that this is
     * similar but not exactly equivalent to toString(). The toString() method
     * will always return a printable String. This method may throw an exception
     * for some types (such as binary()).
     * @throws UnsupportedOperationException If the underlying value object
     * cannot be represented as a String.
     */
    String asString();

    /**
     * The XQuery type specification instance for this value.
     *
     * @return An instance of {@link ValueType} that represents the XQuery
     * Schema type of this value.
     */
    ValueType getValueType();

}
