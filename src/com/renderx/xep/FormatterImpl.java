package com.renderx.xep;

import com.renderx.xep.lib.Conf;
import com.renderx.xep.lib.ConfigurationException;
import com.renderx.xep.lib.Logger;
import java.io.IOException;
import java.util.Properties;
import javax.xml.transform.Source;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

public class FormatterImpl implements Formatter {

    public FormatterImpl() throws ConfigurationException {
        throw new UnsupportedOperationException();
    }

    public FormatterImpl(Logger logger) throws ConfigurationException {
        throw new UnsupportedOperationException();
    }

    public FormatterImpl(Properties prprts) throws ConfigurationException {
        throw new UnsupportedOperationException();
    }

    public FormatterImpl(Properties prprts, Logger logger) throws ConfigurationException {
        throw new UnsupportedOperationException();
    }

    public FormatterImpl(Source source) throws ConfigurationException {
        throw new UnsupportedOperationException();
    }

    public FormatterImpl(Source source, Logger logger) throws ConfigurationException {
        throw new UnsupportedOperationException();
    }

    public FormatterImpl(Source source, Properties prprts) throws ConfigurationException {
        throw new UnsupportedOperationException();
    }

    public FormatterImpl(Source source, Properties prprts, Logger logger) throws ConfigurationException {
        throw new UnsupportedOperationException();
    }

    protected FormatterImpl(Conf conf) throws ConfigurationException {
        throw new UnsupportedOperationException();
    }

    public void cleanup() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void render(Source source, FOTarget fot) throws SAXException, IOException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void render(Source source, FOTarget fot, Logger logger) throws SAXException, IOException {
        throw new UnsupportedOperationException();
    }

    @Override
    public ContentHandler createContentHandler(String string, FOTarget fot) throws ConfigurationException {
        throw new UnsupportedOperationException();
    }

    @Override
    public ContentHandler createContentHandler(String string, FOTarget fot, Logger logger) throws SAXException, IOException {
        throw new UnsupportedOperationException();
    }

    public void render(Source source, ContentHandler ch) throws SAXException, IOException {
        throw new UnsupportedOperationException();
    }

    public void render(Source source, ContentHandler ch, Logger logger) throws SAXException, IOException {
        throw new UnsupportedOperationException();
    }

    public ContentHandler createContentHandler(String string, ContentHandler ch) throws ConfigurationException {
        throw new UnsupportedOperationException();
    }

    public ContentHandler createContentHandler(String string, ContentHandler ch, Logger logger) throws ConfigurationException {
        throw new UnsupportedOperationException();
    }

    public ContentHandler createGenerator(FOTarget fot) throws ConfigurationException {
        throw new UnsupportedOperationException();
    }

    public ContentHandler createGenerator(FOTarget fot, Logger logger) throws ConfigurationException {
        throw new UnsupportedOperationException();
    }

}
