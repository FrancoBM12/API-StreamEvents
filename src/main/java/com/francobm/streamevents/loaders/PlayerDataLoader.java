package com.francobm.streamevents.loaders;

import com.francobm.streamevents.api.cache.PlayerData;
import com.francobm.streamevents.utils.SENotInstalledException;
import org.bukkit.entity.Player;

import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class PlayerDataLoader {

    public PlayerData getOrAddPlayer(Player player){
        throw new SENotInstalledException();
    }

    public PlayerData getPlayer(Player player){
        throw new SENotInstalledException();
    }

    public Set<String> getPlayersName(){
        throw new SENotInstalledException();
    }

    public void removePlayer(Player player){
        throw new SENotInstalledException();
    }

    public Map<UUID, PlayerData> getPlayers() {
        throw new SENotInstalledException();
    }
}
