package com.francobm.streamevents.api.events.twitch;

import com.francobm.streamevents.api.cache.websocket.WebSocketConfig;
import com.francobm.streamevents.api.events.data.twitch.Host;
import com.francobm.streamevents.api.cache.StreamType;
import com.francobm.streamevents.utils.SENotInstalledException;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class StreamHostEvent extends Event {

    public StreamHostEvent(StreamType streamType, WebSocketConfig webSocketConfig, Host host) {
        super(true);
        throw new SENotInstalledException();
    }

    public Host getHost() {
        throw new SENotInstalledException();
    }

    public StreamType getStreamType() {
        throw new SENotInstalledException();
    }

    public WebSocketConfig getWebSocketConfig() {
        throw new SENotInstalledException();
    }

    @Override
    public HandlerList getHandlers() {
        throw new SENotInstalledException();
    }

    public static HandlerList getHandlerList() {
        throw new SENotInstalledException();
    }
}
