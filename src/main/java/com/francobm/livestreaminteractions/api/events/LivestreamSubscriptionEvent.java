package com.francobm.livestreaminteractions.api.events;

import com.francobm.livestreaminteractions.api.cache.StreamType;
import com.francobm.livestreaminteractions.api.cache.websocket.WebSocketConfig;
import com.francobm.livestreaminteractions.api.events.data.EventSubscriptionData;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class LivestreamSubscriptionEvent extends Event {
    private static final HandlerList HANDLER_LIST = new HandlerList();
    private final EventSubscriptionData eventSubscriptionData;
    private final StreamType streamType;
    private final WebSocketConfig webSocketConfig;

    public LivestreamSubscriptionEvent(StreamType streamType, WebSocketConfig webSocketConfig, EventSubscriptionData eventSubscriptionData) {
        super(true);
        this.eventSubscriptionData = eventSubscriptionData;
        this.streamType = streamType;
        this.webSocketConfig = webSocketConfig;
    }

    public EventSubscriptionData getEventSubscriptionData() {
        return eventSubscriptionData;
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
