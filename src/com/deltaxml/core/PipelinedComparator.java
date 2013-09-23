package com.deltaxml.core;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.net.URL;
import java.util.List;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Templates;
import javax.xml.transform.sax.TransformerHandler;
import org.xml.sax.helpers.XMLFilterImpl;

/**
 * Provides a Pipeline abstraction for the Comparator.
 *
 * <p>
 * Each of the two comparator input streams is passed through a number of input
 * filters and the comparator output is fed through a chain of output filters.
 * Filters can be used for input processing or cleaning (removing unnecessary
 * whitespace or elements not significant for comparison), keying, or output
 * report generation. They could be implemented using XSLT or Java. The current
 * implementation also supports filter parameterization using {@link String}
 * parameters.</p>
 *
 * <p>
 * <strong>Note:</strong> This class instantiates the underlying pipeline
 * components including SAX parsers and XSLT transformers using the JAXP factory
 * mechanisms. Reconfiguring the factories so as to change the underlying
 * factory implementation classes during the existence of a
 * {@link PipelinedComparator} is not supported and may result in unpredictable
 * results.</p>
 *
 * <p>
 * <strong>Note:</strong> A single instance of this class should not be used by
 * multiple threads. Different instances may be used by different threads.</p>
 *
 * <p>
 * <strong>Note:</strong> A limitation in Saxon versions 9.x prevents a
 * {@link TransformerHandler} being reused. When it is reused an
 * {@link UnsupportedOperationException} with an exception message stating that
 * a 'TransformerHandler is not serially reusable' is thrown. In
 * {@link PipelinedComparator} this situation corresponds to the use of an XSLT
 * output filter and multiple invocations of {@link #compare} or
 * {@link #isEqual} methods. Using the new {@code cores9api} package will avoid
 * this problem as will using Saxon version 6.5.5 when using solely XSLT 1.0
 * filters. Alternatively the calling the {@link #setOutputFilters} method
 * before each {@link #compare} or {@link #isEqual} method is called provides a
 * work-around.</p>
 *
 * @see <a href="http://docs.deltaxml.com/core/current/docs/api/com/deltaxml/core/PipelinedComparator.html">
 * Class PipelinedComparator</a>
 */
public class PipelinedComparator {

    public PipelinedComparator() throws ParserInstantiationException, TransformerInstantiationException {
        throw new UnsupportedOperationException();
    }

    public PipelinedComparator(boolean bypassJAXPFactories) throws ParserInstantiationException, TransformerInstantiationException {
        throw new UnsupportedOperationException();
    }

    public void setParserFeature(String featureName, boolean value) throws FeatureSettingNotSupportedException, FeatureNotRecognizedException, IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public boolean getParserFeature(String featureName) throws FeatureNotRecognizedException, IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public void setParserProperty(String name, Object value) throws PropertyNotRecognizedException, PropertySettingNotSupportedException, IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public Object getParserProperty(String name) throws PropertyNotRecognizedException, IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public void setComparatorFeature(String featureName, boolean value) throws FeatureNotRecognizedException, IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public boolean getComparatorFeature(String featureName) throws FeatureNotRecognizedException, IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public void setComparatorProperty(String name, Object value) throws PropertyNotRecognizedException, IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public Object getComparatorProperty(String name) throws PropertyNotRecognizedException, IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public void setOutputProperty(String name, String value) throws PropertyNotRecognizedException, IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public String getOutputProperty(String name) throws PropertyNotRecognizedException, IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public void setInputFilters(Class<XMLFilterImpl>[] filters) throws FilterClassInstantiationException, FilterClassIncompatibilityException, IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public void setInputFilters(File[] filters) throws FilterConfigurationException, IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public void setInputFilters(List<?> filters) throws FilterClassInstantiationException, FilterClassIncompatibilityException, UnsupportedFilterListMemberException, FilterConfigurationException, IllegalArgumentException, FilterParameterizationException, FilterParameterizationNotSupportedException {
        throw new UnsupportedOperationException();
    }

