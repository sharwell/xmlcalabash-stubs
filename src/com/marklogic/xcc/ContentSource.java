package com.marklogic.xcc;

public interface ContentSource {

    void setAuthenticationPreemptive(boolean value);

    public Session newSession();

}
