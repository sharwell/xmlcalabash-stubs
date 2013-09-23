package com.marklogic.xcc.types;

/**
 * A named XDM variable (an {@link XName} / {@link XdmValue} pair).
 *
 * @see <a href="http://docs.marklogic.com/javadoc/xcc/com/marklogic/xcc/types/XdmVariable.html">
 * Interface XdmVariable</a>
 */
public interface XdmVariable {

    /**
     * The name of this variable.
     *
     * @return The {@link XName} instance that represents the name of this
     * value.
     */
    XName getName();

    /**
     * The value of this variable.
     *
     * @return The {@link XdmValue} instance that represents the value of this
     * variable.
     */
    XdmValue getValue();

}