    public void setInputFilters(ParameterizedFilter[] filters) throws FilterClassInstantiationException, FilterParameterizationNotSupportedException, FilterClassIncompatibilityException, FilterConfigurationException, FilterParameterizationException {
        throw new UnsupportedOperationException();
    }

    public void setInputFilters(Templates[] filters) throws FilterConfigurationException, IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public void setInputFilters(URL[] filters) throws FilterConfigurationException, IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public void setOutputFilters(Class<XMLFilterImpl>[] filters) throws FilterClassInstantiationException, FilterClassIncompatibilityException, IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public void setOutputFilters(File[] filters) throws FilterConfigurationException, IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public void setOutputFilters(List<?> filters) throws FilterClassIncompatibilityException, FilterClassInstantiationException, UnsupportedFilterListMemberException, FilterConfigurationException, IllegalArgumentException, FilterParameterizationException {
        throw new UnsupportedOperationException();
    }

    public void setOutputFilters(ParameterizedFilter[] filters) throws FilterClassInstantiationException, FilterParameterizationNotSupportedException, FilterClassIncompatibilityException, FilterConfigurationException, FilterParameterizationException {
        throw new UnsupportedOperationException();
    }

    public void setOutputFilters(Templates[] filters) throws FilterConfigurationException, IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public void setOutputFilters(URL[] filters) throws FilterConfigurationException, IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public void compare(File f1, File f2, File result) throws PipelineProcessingException, IdentityTransformerSetupException, ComparatorInstantiationException, ParserInstantiationException, IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public void compare(InputStream is1, InputStream is2, OutputStream result) throws PipelineProcessingException, IdentityTransformerSetupException, ComparatorInstantiationException, ParserInstantiationException, IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public void compare(Reader r1, Reader r2, Writer result) throws PipelineProcessingException, IdentityTransformerSetupException, ComparatorInstantiationException, ParserInstantiationException, IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public void compare(Source s1, Source s2, Result result) throws PipelineProcessingException, IdentityTransformerSetupException, ComparatorInstantiationException, ParserInstantiationException, UnsupportedSourceException, IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public void compare(String s1, String s2, StringBuffer result) throws PipelineProcessingException, IdentityTransformerSetupException, ComparatorInstantiationException, ParserInstantiationException, IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public void compare(URL u1, URL u2, File result) throws PipelineProcessingException, IdentityTransformerSetupException, ComparatorInstantiationException, ParserInstantiationException, IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public void compare(URL u1, URL u2, URL result) throws PipelineProcessingException, IdentityTransformerSetupException, ComparatorInstantiationException, ParserInstantiationException, IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public boolean isEqual(File f1, File f2) throws PipelineProcessingException, ComparatorInstantiationException, ParserInstantiationException {
        throw new UnsupportedOperationException();
    }

    public boolean isEqual(InputStream is1, InputStream is2) throws PipelineProcessingException, ComparatorInstantiationException, ParserInstantiationException {
        throw new UnsupportedOperationException();
    }

    public boolean isEqual(Reader r1, Reader r2) throws PipelineProcessingException, ComparatorInstantiationException, ParserInstantiationException {
        throw new UnsupportedOperationException();
    }

    public boolean isEqual(Source s1, Source s2) throws PipelineProcessingException, ComparatorInstantiationException, ParserInstantiationException, UnsupportedSourceException {
        throw new UnsupportedOperationException();
    }

    public boolean isEqual(String s1, String s2) throws PipelineProcessingException, ComparatorInstantiationException, ParserInstantiationException {
        throw new UnsupportedOperationException();
    }

    public boolean isEqual(URL u1, URL u2) throws PipelineProcessingException, ComparatorInstantiationException, ParserInstantiationException {
        throw new UnsupportedOperationException();
    }

}
