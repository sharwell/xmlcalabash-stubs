package com.marklogic.xcc;

import com.marklogic.xcc.types.XdmItem;

/**
 * An {@link XdmItem} that is a member of a {@link ResultSequence}. The values
 * associated with {@link ResultItem} instances may be transient.
 * {@link ResultItem} wraps an {@link XdmItem} instance and also implements the
 * {@link XdmItem} interface. Invoking the methods of the {@link XdmItem}
 * interface are passed through to the contained instance.
 *
 * <p>
 * Because a {@link ResultSequence} may be streaming, the contained
 * {@link XdmItem} may be have been partially consumed. Use the
 * {@link #isFetchable()} method to determine if it is safe to access the
 * value.</p>
 *
 * @see <a href="http://docs.marklogic.com/javadoc/xcc/com/marklogic/xcc/ResultItem.html">
 * Interface ResultItem</a>
 */
public interface ResultItem extends XdmItem {

    String getDocumentURI();

    String getNodePath();

    XdmItem getItem();

    int getIndex();

    boolean isFetchable();

    void cache();

}
