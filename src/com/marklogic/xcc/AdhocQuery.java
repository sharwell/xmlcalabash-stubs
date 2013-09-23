package com.marklogic.xcc;

/**
 * A specialization of {@link Request} which contains an ad-hoc query (XQuery
 * code as a literal String) to be submitted and evaluated by the MarkLogic
 * Server.
 *
 * @see <a href="http://docs.marklogic.com/javadoc/xcc/com/marklogic/xcc/AdhocQuery.html">
 * Interface AdhocQuery</a>
 */
public interface AdhocQuery extends Request {

    /**
     * Replace the XQuery code to be submitted and evaluated with this
     * {@link Request}.
     *
     * @param query 
     */
    void setQuery(String query);

    /**
     * Returns the currently set ad-hoc XQuery string.
     *
     * @return A {@link String} which is the ad-hoc query to run when this
     * {@link Request} is next passed to {@link Session#submitRequest(Request)}.
     */
    String getQuery();

}
