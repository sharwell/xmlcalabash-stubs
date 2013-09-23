package com.marklogic.xcc.types;

/**
 * Base class for the typesafe enumeration objects that represent XML Schema
 * types.
 *
 * @see <a href="http://docs.marklogic.com/javadoc/xcc/com/marklogic/xcc/types/ValueType.html">
 * Class ValueType</a>
 */
public abstract class ValueType {

    public static final ValueType SEQUENCE = null;

    public static final ValueType NODE = null;

    public static final ValueType ELEMENT = null;

    public static final ValueType DOCUMENT = null;

    public static final ValueType TEXT = null;

    public static final ValueType BINARY = null;

    public static final ValueType ATTRIBUTE = null;

    public static final ValueType PROCESSING_INSTRUCTION = null;

    public static final ValueType COMMENT = null;

    public static final ValueType XS_UNTYPED_ATOMIC = null;

    public static final ValueType XS_STRING = null;

    public static final ValueType XS_BOOLEAN = null;

    public static final ValueType XS_INTEGER = null;

    public static final ValueType XS_DECIMAL = null;

    public static final ValueType XS_FLOAT = null;

    public static final ValueType XS_DOUBLE = null;

    public static final ValueType XS_DURATION = null;

    public static final ValueType XS_DAY_TIME_DURATION = null;

    public static final ValueType XS_YEAR_MONTH_DURATION = null;

    public static final ValueType XS_DATE_TIME = null;

    public static final ValueType XS_TIME = null;

    public static final ValueType XS_DATE = null;

    public static final ValueType XS_ANY_URI = null;

    public static final ValueType XS_QNAME = null;

    public static final ValueType XS_GDAY = null;

    public static final ValueType XS_GMONTH = null;

    public static final ValueType XS_GMONTH_DAY = null;

    public static final ValueType XS_GYEAR = null;

    public static final ValueType XS_GYEAR_MONTH = null;

    public static final ValueType XS_HEX_BINARY = null;

    public static final ValueType XS_BASE64_BINARY = null;

    public static final ValueType CTS_BOX = null;

    public static final ValueType CTS_CIRCLE = null;

    public static final ValueType CTS_POINT = null;

    public static final ValueType CTS_POLYGON = null;

    /**
     * Indicates whether this value type represents a sequence or single value.
     *
     * @return {@code true} if the type represented is a sequence, {@code false}
     * otherwise.
     */
    public abstract boolean isSequence();

    /**
     * The name of this XQuery type, as a string.
     *
     * @return A string representation of this type.
     */
    @Override
    public String toString() {
        throw new UnsupportedOperationException();
    }

    public static final ValueType valueOf(String name) {
        throw new UnsupportedOperationException();
    }

}
