package com.francobm.livestreaminteractions.api.events.twitch;

import com.francobm.livestreaminteractions.api.cache.websocket.WebSocketConfig;
import com.francobm.livestreaminteractions.api.events.data.twitch.Host;
import com.francobm.livestreaminteractions.cache.StreamType;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class LivestreamHostEvent extends Event {
    private static final HandlerList HANDLER_LIST = new HandlerList();
    private final Host host;
    private final StreamType streamType;
    private final WebSocketConfig webSocketConfig;

    public LivestreamHostEvent(StreamType streamType, WebSocketConfig webSocketConfig, Host host) {
        super(true);
        this.host = host;
        this.streamType = streamType;
        this.webSocketConfig = webSocketConfig;
    }

    public Host getHost() {
        return host;
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
