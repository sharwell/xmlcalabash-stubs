package com.deltaxml.core;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * Loads a {@link PipelinedComparator} from a <em>DXP</em> configuration.
 *
 * <p>
 * DXP (<em>DeltaXML Pipelines</em>) is a declarative file format for describing
 * comparator pipelines and could also be considered a form of customization
 * language for comparator based tools. This class provides methods for
 * obtaining information from DXP files and also for loading a
 * {@link PipelinedComparator} instance from DXP.</p>
 *
 * <p>
 * The constructor of this class is generally responsible for ensuring validity
 * of the input DXP. However, other semantic validity checks may be made during
 * the various {@code generate} methods.</p>
 *
 * @see <a href="http://docs.deltaxml.com/core/current/docs/api/com/deltaxml/core/DXPConfiguration.html">
 * Class DXPConfiguration</a>
 */
public class DXPConfiguration {

    public DXPConfiguration(InputSource dxpSource, boolean bypassJAXPDBFactory) throws ParserConfigurationException, IOException, SAXException, MissingSystemIdException {
        throw new UnsupportedOperationException();
    }

    public DXPConfiguration(InputSource dxpSource) throws ParserConfigurationException, IOException, SAXException, MissingSystemIdException {
        throw new UnsupportedOperationException();
    }

    public DXPConfiguration(File f, boolean bypassJAXPDBFactory) throws ParserConfigurationException, IOException, SAXException {
        throw new UnsupportedOperationException();
    }

    public DXPConfiguration(File f) throws ParserConfigurationException, IOException, SAXException {
        throw new UnsupportedOperationException();
    }

    public DXPConfiguration(InputSource dxpSource, EntityResolver er, boolean validate, boolean bypassJAXPDBFactory) throws ParserConfigurationException, IOException, SAXException {
        throw new UnsupportedOperationException();
    }

    public DXPConfiguration(InputSource dxpSource, EntityResolver er, boolean validate) throws ParserConfigurationException, IOException, SAXException {
        throw new UnsupportedOperationException();
    }

    public PipelinedComparator generate(Map<String, Boolean> booleanOverrides, Map<String, String> stringOverrides)
        throws ClassNotFoundException,
               MalformedURLException,
               ParserInstantiationException,
               FilterClassInstantiationException,
               FilterClassIncompatibilityException,
               TransformerInstantiationException,
               FilterConfigurationException,
               FilterParameterizationException,
               FeatureNotRecognizedException,
               FeatureSettingNotSupportedException,
               PropertyNotRecognizedException,
               FilterParameterizationNotSupportedException,
               ParameterValueConflict,
               NonUniqueParameterNameException,
               UnknownParameterException,
               InvalidPipelineException,
               UnsupportedDXPVersionException {
        throw new UnsupportedOperationException();
    }

    public PipelinedComparator generate(Map<String, Boolean> booleanOverrides, Map<String, String> stringOverrides, boolean bypassJAXPFactories)
        throws ClassNotFoundException,
               MalformedURLException,
               ParserInstantiationException,
               FilterClassInstantiationException,
               FilterClassIncompatibilityException,
               TransformerInstantiationException,
               FilterConfigurationException,
               FilterParameterizationException,
               FeatureNotRecognizedException,
               FeatureSettingNotSupportedException,
               PropertyNotRecognizedException,
               FilterParameterizationNotSupportedException,
               ParameterValueConflict,
               NonUniqueParameterNameException,
               UnknownParameterException,
               InvalidPipelineException,
               UnsupportedDXPVersionException {
        throw new UnsupportedOperationException();
    }

    public PipelinedComparator generate()
        throws ClassNotFoundException,
               MalformedURLException,
               ParserInstantiationException,
               FilterClassInstantiationException,
               FilterClassIncompatibilityException,
               TransformerInstantiationException,
               FilterConfigurationException,
               FilterParameterizationException,
               FeatureNotRecognizedException,
               FeatureSettingNotSupportedException,
               PropertyNotRecognizedException,
               FilterParameterizationNotSupportedException,
               ParameterValueConflict,
               NonUniqueParameterNameException,
               UnknownParameterException,
               InvalidPipelineException,
               UnsupportedDXPVersionException {
        throw new UnsupportedOperationException();
    }

}
