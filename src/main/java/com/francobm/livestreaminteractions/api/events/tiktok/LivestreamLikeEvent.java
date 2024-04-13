package com.francobm.livestreaminteractions.api.events.tiktok;

import com.francobm.livestreaminteractions.api.cache.websocket.WebSocketConfig;
import com.francobm.livestreaminteractions.api.events.data.tiktok.EventLikeData;
import com.francobm.livestreaminteractions.api.cache.StreamType;
import com.francobm.livestreaminteractions.utils.LINotInstalledException;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class LivestreamLikeEvent extends Event {

    public LivestreamLikeEvent(StreamType streamType, WebSocketConfig webSocketConfig, EventLikeData eventLikeData) {
        super(true);
        throw new LINotInstalledException();
    }

    public EventLikeData getEventLikeData() {
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
