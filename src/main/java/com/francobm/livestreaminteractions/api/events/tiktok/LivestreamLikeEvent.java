package com.francobm.livestreaminteractions.api.events.tiktok;

import com.francobm.livestreaminteractions.api.cache.websocket.WebSocketConfig;
import com.francobm.livestreaminteractions.api.events.data.tiktok.EventLikeData;
import com.francobm.livestreaminteractions.api.cache.StreamType;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class LivestreamLikeEvent extends Event {
    private static final HandlerList HANDLER_LIST = new HandlerList();
    private final EventLikeData eventLikeData;
    private final StreamType streamType;
    private final WebSocketConfig webSocketConfig;

    public LivestreamLikeEvent(StreamType streamType, WebSocketConfig webSocketConfig, EventLikeData eventLikeData) {
        super(true);
        this.eventLikeData = eventLikeData;
        this.streamType = streamType;
        this.webSocketConfig = webSocketConfig;
    }

    public EventLikeData getEventLikeData() {
        return eventLikeData;
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
