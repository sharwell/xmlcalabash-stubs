package com.marklogic.xcc;

import com.marklogic.xcc.types.ValueType;
import com.marklogic.xcc.types.XName;
import com.marklogic.xcc.types.XdmValue;
import com.marklogic.xcc.types.XdmVariable;

/**
 * Base request interface that contains methods common to all requests. Methods
 * defined here manage request options and variable binding.
 *
 * @see <a href="http://docs.marklogic.com/javadoc/xcc/com/marklogic/xcc/Request.html">
 * Interface Request</a>
 */
public interface Request {

    Session getSession();

    void setOptions(RequestOptions options);

    RequestOptions getOptions();

    RequestOptions getEffectiveOptions();

    void setVariable(XdmVariable variable);

    void setNewVariable(XName xname, XdmValue value);

    void setNewVariable(String namespace, String localname, ValueType type, Object value);

    void setNewVariable(String localname, ValueType type, Object value);

    void setNewStringVariable(String namespace, String localname, String value);

    void setNewStringVariable(String localname, String value);

    void setNewIntegerVariable(String namespace, String localname, long value);

    void setNewIntegerVariable(String localname, long value);

    void clearVariable(XdmVariable variable);

    void clearVariables();

    XdmVariable[] getVariables();

    long getPosition();

    void setPosition(long position);

    long getCount();

    void setCount(long count);

}
