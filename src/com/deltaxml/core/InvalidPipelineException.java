package com.deltaxml.core;

/**
 * Used to indicate that the DXP File loaded by a {@link DXPConfiguration} is
 * not valid.
 *
 * <p>
 * This Exception is thrown when calling one of the generate methods on
 * {@link DXPConfiguration} or when constructing a new
 * {@link DXPConfigurationS9}.</p>
 *
 * <p>
 * The Exception could be thrown for one the following reasons:</p>
 *
 * <ul>
 * <li>The DXP file does not define a comparator pipeline (the root element is not {@code <comparatorPipeline>}</li>
 * <li>The DXP file uses one of the XPath expression attributes (when or xpath) and is being used by {@link DXPConfiguration} rather than {@link DXPConfigurationS9}</li>
 * </ul>
 *
 * @see <a href="http://docs.deltaxml.com/core/current/docs/api/com/deltaxml/core/InvalidPipelineException.html">
 * Class InvalidPipelineException</a>
 */
public class InvalidPipelineException extends DXPConfigurationException {

    public InvalidPipelineException(String message) {
        super(message);
        throw new UnsupportedOperationException();
    }

}
