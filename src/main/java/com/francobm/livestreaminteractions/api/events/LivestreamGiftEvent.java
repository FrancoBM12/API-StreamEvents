package com.francobm.livestreaminteractions.api.events;

import com.francobm.livestreaminteractions.api.cache.websocket.WebSocketConfig;
import com.francobm.livestreaminteractions.api.events.data.EventGiftData;
import com.francobm.livestreaminteractions.api.cache.StreamType;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class LivestreamGiftEvent extends Event {
    private static final HandlerList HANDLER_LIST = new HandlerList();
    private final EventGiftData eventGiftData;
    private final StreamType streamType;
    private final WebSocketConfig webSocketConfig;

    public LivestreamGiftEvent(StreamType streamType, WebSocketConfig webSocketConfig, EventGiftData eventGiftData) {
        super(true);
        this.eventGiftData = eventGiftData;
        this.streamType = streamType;
        this.webSocketConfig = webSocketConfig;
    }

    public EventGiftData getEventGiftData() {
        return eventGiftData;
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
