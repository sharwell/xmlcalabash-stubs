package com.marklogic.xcc;

/**
 * This class represents options to apply to execution of a query.
 * {@link RequestOptions} may be set on both {@link Request} and on
 * {@link Session} objects. Options set on {@link Request} take priority. The
 * effective options applied to a request are a blend of of the two objects with
 * defaults applied to values not explicitly set. Use the method
 * {@link Request#getEffectiveOptions()} to determine the actual values that
 * will be applied to a given request.
 *
 * @see <a href="http://docs.marklogic.com/javadoc/xcc/com/marklogic/xcc/RequestOptions.html">
 * Class RequestOptions</a>
 */
public class RequestOptions {

    /**
     * Default max retry attempts on a request or content insertion (value: 4)
     */
    public static final int DEFAULT_MAX_AUTO_RETRY = 4;

    /**
     * Default delay (in milliseconds) between automatic query retries (value:
     * 100)
     */
    public static final int DEFAULT_AUTO_RETRY_DELAY_MILLIS = 100;

    /**
     * The system property name ({@code xcc.request.retries.max}) which, if set,
     * specifies the default maximum number of automatic retries. If not set,
     * the programmatic default is used ({@link #DEFAULT_MAX_AUTO_RETRY}) as the
     * default.
     */
    public static final String MAX_RETRY_SYSTEM_PROPERTY = "xcc.request.retries.max";

    /**
     * The system property name ({@code xcc.request.retries.delay}) which, if
     * set, specifies the default delay (in milliseconds) between automatic
     * request retries. If not set, the programmatic default is used
     * ({@link #DEFAULT_AUTO_RETRY_DELAY_MILLIS}) as the default.
     */
    public static final String AUTO_RETRY_DELAY_SYSTEM_PROPERTY = "xcc.request.retries.delay";

    public RequestOptions() {
        throw new UnsupportedOperationException();
    }

}
