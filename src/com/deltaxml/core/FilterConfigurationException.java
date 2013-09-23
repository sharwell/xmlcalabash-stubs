package com.deltaxml.core;

import java.io.FileNotFoundException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.sax.TransformerHandler;
import org.xml.sax.helpers.XMLFilterImpl;

/**
 * Thrown to indicate a failure in creating or configuring an XSLT-based SAX
 * event filter.
 *
 * <p>
 * Pipeline input or output filters can be implemented in Java or XSLT. When
 * XSLT is used, filter setting methods allow Templates Objects, Files and URLs
 * to specify the location of an XSLT filter. These filters should then be
 * converted into an {@link XMLFilterImpl} or {@link TransformerHandler} as
 * appropriate. However, a number of problems can arise during XSLT compilation
 * or filter instantiation. This exception allows the underlying cause to be
 * determined from a nested exception (through {@link #getCause()}) and also
 * allows details of {@link #getAggregatePosition()} to be determined when the
 * filter was supplied as part of an aggregate parameter.</p>
 *
 * <p>
 * The {@link #getCause()} method will usually provide access to a
 * {@link TransformerConfigurationException} with more information about the
 * underlying cause. This in turn may provide a further {@link #getCause()}
 * method providing further information (for example a
 * {@link FileNotFoundException}).</p>
 *
 * @see <a href="http://docs.deltaxml.com/core/current/docs/api/com/deltaxml/core/FilterConfigurationException.html">
 * Class FilterConfigurationException</a>
 */
public class FilterConfigurationException extends PipelinedComparatorException {

    public FilterConfigurationException(String message, Throwable t, String filterSource) {
        super(message, t);
        throw new UnsupportedOperationException();
    }

    public FilterConfigurationException(String message, Throwable t, String filterSource, int aggregatePosition) {
        super(message, t);
        throw new UnsupportedOperationException();
    }

    public FilterConfigurationException(String message, Throwable t, String filterSource, int aggregatePosition, PipelineIOIdentifier pipelineId) {
        super(message, t);
        throw new UnsupportedOperationException();
    }

    public String getFilterSource() {
        throw new UnsupportedOperationException();
    }

    public int getAggregatePosition() {
        throw new UnsupportedOperationException();
    }

    public PipelineIOIdentifier getPipelineId() {
        throw new UnsupportedOperationException();
    }

}
