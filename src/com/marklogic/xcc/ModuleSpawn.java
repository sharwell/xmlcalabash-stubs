package com.marklogic.xcc;

/**
 * An extension of {@link Request} that contains the URI of an XQuery module
 * (resident server-side) to be spawned asynchronously by the MarkLogic Server.
 *
 * @see <a href="http://docs.marklogic.com/javadoc/xcc/com/marklogic/xcc/ModuleSpawn.html">
 * Interface ModuleSpawn</a>
 */
public interface ModuleSpawn extends Request {

    /**
     * Replace the URI associated with this {@link Request}, which specifies an
     * XQuery module (server-side code) to be spawned (run asynchronously) on
     * the server.
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
