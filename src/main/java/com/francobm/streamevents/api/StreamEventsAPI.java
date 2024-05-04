package com.francobm.streamevents.api;

import com.francobm.streamevents.api.cache.actions.Action;
import com.francobm.streamevents.api.cache.events.EventGoal;
import com.francobm.streamevents.loaders.PlayerDataLoader;
import com.francobm.streamevents.utils.SENotInstalledException;

public class StreamEventsAPI {

    public void registerCustomAction(String call, Class<? extends Action> action) {
        throw new SENotInstalledException();
    }

    public PlayerDataLoader getPlayerDataLoader() {
        throw new SENotInstalledException();
    }

    public String parseVariables(String message, EventGoal<?> eventGoal, Object... variables) {
        throw new SENotInstalledException();
    }

    public String[] parseVariables(String[] message, EventGoal<?> eventGoal, Object... variables) {
        throw new SENotInstalledException();
    }
}
