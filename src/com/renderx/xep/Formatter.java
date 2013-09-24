package com.renderx.xep;

import com.renderx.xep.lib.ConfigurationException;
import com.renderx.xep.lib.Logger;
import java.io.IOException;
import javax.xml.transform.Source;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

public interface Formatter {

    void render(Source source, FOTarget fot) throws SAXException, IOException;

    void render(Source source, FOTarget fot, Logger logger) throws SAXException, IOException;

    ContentHandler createContentHandler(String string, FOTarget fot) throws ConfigurationException;

    ContentHandler createContentHandler(String string, FOTarget fot, Logger logger) throws SAXException, IOException;

}
