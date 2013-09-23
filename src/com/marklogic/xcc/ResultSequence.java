package com.marklogic.xcc;

import com.marklogic.xcc.types.XdmItem;
import com.marklogic.xcc.types.XdmSequence;
import java.util.Iterator;

public interface ResultSequence extends XdmSequence<ResultItem> {

    void close();

    ResultItem current();

    boolean hasNext();

    boolean isCached();

    boolean isClosed();

    XdmItem itemAt(int index);

    @Override
    Iterator<ResultItem> iterator();

    ResultItem next();

    ResultItem resultItemAt(int index);

    void rewind();

    int size();

    ResultSequence toCached();

    ResultItem[] toResultItemArray();

    @Override
    String toString();

}
