package com.deltaxml.core;

import java.util.Map;

/**
 * Thrown when the DXP {@code pipelineParameter} names are not unique.
 *
 * <p>
 * The use of {@link Map}s in this class ensures that the parameter names used
 * in the two different categories (string and boolean) of pipeline parameters
 * are unique. However it is still possible that the same name be used for a
 * string parameter and a boolean parameter. This exception signals this
 * condition and reports the non-unique name.</p>
 *
 * @see <a href="http://docs.deltaxml.com/core/current/docs/api/com/deltaxml/core/NonUniqueParameterNameException.html">
 * Class NonUniqueParameterNameException</a>
 */
public class NonUniqueParameterNameException extends DXPConfigurationException {

    public NonUniqueParameterNameException(String message) {
        super(message);
        throw new UnsupportedOperationException();
    }

    public NonUniqueParameterNameException(String message, String parameterName) {
        super(message);
        throw new UnsupportedOperationException();
    }

    public String getParameterName() {
        throw new UnsupportedOperationException();
    }

}
