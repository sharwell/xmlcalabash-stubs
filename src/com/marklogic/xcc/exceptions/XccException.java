package com.marklogic.xcc.exceptions;

/**
 * Superclass of all exceptions specific to XCC. This is an abstract class and
 * will never be thrown directly. Only subclasses will be ever be thrown. You
 * can name this class in a try/catch clause to catch all checked XCC
 * exceptions.
 *
 * @see <a href="http://docs.marklogic.com/javadoc/xcc/com/marklogic/xcc/exceptions/XccException.html">
 * Class XccException</a>
 */
public abstract class XccException extends Exception {

    protected XccException(String message) {
        throw new UnsupportedOperationException();
    }

    protected XccException(String message, Throwable cause) {
        throw new UnsupportedOperationException();
    }

}
