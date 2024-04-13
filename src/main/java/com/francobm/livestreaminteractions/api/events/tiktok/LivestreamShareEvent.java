package com.francobm.livestreaminteractions.api.events.tiktok;

import com.francobm.livestreaminteractions.api.cache.websocket.WebSocketConfig;
import com.francobm.livestreaminteractions.api.events.data.tiktok.EventShareData;
import com.francobm.livestreaminteractions.api.cache.StreamType;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class LivestreamShareEvent extends Event {
    private static final HandlerList HANDLER_LIST = new HandlerList();
    private final EventShareData eventShareData;
    private final StreamType streamType;
    private final WebSocketConfig webSocketConfig;

    public LivestreamShareEvent(StreamType streamType, WebSocketConfig webSocketConfig, EventShareData eventShareData) {
        super(true);
        this.eventShareData = eventShareData;
        this.streamType = streamType;
        this.webSocketConfig = webSocketConfig;
    }

    public EventShareData getEventShareData() {
        return eventShareData;
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
