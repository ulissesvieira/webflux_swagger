package com.wf.api;

public class ServiceAddresses {
    private final String gtn;

    public ServiceAddresses() {
        gtn = null;
    }

    public ServiceAddresses(String ... addresses) {
        this.gtn = addresses[0];
    }

    public String getGtn() {
        return gtn;
    }
}
