package com.francobm.streamevents.utils;

public class SENotInstalledException extends UnsupportedOperationException {
    public SENotInstalledException() {
        super("Error: LivestreamInteractions is not installed, please install it to use this API.");
    }
}
