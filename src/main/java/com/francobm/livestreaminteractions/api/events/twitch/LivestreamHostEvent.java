package com.francobm.livestreaminteractions.api.events.twitch;

import com.francobm.livestreaminteractions.api.cache.websocket.WebSocketConfig;
import com.francobm.livestreaminteractions.api.events.data.twitch.Host;
import com.francobm.livestreaminteractions.api.cache.StreamType;
import com.francobm.livestreaminteractions.utils.LINotInstalledException;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class LivestreamHostEvent extends Event {

    public LivestreamHostEvent(StreamType streamType, WebSocketConfig webSocketConfig, Host host) {
        super(true);
        throw new LINotInstalledException();
    }

    public Host getHost() {
        throw new LINotInstalledException();
    }

    public StreamType getStreamType() {
        throw new LINotInstalledException();
    }

    public WebSocketConfig getWebSocketConfig() {
        throw new LINotInstalledException();
    }

    @Override
    public HandlerList getHandlers() {
        throw new LINotInstalledException();
    }

    public static HandlerList getHandlerList() {
        throw new LINotInstalledException();
    }
}
