package com.deltaxml.core;

/**
 * Indicates an error condition in the {@link DXPConfiguration}.
 *
 * <p>
 * This class is the super-class of most of the <em>checked</em> exceptions
 * thrown by the {@link DXPConfiguration} methods. As such it could be used for
 * simplified, coarse-grain catch or throws clauses.</p>
 *
 * @see <a href="http://docs.deltaxml.com/core/current/docs/api/com/deltaxml/core/DXPConfigurationException.html">
 * Class DXPConfigurationException</a>
 */
public class DXPConfigurationException extends DeltaXMLException {

    public DXPConfigurationException(String message) {
        super(message);
        throw new UnsupportedOperationException();
    }

    public DXPConfigurationException(Throwable t) {
        super(t);
        throw new UnsupportedOperationException();
    }

    public DXPConfigurationException(String message, Throwable t) {
        super(message, t);
        throw new UnsupportedOperationException();
    }

}
