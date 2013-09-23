package com.marklogic.xcc.types;

import java.util.Iterator;

public interface XdmSequence<I extends XdmItem> extends XdmValue {

    Iterator<I> iterator();

}
