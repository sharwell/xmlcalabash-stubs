package com.deltaxml.core;

import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

/**
 * Thrown to indicate a problem instantiating or configuring an XSLT
 * Transformer.
 *
 * <p>
 * The {@link PipelinedComparator} may make use of JAXP XSLT Transformers in its
 * implementation. If there are problems instantiating or configuring these
 * Transformers this exception may be thrown.</p>
 *
 * <p>
 * The {@link #getCause()} method could provide details of an underlying
 * {@link TransformerFactoryConfigurationError}. This may be the case if a
 * {@link TransformerFactory} is not available on the classpath (typically J2SE
 * versions 1.2 or 1.3) or if the JAXP factory property is misconfigured (see
 * {@link TransformerFactory#newInstance()}).</p>
 *
 * <p>
 * Alternatively the {@link PipelinedComparator} may be configured to bypass the
 * JAXP factory mechanisms and instantiate the Saxon XSLT Transformer directly.
 * When using the bypass mechanism the {@link #getCause()} method could provide
 * details of exceptions related to locating the Saxon factory class via
 * reflection (see the exceptions thrown by the {@link Class#forName} methods)
 * or instantiating it when the underlying exceptions/errors could be
 * {@link InstantiationException} or {@link IllegalAccessException}.</p>
 *
 * <p>
 * There is also a requirement that the {@link TransformerFactory} obtained via
 * JAXP lookup or the bypass mechanism supports the following features:</p>
 *
 * <ul>
 * <li>{@link StreamSource#FEATURE}</li>
 * <li>{@link StreamResult#FEATURE}</li>
 * <li>{@link SAXSource#FEATURE}</li>
 * <li>{@link SAXResult#FEATURE}</li>
 * <li>{@link SAXTransformerFactory#FEATURE}</li>
 * <li>{@link SAXTransformerFactory#FEATURE_XMLFILTER}</li>
 * </ul>
 *
 * <p>
 * All of these {@code FEATURE} requirements are met with J2SE versions 1.4 and
 * 5.0 and also by using Saxon version 6.5.3, 6.5.4 or 8.x or Xalan-J Versions
 * 2.5.2 or later.</p>
 *
 * <p>
 * If this exception is encountered we suggest checking any JAXP factory
 * property settings and classpath contents. If the problems cannot be resolved
 * please contact DeltaXML support for further assistance.</p>
 *
 * @see <a href="http://docs.deltaxml.com/core/current/docs/api/com/deltaxml/core/TransformerInstantiationException.html">
 * Class TransformerInstantiationException</a>
 */
public class TransformerInstantiationException extends PipelinedComparatorException {

    public TransformerInstantiationException(String message) {
        super(message);
        throw new UnsupportedOperationException();
    }

    public TransformerInstantiationException(String message, Throwable t) {
        super(message, t);
        throw new UnsupportedOperationException();
    }

}
