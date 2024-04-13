package com.francobm.livestreaminteractions.utils;

public class LINotInstalledException extends UnsupportedOperationException {
    public LINotInstalledException() {
        super("Error: LivestreamInteractions is not installed, please install it to use this API.");
    }
}
