package com.francobm.livestreaminteractions.api.events;

import com.francobm.livestreaminteractions.api.cache.websocket.WebSocketConfig;
import com.francobm.livestreaminteractions.api.events.data.EventRedeemPointData;
import com.francobm.livestreaminteractions.cache.StreamType;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class LivestreamRedeemPointEvent extends Event {
    private static final HandlerList HANDLER_LIST = new HandlerList();
    private final EventRedeemPointData eventRedeemPointData;
    private final StreamType streamType;
    private final WebSocketConfig webSocketConfig;

    public LivestreamRedeemPointEvent(StreamType streamType, WebSocketConfig webSocketConfig, EventRedeemPointData eventRedeemPointData) {
        super(true);
        this.eventRedeemPointData = eventRedeemPointData;
        this.streamType = streamType;
        this.webSocketConfig = webSocketConfig;
    }

    public EventRedeemPointData getEventRedeemPointData() {
        return eventRedeemPointData;
    }

    public StreamType getStreamType() {
        return streamType;
    }

    public WebSocketConfig getWebSocketConfig() {
        return webSocketConfig;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
