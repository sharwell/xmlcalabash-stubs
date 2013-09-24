package com.renderx.xep.lib;

import com.renderx.util.ErrorHandler;

public interface Logger extends ErrorHandler {

    public static final Logger NULL_LOGGER = null;

    void openDocument();

    void closeDocument();

    void event(String string, String string1);

    void openState(String string);

    void closeState(String string);

    void info(String string);

    void warning(String string);

    void error(String string);

    void exception(String string, Exception excptn);

}
