package jp.co.antenna.XfoJavaCtl;

/**
 * This is used when receiving the formatted page number as an event generated
 * in the formatting process.
 *
 * <p>If the class that implements this interface is registered using the
 * {@link XfoObj#setFormatPageListener} method, the page number from
 * {@link XfoObj} can be received as the event.</p>
 *
 * @see <a href="http://antennahouse.com/product/ahf60/docs/javadoc/jp/co/antenna/XfoJavaCtl/XfoFormatPageListener.html">
 * Interface XfoFormatPageListener</a>
 */
public interface XfoFormatPageListener {

    /**
     * Returns the formatted page number that occurred during the formatting
     * process.
     *
     * <ul>
     * <li>More than or equal to 1: Page number when formatting finished.</li>
     * <li>0: All page formatting has finished.</li>
     * <li>-1: Start of first pass of 2-pass formatting.</li>
     * <li>-2: Start of second pass of 2-pass formatting.</li>
     * </ul>
     *
     * @param pageNo page number
     */
    void onFormatPage(int pageNo);

}
