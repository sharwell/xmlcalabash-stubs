package com.marklogic.xcc;

import com.marklogic.xcc.exceptions.XccConfigException;
import com.marklogic.xcc.spi.ConnectionProvider;
import java.net.URI;

/**
 * Static helper class with factory methods to create instances of
 * {@link ContentSource} using explicit connection parameters.
 *
 * @see <a href="http://docs.marklogic.com/javadoc/xcc/com/marklogic/xcc/ContentSourceFactory.html">
 * Class ContentSourceFactory</a>
 */
public class ContentSourceFactory {

    public static ContentSource newContentSource(ConnectionProvider connectionProvider, String user, String password, String contentBaseName) {
        throw new UnsupportedOperationException();
    }

    public static ContentSource newContentSource(URI uri, SecurityOptions options) throws XccConfigException {
        throw new UnsupportedOperationException();
    }

    public static ContentSource newContentSource(URI uri) throws XccConfigException {
        throw new UnsupportedOperationException();
    }

    public static ContentSource newContentSource(String host, int port, String user, String password, String contentbaseName, SecurityOptions options) {
        throw new UnsupportedOperationException();
    }

    public static ContentSource newContentSource(String host, int port, String user, String password, String contentbaseName) {
        throw new UnsupportedOperationException();
    }

    public static ContentSource newContentSource(String host, int port, String user, String password) {
        throw new UnsupportedOperationException();
    }

    public static ContentSource newContentSource(String host, int port) {
        throw new UnsupportedOperationException();
    }

}
