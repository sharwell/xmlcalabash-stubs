package com.marklogic.xcc;

/**
 * An specialization of {@link Request} that contains the URI of an XQuery
 * module (resident in the server) to be evaluated by the MarkLogic Server.
 *
 * <p>
 * XCC can connect to a 3.0 MarkLogic Server, but there was an change in the way
 * module invocations are encoded between 3.0 and 3.1. If you wish use XCC to
 * invoke or spawn a module on a 3.0 server, you must set the system property
 * {@code xcc.module.invoke.oldstyle} to the value {@code true}. System
 * properties can be set at JVM startup with a command line argument of the form
 * {@code -Dproperty=value} or by calling
 * {@link System#setProperty(String, String)} programmatically.</p>
 *
 * @see <a href="http://docs.marklogic.com/javadoc/xcc/com/marklogic/xcc/ModuleInvoke.html">
 * Interface ModuleInvoke</a>
 */
public interface ModuleInvoke extends Request {

    /**
     * Replace the URI associated with this {@link Request}, which specifies an
     * XQuery module (server-side code) to be invoked on the server.
     *
     * @param uri A {@link String} that represents the URI of a text document
     * known to the server which is an XQuery module.
     */
    void setModuleUri(String uri);

    /**
     * Returns the currently set URI for this {@link Request}.
     *
     * @return The URI, as a {@link String}, of a module to invoke upon the next
     * invocation of {@link Session#submitRequest(Request)}.
     */
    String getModuleUri();

}
