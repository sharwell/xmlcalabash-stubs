package jp.co.antenna.XfoJavaCtl;

/**
 * This is used when receiving the error information as an event generated in
 * the formatting process.
 *
 * If the class that implements this interface is registered using the
 * {@link XfoObj#setMessageListener} method, the error from {@link XfoObj} can
 * be received as the event.
 *
 * @see <a href="http://antennahouse.com/product/ahf60/docs/javadoc/jp/co/antenna/XfoJavaCtl/MessageListener.html">
 * Interface MessageListener</a>
 */
public interface MessageListener {

    /**
     * Returns the error informations that occurred during the formatting
     * process.
     *
     * @param errLevel Error level
     * @param errCode Error code
     * @param errMessage Error message
     */
    void onMessage(int errLevel, int errCode, String errMessage);

}
