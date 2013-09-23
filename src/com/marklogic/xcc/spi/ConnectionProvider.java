package com.marklogic.xcc.spi;

import com.marklogic.xcc.ContentSource;

/**
 * This interface defines a provider of Sockets for a {@link ContentSource}.
 * Policies such as load balancing or failover can be implemented by supplying a
 * custom {@link ConnectionProvider}.
 *
 * @see <a href="http://docs.marklogic.com/javadoc/xcc/com/marklogic/xcc/spi/ConnectionProvider.html">
 * Interface ConnectionProvider</a>
 */
public interface ConnectionProvider {

}
