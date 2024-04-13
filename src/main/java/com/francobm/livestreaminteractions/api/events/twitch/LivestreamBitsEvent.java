package com.francobm.livestreaminteractions.api.events.twitch;

import com.francobm.livestreaminteractions.api.cache.websocket.WebSocketConfig;
import com.francobm.livestreaminteractions.api.events.data.twitch.Bit;
import com.francobm.livestreaminteractions.api.cache.StreamType;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class LivestreamBitsEvent extends Event {
    private static final HandlerList HANDLER_LIST = new HandlerList();
    private final Bit bits;
    private final StreamType streamType;
    private final WebSocketConfig webSocketConfig;

    public LivestreamBitsEvent(StreamType streamType, WebSocketConfig webSocketConfig, Bit bits) {
        super(true);
        this.bits = bits;
        this.streamType = streamType;
        this.webSocketConfig = webSocketConfig;
    }

    public Bit getBits() {
        return bits;
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
