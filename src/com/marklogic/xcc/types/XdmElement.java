package com.marklogic.xcc.types;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
 * An XQuery value which is an element().
 *
 * @see <a href="http://docs.marklogic.com/javadoc/xcc/com/marklogic/xcc/types/XdmElement.html">
 * Interface XdmElement</a>
 */
public interface XdmElement extends XdmNode {

    /**
     * Returns a W3C {@link Element} object equivalent to this
     * {@link XdmElement}. Buffers the element() item from the server and
     * converts it to a W3C {@link Element} DOM object. The element() is
     * buffered as a {@link String} object. Subsequent calls will create a new
     * DOM tree from the same {@link String}. The buffered {@link String} may
     * also be used by {@link XdmValue#asString()} and
     * {@link XdmItem#asInputStream()}.
     *
     * @param docBuilder The {@link DocumentBuilder} object to use to construct
     * the {@link Element}. If {@code null}, the default implementation will be
     * used. See the JDK documentation for the {@link DocumentBuilderFactory}
     * class for details on configuring the system default builder.
     * @return This item as a W3C element ({@link Element}) instance.
     * @throws IllegalStateException If called after the InputStream has already
     * been consumed.
     * @throws IOException
     * @throws SAXException
     */
    Element asW3cElement(DocumentBuilder docBuilder) throws IOException, SAXException;

    /**
     * This is equivalent to
     * {@link #asW3cElement(DocumentBuilder) asW3cElement(null)}.
     *
     * @return This item as a W3C element ({@link Element}) instance.
     * @throws ParserConfigurationException
     * @throws IOException
     * @throws SAXException
     */
    Element asW3cElement() throws ParserConfigurationException, IOException, SAXException;

    /**
     * Returns a W3C {@link Document} object with this element() as the root
     * node. Buffers the element() item from the server and converts it to a W3C
     * {@link Document} DOM object. The element() is buffered as a
     * {@link String} object. Subsequent calls will create a new DOM tree from
     * the same {@link String}. The buffered {@link String} may also be used by
     * {@link XdmValue#asString()} and {@link XdmItem#asInputStream()}.
     *
     * <p>
     * If you are using JDOM and want to create a JDOM {@link Document} for this
     * node, do the following:</p>
     * <code>
     * doc = new org.jdom.input.SAXBuilder().build(new StringReader(node.asString()));
     * </code>
     *
     * @param docBuilder The {@link DocumentBuilder} object to use to construct
     * the {@link Document}. If {@code null}, the default implementation will be
     * used. See the JDK documentation for the {@link DocumentBuilderFactory}
     * class for details on configuring the system default builder.
     * @return This item as a W3C document ({@link Document}) instance.
     * @throws IllegalStateException If called after the InputStream has already
     * been consumed.
     * @throws IOException
     * @throws SAXException
     */
    Document asW3cDocument(DocumentBuilder docBuilder) throws IOException, SAXException;

    /**
     * This is equivalent to
     * {@link #asW3cDocument(DocumentBuilder) asW3cDocument(null)}.
     *
     * @return This item as a W3C document ({@link Document}) instance.
     * @throws ParserConfigurationException
     * @throws IOException
     * @throws SAXException
     */
    Document asW3cDocument() throws ParserConfigurationException, IOException, SAXException;

}
