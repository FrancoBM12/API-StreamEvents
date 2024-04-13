package com.francobm.livestreaminteractions.api.events;

import com.francobm.livestreaminteractions.api.cache.StreamType;
import com.francobm.livestreaminteractions.api.cache.websocket.WebSocketConfig;
import com.francobm.livestreaminteractions.api.events.data.EventChatData;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class LivestreamChatEvent extends Event {
    private static final HandlerList HANDLER_LIST = new HandlerList();
    private final EventChatData eventChatData;
    private final StreamType streamType;
    private final WebSocketConfig webSocketConfig;

    public LivestreamChatEvent(StreamType streamType, WebSocketConfig webSocketConfig, EventChatData eventChatData) {
        super(true);
        this.eventChatData = eventChatData;
        this.streamType = streamType;
        this.webSocketConfig = webSocketConfig;
    }

    public EventChatData getEventChatData() {
        return eventChatData;
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
