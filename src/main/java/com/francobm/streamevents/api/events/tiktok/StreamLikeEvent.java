package com.francobm.streamevents.api.events.tiktok;

import com.francobm.streamevents.api.cache.websocket.WebSocketConfig;
import com.francobm.streamevents.api.events.data.tiktok.EventLikeData;
import com.francobm.streamevents.api.cache.StreamType;
import com.francobm.streamevents.utils.SENotInstalledException;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class StreamLikeEvent extends Event {

    public StreamLikeEvent(StreamType streamType, WebSocketConfig webSocketConfig, EventLikeData eventLikeData) {
        super(true);
        throw new SENotInstalledException();
    }

    public EventLikeData getEventLikeData() {
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
