package com.marklogic.xcc;

import com.marklogic.xcc.spi.ConnectionProvider;
import java.util.logging.Logger;

/**
 * A {@link ContentSource} object describes a content source (MarkLogic Server
 * instance) and serves as a factory that creates {@link Session} objects.
 * Instances of {@link ContentSource} may be obtained from a JNDI lookup service
 * or from one of the static factory methods on the {@link ContentSourceFactory}
 * class.
 *
 * <p>
 * See the {@link #getDefaultLogger()} method for information about configuring
 * logging behavior.</p>
 *
 * @see <a href="http://docs.marklogic.com/javadoc/xcc/com/marklogic/xcc/ContentSource.html">
 * Interface ContentSource</a>
 */
public interface ContentSource {

    Session newSession();

    Session newSession(String contentBaseId);

    Session newSession(String userName, String password);

    Session newSession(String userName, String password, String contentBaseId);

    Logger getDefaultLogger();

    void setDefaultLogger(Logger logger);

    boolean isAuthenticationPreemptive();

    void setAuthenticationPreemptive(boolean value);

    ConnectionProvider getConnectionProvider();

}
