package com.marklogic.xcc;

/**
 * This interface encapsulates a user identity. It is intended primarily for
 * internal use.
 *
 * @see <a href="http://docs.marklogic.com/javadoc/xcc/com/marklogic/xcc/UserCredentials.html">
 * Interface UserCredentials</a>
 */
public interface UserCredentials {

    String getUserName();

    String toHttpBasicAuth();

    String toHttpDigestAuth(String method, String uri, String challengeHeader);

}
