package com.francobm.livestreaminteractions.api.events;

import com.francobm.livestreaminteractions.api.cache.websocket.WebSocketConfig;
import com.francobm.livestreaminteractions.api.events.data.EventFollowData;
import com.francobm.livestreaminteractions.cache.StreamType;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class LivestreamFollowEvent extends Event {
    private static final HandlerList HANDLER_LIST = new HandlerList();
    private final EventFollowData eventFollowData;
    private final StreamType streamType;
    private final WebSocketConfig webSocketConfig;

    public LivestreamFollowEvent(StreamType streamType, WebSocketConfig webSocketConfig, EventFollowData eventFollowData) {
        super(true);
        this.eventFollowData = eventFollowData;
        this.streamType = streamType;
        this.webSocketConfig = webSocketConfig;
    }

    public EventFollowData getEventFollowData() {
        return eventFollowData;
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
