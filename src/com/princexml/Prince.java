package com.princexml;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * The main Prince class.
 *
 * @see <a href="http://www.princexml.com/doc/8.1/java/api/com/princexml/Prince.html">
 * Class Prince</a>
 */
public class Prince {

    /**
     * Constructor for Prince.
     *
     * @param exePath The path of the Prince executable. (For example, this may
     * be {@code C:\Program Files\Prince\engine\bin\prince.exe} on Windows or
     * {@code /usr/bin/prince} on Linux).
     */
    public Prince(String exePath) {
        throw new UnsupportedOperationException();
    }

    /**
     * Constructor for Prince.
     *
     * @param exePath The path of the Prince executable. (For example, this may
     * be {@code C:\Program Files\Prince\engine\bin\prince.exe} on Windows or
     * {@code /usr/bin/prince} on Linux).
     * @param events An instance of the {@link PrinceEvents} interface that will
     * receive error/warning messages returned from Prince.
     */
    public Prince(String exePath, PrinceEvents events) {
        throw new UnsupportedOperationException();
    }

    /**
     * Add a CSS style sheet that will be applied to each document.
     *
     * @param cssPath The filename of the CSS style sheet.
     */
    public void addStyleSheet(String cssPath) {
        throw new UnsupportedOperationException();
    }

    /**
     * Clear all of the CSS style sheets.
     */
    public void clearStyleSheets() {
        throw new UnsupportedOperationException();
    }

    /**
     * Add a JavaScript script that will be executed before conversion.
     *
     * @param jsPath The filename of the JavaScript script.
     */
    public void addScript(String jsPath) {
        throw new UnsupportedOperationException();
    }

    /**
     * Clear all of the JavaScript scripts.
     */
    public void clearScripts() {
        throw new UnsupportedOperationException();
    }

    public boolean convert(InputStream xmlInput, OutputStream pdfOutput) throws IOException {
        throw new UnsupportedOperationException();
    }

    public boolean convert(String xmlPath) throws IOException {
        throw new UnsupportedOperationException();
    }

    public boolean convert(String xmlPath, OutputStream pdfOutput) throws IOException {
        throw new UnsupportedOperationException();
    }

    public boolean convert(String xmlPath, String pdfPath) throws IOException {
        throw new UnsupportedOperationException();
    }

    public void setBaseURL(String baseurl) {
        throw new UnsupportedOperationException();
    }

    public void setCompress(boolean compress) {
        throw new UnsupportedOperationException();
    }

    public void setDebug(boolean debug) {
        throw new UnsupportedOperationException();
    }

    public void setEmbedFonts(boolean embedFonts) {
        throw new UnsupportedOperationException();
    }

    public void setEncrypt(boolean encrypt) {
        throw new UnsupportedOperationException();
    }

    public void setEncryptInfo(int keyBits, String userPassword, String ownerPassword, boolean disallowPrint, boolean disallowModify, boolean disallowCopy, boolean disallowAnnotate) {
        throw new UnsupportedOperationException();
    }

    public void setFileRoot(String fileRoot) {
        throw new UnsupportedOperationException();
    }

    public void setHTML(boolean html) {
        throw new UnsupportedOperationException();
    }

    public void setHttpPassword(String password) {
        throw new UnsupportedOperationException();
    }

    public void setHttpUsername(String username) {
        throw new UnsupportedOperationException();
    }

    public void setHttpProxy(String proxy) {
        throw new UnsupportedOperationException();
    }

    public void setInputType(String inputType) {
        throw new UnsupportedOperationException();
    }

    public void setJavaScript(boolean javascript) {
        throw new UnsupportedOperationException();
    }

    public void setLog(String logfile) {
        throw new UnsupportedOperationException();
    }

    public void setNetwork(boolean network) {
        throw new UnsupportedOperationException();
    }

    public void setSubsetFonts(boolean subsetFonts) {
        throw new UnsupportedOperationException();
    }

    public void setVerbose(boolean verbose) {
        throw new UnsupportedOperationException();
    }

    public void setXInclude(boolean xinclude) {
        throw new UnsupportedOperationException();
    }

}
