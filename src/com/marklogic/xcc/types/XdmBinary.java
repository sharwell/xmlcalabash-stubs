package com.marklogic.xcc.types;

/**
 * An XDM-like binary() value (binary() is a MarkLogic extension).
 *
 * @see <a href="http://docs.marklogic.com/javadoc/xcc/com/marklogic/xcc/types/XdmBinary.html">
 * Interface XdmBinary</a>
 */
public interface XdmBinary extends XdmNode {

    /**
     * Buffers the binary() item from the server and converts it to a Java byte
     * array. This method may be invoked repeatedly. On subsequent invocations
     * it will return the same array constructed by the first invocation.
     * <strong>NOTE:</strong> If the binary() item is large, it is possible that
     * an {@link OutOfMemoryError} could result when invoking this method, which
     * could result in your program crashing. If you need to handle arbitrarily
     * large binary() items, use the {@link XdmItem#asInputStream()} method.
     *
     * @return This item as a Java byte array.
     * @throws IllegalStateException If called after the InputStream has already
     * been consumed.
     */
    byte[] asBinaryData();

}
