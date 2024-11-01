package com.francobm.streamevents.api.cache.actions;

import com.francobm.streamevents.api.cache.CustomParams;
import com.francobm.streamevents.api.cache.PlayerData;
import com.francobm.streamevents.api.cache.events.EventGoal;
import com.francobm.streamevents.utils.SENotInstalledException;

public abstract class Action {

    public Action(String call) {
        throw new SENotInstalledException();
    }

    public CustomParams getCustomParams() {
        throw new SENotInstalledException();
    }

    public Action getRegisteredAction(String action) {
        throw new SENotInstalledException();
    }

    public abstract void run(PlayerData playerData, EventGoal<?> eventGoal, Object... variables);
}