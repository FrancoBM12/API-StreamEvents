package com.francobm.streamevents.api.events;

import com.francobm.streamevents.api.cache.StreamType;
import com.francobm.streamevents.api.cache.websocket.WebSocketConfig;
import com.francobm.streamevents.api.events.data.EventSubscriptionData;
import com.francobm.streamevents.utils.SENotInstalledException;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class StreamSubscriptionEvent extends Event {

    public StreamSubscriptionEvent(StreamType streamType, WebSocketConfig webSocketConfig, EventSubscriptionData eventSubscriptionData) {
        super(true);
        throw new SENotInstalledException();
    }

    public EventSubscriptionData getEventSubscriptionData() {
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
