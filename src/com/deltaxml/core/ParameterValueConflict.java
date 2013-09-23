package com.deltaxml.core;

/**
 * Thrown when an a parameter or feature has incorrect DXP syntax.
 *
 * <p>
 * The DTD used to specify the DXP format cannot state that two attributes are
 * mutually exclusive. This exception is thrown when errors in the DXP
 * configuration are detected. In particular, when neither the
 * {@code literalValue} and {@code parameterRef} attributes are present, or when
 * they are both present. Normally exactly one of these attributes should be
 * used.</p>
 *
 * <p>
 * This exception reports the parameter/feature name and the context in which it
 * was being incorrectly used.</p>
 *
 * @see <a href="http://docs.deltaxml.com/core/current/docs/api/com/deltaxml/core/ParameterValueConflict.html">
 * Class ParameterValueConflict</a>
 */
public class ParameterValueConflict extends DXPConfigurationException {

    public ParameterValueConflict(String message, String parameterName, String parameterContext) {
        super(message);
        throw new UnsupportedOperationException();
    }

    public ParameterValueConflict(String message, Throwable t, String parameterName, String parameterContext) {
        super(message, t);
        throw new UnsupportedOperationException();
    }

    public String getUnkownParameterName() {
        throw new UnsupportedOperationException();
    }

    public String getUnkownParameterContext() {
        throw new UnsupportedOperationException();
    }

}
