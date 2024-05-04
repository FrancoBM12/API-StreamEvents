package com.francobm.streamevents.api.cache;

import com.francobm.streamevents.utils.SENotInstalledException;
import org.bukkit.entity.Player;

public class PlayerData {


    public Player getPlayer() {
        throw new SENotInstalledException();
    }

    public void updateLines(String... lines){
        throw new SENotInstalledException();
    }

    public String getStreamer() {
        throw new SENotInstalledException();
    }

    public String[] getStreamers() {
        throw new SENotInstalledException();
    }
}
