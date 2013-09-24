package com.renderx.util;

public interface ErrorHandler {

    void info(String string);

    void warning(String string);

    void error(String string);

    void exception(String string, Exception excptn);

}
