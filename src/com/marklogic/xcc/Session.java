package com.marklogic.xcc;

import com.marklogic.xcc.exceptions.RequestException;
import java.io.Closeable;
import java.util.List;
import javax.transaction.xa.XAResource;

/**
 * A {@link Session} object represents a conversation with a contentbase
 * (database) on a MarkLogic Server instance ({@link ContentSource}) and holds
 * state information related to that conversation. Connections to the server are
 * created and released as needed and are automatically pooled.
 *
 * <p>
 * {@link Session}s are created by invoking one of the
 * {@link ContentSource#newSession()} factory methods.</p>
 *
 * @see <a href="http://docs.marklogic.com/javadoc/xcc/com/marklogic/xcc/Session.html">
 * Interface Session</a>
 */
public interface Session extends Closeable {

    ContentSource getContentSource();

    UserCredentials getUserCredentials();

    String getContentBaseName();

    XAResource getXAResource();

    void setTransactionMode(TransactionMode mode);

    TransactionMode getTransactionMode();

    void setTransactionTimeout(int seconds) throws RequestException;

    int getTransactionTimeout() throws RequestException;

    void commit() throws RequestException;

    void rollback() throws RequestException;

    @Override
    void close();

    boolean isClosed();

    ResultSequence submitRequest(Request request) throws RequestException;

    AdhocQuery newAdhocQuery(String queryText, RequestOptions options);

    AdhocQuery newAdhocQuery(String queryText);

    ModuleInvoke newModuleInvoke(String moduleUri, RequestOptions options);

    ModuleInvoke newModuleInvoke(String moduleUri);

    ModuleSpawn newModuleSpawn(String moduleUri, RequestOptions options);

    ModuleSpawn newModuleSpawn(String moduleUri);

    void insertContent(Content content) throws RequestException;

    void insertContent(Content[] content) throws RequestException;

    List<RequestException> insertContentCollectErrors(Content[] content) throws RequestException;

    public enum TransactionMode {
        AUTO,
        QUERY,
        UPDATE,
    }

}
