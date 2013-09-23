package com.marklogic.xcc;

import com.marklogic.xcc.types.XdmNode;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.URI;
import java.net.URL;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

/**
 * A helper class for creating instances of {@link Content}.
 *
 * @see <a href="http://docs.marklogic.com/javadoc/xcc/com/marklogic/xcc/ContentFactory.html">
 * Class ContentFactory</a>
 */
public class ContentFactory {

    public static Content newContent(String uri, Document document, ContentCreateOptions createOptions) {
        throw new UnsupportedOperationException();
    }

    public static Content newContent(String uri, Node documentNode, ContentCreateOptions createOptions) {
        throw new UnsupportedOperationException();
    }

    public static Content newContent(String uri, XdmNode documentNode, ContentCreateOptions createOptions) {
        throw new UnsupportedOperationException();
    }

    public static Content newContent(String uri, File documentFile, ContentCreateOptions createOptions) {
        throw new UnsupportedOperationException();
    }

    public static Content newContent(String uri, RandomAccessFile documentFile, ContentCreateOptions createOptions) throws IOException {
        throw new UnsupportedOperationException();
    }

    public static Content newUnBufferedContent(String uri, URL documentUrl, ContentCreateOptions createOptions) throws IOException {
        throw new UnsupportedOperationException();
    }

    public static Content newUnBufferedContent(String uri, URI documentUri, ContentCreateOptions createOptions) throws IOException {
        throw new UnsupportedOperationException();
    }

    public static Content newContent(String uri, URL documentUrl, ContentCreateOptions createOptions) throws IOException {
        throw new UnsupportedOperationException();
    }

    public static Content newContent(String uri, URI documentUri, ContentCreateOptions createOptions) throws IOException {
        throw new UnsupportedOperationException();
    }

    public static Content newContent(String uri, String documentString, ContentCreateOptions createOptions) {
        throw new UnsupportedOperationException();
    }

    public static Content newContent(String uri, byte[] documentBytes, ContentCreateOptions createOptions) {
        throw new UnsupportedOperationException();
    }

    public static Content newContent(String uri, byte[] documentBytes, int offset, int length, ContentCreateOptions createOptions) {
        throw new UnsupportedOperationException();
    }

    public static Content newContent(String uri, InputStream documentStream, ContentCreateOptions createOptions) throws IOException {
        throw new UnsupportedOperationException();
    }

    public static Content newUnBufferedContent(String uri, InputStream documentStream, ContentCreateOptions createOptions) {
        throw new UnsupportedOperationException();
    }

}
