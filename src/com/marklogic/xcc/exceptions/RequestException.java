package com.marklogic.xcc.exceptions;

import com.marklogic.xcc.Request;

/**
 * The base class for exceptions related to submitting requests to the server.
 *
 * @see <a href="http://docs.marklogic.com/javadoc/xcc/com/marklogic/xcc/exceptions/RequestException.html">
 * Class RequestException</a>
 */
public class RequestException extends XccException {

    public RequestException(String message, Request request) {
        super(message);
        throw new UnsupportedOperationException();
    }

    public RequestException(String message, Request request, Throwable cause) {
        super(message, cause);
        throw new UnsupportedOperationException();
    }

    /**
     * The initiating request to which this exception applies.
     *
     * @return An instance of {@link Request}.
     */
    public Request getRequest() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException();
    }

    protected void appendRequestInfo(StringBuffer sb) {
        throw new UnsupportedOperationException();
    }

}
