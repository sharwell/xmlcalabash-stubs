package com.deltaxml.core;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.net.URL;
import javax.xml.transform.Result;
import javax.xml.transform.Source;

public class PipelinedComparator {

    public void compare(File f1, File f2, File result) {
        throw new UnsupportedOperationException();
    }

    public void compare(InputStream is1, InputStream is2, OutputStream result) {
        throw new UnsupportedOperationException();
    }

    public void compare(Reader r1, Reader r2, Writer result) {
        throw new UnsupportedOperationException();
    }

    public void compare(Source s1, Source s2, Result result) {
        throw new UnsupportedOperationException();
    }

    public void compare(String s1, String s2, StringBuffer result) {
        throw new UnsupportedOperationException();
    }

    public void compare(URL u1, URL u2, File result) {
        throw new UnsupportedOperationException();
    }

    public void compare(URL u1, URL u2, URL result) {
        throw new UnsupportedOperationException();
    }

}
