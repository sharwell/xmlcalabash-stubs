package com.marklogic.xcc.exceptions;

/**
 * This exception indicates a configuration problem.
 *
 * @see <a href="http://docs.marklogic.com/javadoc/xcc/com/marklogic/xcc/exceptions/XccConfigException.html">
 * Class XccConfigException</a>
 */
public class XccConfigException extends XccException {

    public XccConfigException(String message) {
        super(message);
        throw new UnsupportedOperationException();
    }

    public XccConfigException(String message, Throwable cause) {
        super(message, cause);
        throw new UnsupportedOperationException();
    }

}
