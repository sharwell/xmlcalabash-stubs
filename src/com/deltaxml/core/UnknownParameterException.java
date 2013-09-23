package com.deltaxml.core;

/**
 * Thrown when an attempt was made to reference an unknown or undeclared DXP
 * parameter.
 *
 * <p>
 * It is possible to use a parameter name which has not been declared in the DXP
 * pipelineParameters section. This exception reports that name and the context
 * in which it was being incorrectly used.</p>
 *
 * @see <a href="http://docs.deltaxml.com/core/current/docs/api/com/deltaxml/core/UnknownParameterException.html">
 * Class UnknownParameterException</a>
 */
public class UnknownParameterException extends DXPConfigurationException {

    public UnknownParameterException(String message, String parameterName, String parameterContext) {
        super(message);
        throw new UnsupportedOperationException();
    }

    public String getUnkownParameterName() {
        throw new UnsupportedOperationException();
    }

    public String getUnkownParameterContext() {
        throw new UnsupportedOperationException();
    }

}
