package com.princexml;

/**
 * The {@link PrinceEvents} interface can be used to receive warning and error
 * messages from Prince.
 *
 * @see <a href="http://www.princexml.com/doc/8.1/java/api/com/princexml/PrinceEvents.html">
 * Interface PrinceEvents</a>
 */
public interface PrinceEvents {

    /**
     * This method will be called when a warning or error message is received from Prince.
     *
     * @param msgType The type of the message ("inf", "wrn", or "err").
     * @param msgLocation The name of the file that the message refers to. This may be empty if the message does not refer to any particular file.
     * @param msgText The text of the message.
     */
    void onMessage(String msgType, String msgLocation, String msgText);

}
