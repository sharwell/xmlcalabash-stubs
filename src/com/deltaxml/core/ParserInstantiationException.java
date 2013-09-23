package com.deltaxml.core;

import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 * Thrown to indicate a problem instantiating or configuring a SAX Parser.
 *
 * <p>
 * The {@link PipelinedComparator} makes use of SAX Parsers in its
 * implementation. If there are problems instantiating or configuring these
 * parsers this exception may be thrown.</p>
 *
 * <p>
 * When using JAXP the {@link #getCause()} method should provide details of the
 * underlying {@link ParserConfigurationException} or {@link SAXException}.
 * Alternatively if the {@code bypassJAXPFactories} setting is in use
 * {@link #getCause()} may provide a
 * {@link ClassNotFoundException}, {@link InstantiationException} or
 * {@link IllegalAccessException} with details of the underlying cause.
 *
 * <p>
 * If this exception is encountered we suggest checking any JAXP parser factory
 * property settings and classpath contents, or if the
 * {@code bypassJAXPFactories} setting is in effect, checking that
 * xercesImpl.jar is available on the classpath. If the problems cannot be
 * resolved please contact DeltaXML support for further assistance.</p>
 *
 * @see <a href="http://docs.deltaxml.com/core/current/docs/api/com/deltaxml/core/ParserInstantiationException.html">
 * Class ParserInstantiationException</a>
 */
public class ParserInstantiationException extends PipelinedComparatorException {

    public ParserInstantiationException(String message, Throwable e) {
        super(message, e);
        throw new UnsupportedOperationException();
    }

}
