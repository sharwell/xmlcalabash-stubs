package com.marklogic.xcc;

import java.util.Locale;

/**
 * A set of creation options to be applied to a document when it is inserted
 * into a contentbase. By default, the document format is set to
 * {@link DocumentFormat#NONE} which indicates that server-configured defaults
 * should be used to determine the document format.
 *
 * @see <a href="http://docs.marklogic.com/javadoc/xcc/com/marklogic/xcc/ContentCreateOptions.html">
 * Class ContentCreateOptions</a>
 */
public class ContentCreateOptions implements Cloneable {

    /**
     * The default character encoding (UTF-8) that will be assumed if not
     * explicitly set by {@link #setEncoding(String)}.
     */
    public static final String DEFAULT_ENCODING = "UTF-8";

    /**
     * The minimum user-settable buffer size (256).
     */
    public static final int MIN_BUFFER_SIZE = 256;

    /**
     * The maximum user-settable buffer size (12MB).
     */
    public static final int MAX_BUFFER_SIZE = 12582912;

    public ContentCreateOptions() {
        throw new UnsupportedOperationException();
    }

    /**
     * Create an instance with format set to {@link DocumentFormat#XML}.
     *
     * @return An options object that specifies XML format.
     */
    public static ContentCreateOptions newXmlInstance() {
        throw new UnsupportedOperationException();
    }

    public void setFormatXml() {
        throw new UnsupportedOperationException();
    }

    public void setEncoding(String encoding) {
        throw new UnsupportedOperationException();
    }

    public void setFormatText() {
        throw new UnsupportedOperationException();
    }

    public void setFormatBinary() {
        throw new UnsupportedOperationException();
    }

    public void setBufferSize(int aInt) {
        throw new UnsupportedOperationException();
    }

    public void setCollections(String[] collections) {
        throw new UnsupportedOperationException();
    }

    public void setLanguage(String string) {
        throw new UnsupportedOperationException();
    }

    public void setLocale(Locale locale) {
        throw new UnsupportedOperationException();
    }

}
