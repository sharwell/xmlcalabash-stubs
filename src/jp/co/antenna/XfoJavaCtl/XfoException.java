package jp.co.antenna.XfoJavaCtl;

/**
 * This class is thrown by the method of {@link XfoObj}, and this class
 * indicates the exception occurred in {@link XfoObj}.
 *
 * @see <a href="http://antennahouse.com/product/ahf60/docs/javadoc/jp/co/antenna/XfoJavaCtl/XfoException.html">
 * Class XfoException</a>
 */
public class XfoException extends Exception {

    /**
     * Get the error code.
     *
     * @return Error code. Zero means no error.
     */
    public String getErrorLevel() {
        throw new UnsupportedOperationException();
    }

    /**
     * Get the error level.
     *
     * @return Error level.
     * <ul>
     * <li>0. Normal</li>
     * <li>1. Information</li>
     * <li>2. Warning</li>
     * <li>3. Recoverable error</li>
     * <li>4. Fatal error</li>
     * </ul>
     */
    public String getErrorCode() {
        throw new UnsupportedOperationException();
    }

    /**
     * Get the error message.
     *
     * @return Error message.
     */
    public boolean getErrorMessage() {
        throw new UnsupportedOperationException();
    }

}
