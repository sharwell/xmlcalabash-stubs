package com.marklogic.xcc.types;

/**
 * Each instance of this class corresponds to an XQuery schema type.
 *
 * @see <a href="http://docs.marklogic.com/javadoc/xcc/com/marklogic/xcc/types/ItemType.html">
 * Class ItemType</a>
 */
public abstract class ItemType {

    /**
     * Always returns {@code false}.
     *
     * @return Always {@code false} for {@link XdmItem} types.
     */
    public final boolean isSequence() {
        throw new UnsupportedOperationException();
    }

    /**
     * Implemented by subclasses.
     *
     * @return {@code true} for node item types, {@code false} otherwise.
     */
    public abstract boolean isNode();

    /**
     * Implemented by subclasses.
     *
     * @return {@code true} for atomic item types, {@code false} otherwise.
     */
    public abstract boolean isAtomic();

    /**
     *
     * @param schemaTypeName An XML Schema type name, such as "xs:integer".
     * @return A typesafe enumeration member that represents the type, or
     * {@code null} if the type name is not recognized. Note that type names are
     * case-sensitive.
     */
    public static ItemType forType(String schemaTypeName) {
        throw new UnsupportedOperationException();
    }

}
