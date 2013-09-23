package com.marklogic.xcc.types;

import com.marklogic.xcc.ResultItem;
import com.marklogic.xcc.ResultSequence;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

/**
 * Base class for XQuery item values (values that may be a member of a
 * sequence).
 *
 * @see <a href="http://docs.marklogic.com/javadoc/xcc/com/marklogic/xcc/types/XdmItem.html">
 * Interface XdmItem</a>
 */
public interface XdmItem extends XdmValue {

    /**
     * The {@link ItemType} instance corresponding to the type of this item.
     *
     * @return An instance of {@link ItemType} that represent the XML Schema
     * type of this value.
     */
    ItemType getItemType();

    /**
     * Return a {@link Reader} for this item.
     *
     * @return A {@link Reader} instance from which this value may be read. For
     * most types, the characters read will be equivalent to those returned by
     * {@link XdmValue#asString()}.
     * @throws UnsupportedOperationException If the underlying value object
     * cannot be represented as a character stream.
     */
    Reader asReader();

    /**
     * Return an {@link InputStream} for this item.
     *
     * @return An {@link InputStream} instance from which this value may be read
     * as a byte stream. Note that most simple types (xs:integer, xs:duration,
     * etc) may not be represented as a byte stream. For string types
     * (xs:string, xs:QName, etc) the byte stream will be UTF-8 encoded.
     * @throws UnsupportedOperationException If the underlying value object
     * cannot be represented as a byte stream.
     */
    InputStream asInputStream();

    /**
     * Write the value of this item to the provided {@link Writer} object. The
     * {@link Reader} returned by the method {@link #asReader()} will be used as
     * the value source.
     *
     * @param writer A client-provided, open {@link Writer} object to which the
     * value will be written. The {@link Writer} will not be closed by this
     * method.
     * @throws IOException
     */
    void writeTo(Writer writer) throws IOException;

    /**
     * Write the value of this item to the provided {@link OutputStream} object.
     * The {@link InputStream} returned by the method {@link #asInputStream()}
     * will be as the value source.
     *
     * @param outputStream A Client-provided, open {@link OutputStream} object
     * to which the value will be written. The {@link OutputStream} will not be
     * closed by this method.
     * @throws IOException
     */
    void writeTo(OutputStream outputStream) throws IOException;

    /**
     * Indicates whether this item's value is buffered in memory. If so it is
     * safe to call any of the accessor methods
     * ({@link XdmValue#asString()}, {@link #asInputStream()} or
     * {@link #asReader()}) and to call them repeatedly.
     *
     * <p>
     * Normally this method will only return {@code false} for
     * {@link ResultItem} instances which are members of a streaming
     * {@link ResultSequence}s. However, even such instances may be indicate
     * that they are cached if, for example, {@link XdmValue#asString()} is the
     * first method invoked. Doing so will buffer the value which can then be
     * reused for subsequent invocations of {@link #asReader()} or
     * {@link #asInputStream()}.</p>
     *
     * @return {@code true} if the value is buffered and may be retrieved
     * repeatedly, {@code false} if not.
     */
    boolean isCached();

}
