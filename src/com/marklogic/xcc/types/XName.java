package com.marklogic.xcc.types;

/**
 * An Expanded Name, consisting of a (optional) namespace name and a local name.
 * {@link XName} instances are immutable and may be shared.
 *
 * @see <a href="http://docs.marklogic.com/javadoc/xcc/com/marklogic/xcc/types/XName.html">
 * Class XName</a>
 */
public class XName {

    /**
     * Construct an {@link XName} with the given namespace name and local name.
     *
     * @param namespace A namespace name as a {@link String}. A value of {@code null} indicate the default namespace.
     * @param localname The local name as a {@link String}.
     */
    public XName(String namespace, String localname) {
        throw new UnsupportedOperationException();
    }

    /**
     * Construct an {@link XName} with the given local name in the default
     * namespace. This is equivalent to {@code new XName(null, "somename")}.
     *
     * @param localname The local name as a {@link String}.
     */
    public XName(String localname) {
        throw new UnsupportedOperationException();
    }

    /**
     * This {@link XName}'s namespace name, if defined.
     *
     * @return The namespace name of this {@link XName}, or {@code null} for the
     * default namespace.
     */
    public String getNamespace() {
        throw new UnsupportedOperationException();
    }

    /**
     * This {@link XName}'s local name.
     *
     * @return The local name of this {@link XName}.
     */
    public String getLocalname() {
        throw new UnsupportedOperationException();
    }

}
