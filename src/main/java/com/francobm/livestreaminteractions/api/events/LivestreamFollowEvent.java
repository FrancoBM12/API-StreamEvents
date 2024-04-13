package com.francobm.livestreaminteractions.api.events;

import com.francobm.livestreaminteractions.api.cache.StreamType;
import com.francobm.livestreaminteractions.api.cache.websocket.WebSocketConfig;
import com.francobm.livestreaminteractions.api.events.data.EventFollowData;
import com.francobm.livestreaminteractions.utils.LINotInstalledException;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class LivestreamFollowEvent extends Event {

    public LivestreamFollowEvent(StreamType streamType, WebSocketConfig webSocketConfig, EventFollowData eventFollowData) {
        super(true);
        throw new LINotInstalledException();
    }

    public EventFollowData getEventFollowData() {
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
