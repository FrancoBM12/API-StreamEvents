package com.francobm.streamevents.api.events;

import com.francobm.streamevents.api.cache.websocket.WebSocketConfig;
import com.francobm.streamevents.api.events.data.EventRedeemPointData;
import com.francobm.streamevents.api.cache.StreamType;
import com.francobm.streamevents.utils.SENotInstalledException;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class StreamRedeemPointEvent extends Event {

    public StreamRedeemPointEvent(StreamType streamType, WebSocketConfig webSocketConfig, EventRedeemPointData eventRedeemPointData) {
        super(true);
        throw new SENotInstalledException();
    }

    public EventRedeemPointData getEventRedeemPointData() {
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
