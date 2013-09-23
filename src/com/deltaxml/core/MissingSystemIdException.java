package com.deltaxml.core;

/**
 * Thrown when a SystemId cannot be determined in the {@link DXPConfiguration}
 * constructors.
 *
 * <p>
 * Validity checking is required in these constructors and thus a valid systemId
 * is required in order to resolve the location of the DTD systemId, especially
 * when relative systemIds are used (for example in Jar files).</p>
 *
 * @see <a href="http://docs.deltaxml.com/core/current/docs/api/com/deltaxml/core/MissingSystemIdException.html">
 * Class MissingSystemIdException</a>
 */
public class MissingSystemIdException extends DXPConfigurationException {

    public MissingSystemIdException(String message) {
        super(message);
        throw new UnsupportedOperationException();
    }

}
