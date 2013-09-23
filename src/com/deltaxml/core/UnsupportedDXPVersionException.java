package com.deltaxml.core;

/**
 * Used to indicate that the throwing class does not support the DXP version of
 * the loaded DXP file.
 *
 * <p>
 * This Exception is thrown when the generate method is called on one of the
 * {@link DXPConfiguration} classes and the loaded DXP file contains features
 * that are not supported. An example is the XPath-based attributes when and
 * xpath not being supported by {@link DXPConfiguration}.</p>
 *
 * <p>
 * The Exception contains information about which version the unsupported
 * features are from and which version the throwing class can support.</p>
 *
 * @see <a href="http://docs.deltaxml.com/core/current/docs/api/com/deltaxml/core/UnsupportedDXPVersionException.html">
 * Class UnsupportedDXPVersionException</a>
 */
public class UnsupportedDXPVersionException extends InvalidPipelineException {

    public UnsupportedDXPVersionException(String message, String currentVersion, String supportedVersion) {
        super(message);
        throw new UnsupportedOperationException();
    }

    public String getCurrent() {
        throw new UnsupportedOperationException();
    }
    
    public String getSupported() {
        throw new UnsupportedOperationException();
    }

}
