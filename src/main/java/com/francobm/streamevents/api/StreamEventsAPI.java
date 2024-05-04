package com.francobm.streamevents.api;

import com.francobm.streamevents.api.cache.actions.Action;
import com.francobm.streamevents.loaders.PlayerDataLoader;
import com.francobm.streamevents.utils.SENotInstalledException;

public class StreamEventsAPI {

    public void registerCustomAction(String call, Action action) {
        throw new SENotInstalledException();
    }

    public PlayerDataLoader getPlayerDataLoader() {
        throw new SENotInstalledException();
    }
}
