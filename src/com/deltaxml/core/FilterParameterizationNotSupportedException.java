package com.deltaxml.core;

import javax.xml.transform.Transformer;
import org.xml.sax.XMLFilter;

/**
 * Thrown to report a problem with XSLT filter parameterization. The JAXP
 * standard supports pull-mode input filtering using the {@link XMLFilter}
 * interface. Unfortunately this class does not allow access to the underlying
 * {@link Transformer} object and thus the setting of parameters.
 *
 * <p>
 * However, certain XSLT processor implementations do support a
 * {@code getTransformer()} method. We will attempt to invoke this method using
 * Java reflection where it is available. If an input filter parameter is used
 * and the method is not present on the implementation this exception will be
 * thrown.</p>
 *
 * <p>
 * XSLT processor implementations which support the {@code getTransformer()}
 * method and which should not throw this exception include:</p>
 *
 * <ul>
 * <li>Saxon 7, 8 (A and B versions)</li>
 * <li>Xerces-J Version 2.6.0 and later</li>
 * <li>The built-in processor (Xerces-J XSLTC) included with J2SE 5.0
 * releases</li>
 * </ul>
 *
 * <p>
 * XSLT implementations where this exception could be thrown include:</p>
 *
 * <ul>
 * <li>Saxon 6 releases</li>
 * <li>Xerces-J 1.4.x</li>
 * <li>The built-in processor included with J2SE 1.4.x releases</li>
 * </ul>
 *
 * <p>
 * If there is any doubt as to which processor is being used when this exception
 * arises the {@link #getProcessorClass()} method can be used. The underlying
 * {@link Throwable}, available through {@link #getCause()} will usually be a
 * {@link NoSuchMethodException} and may provide further details.</p>
 *
 * @see <a href="http://docs.deltaxml.com/core/current/docs/api/com/deltaxml/core/FilterParameterizationNotSupportedException.html">
 * Class FilterParameterizationNotSupportedException</a>
 */
public class FilterParameterizationNotSupportedException extends PipelinedComparatorException {

    public FilterParameterizationNotSupportedException(String message, Throwable t, Class<?> processorClass) {
        super(message, t);
        throw new UnsupportedOperationException();
    }

    public Class<?> getProcessorClass() {
        throw new UnsupportedOperationException();
    }

}
