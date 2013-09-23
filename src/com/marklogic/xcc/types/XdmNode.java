package com.marklogic.xcc.types;

import java.io.IOException;
import java.io.InputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

/**
 * An XDM value which is a node().
 *
 * @see <a href="http://docs.marklogic.com/javadoc/xcc/com/marklogic/xcc/types/XdmNode.html">
 * Interface XdmNode</a>
 */
public interface XdmNode extends XdmItem {

    /**
     * Buffers the node() item from the server and converts it to a W3C DOM
     * {@link Node} object. The node() is first buffered as a {@link String}
     * object. Subsequent calls will create a new DOM tree from the buffered
     * {@link String}. The buffered {@link String} will also be used by
     * subsequent calls to {@link XdmValue#asString()} and
     * {@link XdmItem#asInputStream()}.
     *
     * <p>
     * If you are using JDOM and want to create a JDOM Document for this node,
     * do the following:</p>
     *
     * <code>
     * doc = new org.jdom.input.SAXBuilder().build(new StringReader(node.asString()));
     * </code>
     *
     * @param docBuilder The {@link DocumentBuilder} object to use to construct
     * the {@link Node}. If {@code null}, the default implementation will be
     * used. See the JDK documentation for the {@link DocumentBuilderFactory}
     * class for details on configuring the system default builder.
     * @return This item as a W3C node ({@link Node}) instance.
     * @throws IllegalStateException If called after the {@link InputStream} has
     * already been consumed.
     * @throws IOException
     * @throws SAXException
     * @see XdmItem#asInputStream()
     * @see XdmValue#asString()
     * @see XdmItem#isCached()
     */
    Node asW3cNode(DocumentBuilder docBuilder) throws IOException, SAXException;

    /**
     * This is equivalent to
     * {@link #asW3cNode(DocumentBuilder) asW3cNode(null)}.
     *
     * @return This item as a W3C node ({@link Node}) instance.
     * @throws ParserConfigurationException
     * @throws IOException
     * @throws SAXException
     * @see #asW3cNode(DocumentBuilder)
     */
    Node asW3cNode() throws ParserConfigurationException, IOException, SAXException;

}
