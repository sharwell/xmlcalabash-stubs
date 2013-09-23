package com.marklogic.xcc;

/**
 * Typesafe enumeration of allowable formats for document insertion.
 *
 * @see <a href="http://docs.marklogic.com/javadoc/xcc/com/marklogic/xcc/DocumentFormat.html">
 * Class DocumentFormat</a>
 */
public final class DocumentFormat {

    /**
     * Document format = XML node()
     */
    public static final DocumentFormat XML = null;

    /**
     * Document format = text()
     */
    public static final DocumentFormat TEXT = null;

    /**
     * Document format = binary()
     */
    public static final DocumentFormat BINARY = null;

    /**
     * Document format = none (use server default)
     */
    public static final DocumentFormat NONE = null;

    /**
     * The name of this format: "xml", "text" or "binary".
     *
     * @return The name of this format as a {@link String}, for diagnostic
     * purposes.
     */
    @Override
    public String toString() {
        throw new UnsupportedOperationException();
    }

}
