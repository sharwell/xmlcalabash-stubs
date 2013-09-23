package com.marklogic.xcc;

import com.marklogic.xcc.exceptions.RequestException;
import java.io.Closeable;

public interface Session extends Closeable {

    @Override
    void close();

    Request newAdhocQuery(String queryText);

    ResultSequence submitRequest(Request request) throws RequestException;

    void insertContent(Content content) throws RequestException;

    ModuleInvoke newModuleInvoke(String moduleUri);

}
