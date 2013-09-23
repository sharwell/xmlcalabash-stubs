package com.marklogic.xcc;

import com.marklogic.xcc.types.XdmItem;
import com.marklogic.xcc.types.XdmSequence;
import java.io.InputStream;
import java.io.Reader;
import java.util.Iterator;

/**
 * A sequence of {@link ResultItem} values as returned from a query or module
 * execution. A {@link ResultSequence} instance is stateful, it holds an
 * internal positional index (cursor) which is updated on successive accesses.
 * It is therefore not recommended that {@link ResultSequence} objects be
 * accessed concurrently by multiple threads.
 *
 * <p>
 * {@link ResultSequence} instances can operate in two modes: cached and
 * non-cached. If a {@link ResultSequence} is cached (default) then all
 * {@link XdmItem}s have been read and buffered. If non-cached, then items may
 * only be accessed sequentially and some values may only be fetched once if
 * accessed as an {@link InputStream} or {@link Reader}.</p>
 *
 * <p>
 * Cached {@link ResultSequence}s need not be closed. Upon return, they no
 * longer tie up any connection resources. However, closing a cached
 * {@link ResultSequence} will invalidate it and prevent further access to its
 * contents.</p>
 *
 * <p>
 * Streaming (non-cached) {@link ResultSequence}s should always be promptly
 * closed. They hold a server connection until closed. If not closed,
 * connections may be tied up indefinitely. Additionally, you should always
 * consume the {@link ResultSequence} in a timely manner, because the server may
 * close the connection if the (server-side configurable) request timeout
 * expires before the data is read out.</p>
 *
 * <p>
 * In general, it is preferable to use cached {@link ResultSequence}s (this is
 * the default) unless you have reason to believe the amount of data returned
 * may be too large to be fully buffered in memory.</p>
 *
 * @see <a href="http://docs.marklogic.com/javadoc/xcc/com/marklogic/xcc/ResultSequence.html">
 * Interface ResultSequence</a>
 */
public interface ResultSequence extends XdmSequence<ResultItem> {

    void close();

    ResultItem current();

    boolean hasNext();

    boolean isCached();

    boolean isClosed();

    @Override
    XdmItem itemAt(int index);

    @Override
    Iterator<ResultItem> iterator();

    ResultItem next();

    ResultItem resultItemAt(int index);

    void rewind();

    @Override
    int size();

    ResultSequence toCached();

    ResultItem[] toResultItemArray();

    @Override
    String toString();

}
