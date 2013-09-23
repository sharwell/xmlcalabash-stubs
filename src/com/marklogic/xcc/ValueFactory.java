package com.marklogic.xcc;

import com.marklogic.xcc.types.XName;
import com.marklogic.xcc.types.XSString;
import com.marklogic.xcc.types.XdmValue;
import com.marklogic.xcc.types.XdmVariable;

/**
 * This class contains various static factory methods that return instances of
 * {@link XdmValue} and {@link XdmVariable}.
 *
 * @see <a href="http://docs.marklogic.com/javadoc/xcc/com/marklogic/xcc/ValueFactory.html">
 * Class ValueFactory</a>
 */
public class ValueFactory {

    public static XdmVariable newVariable(XName name, XdmValue value) {
        throw new UnsupportedOperationException();
    }

    public static XSString newXSString(String value) {
        throw new UnsupportedOperationException();
    }

}
