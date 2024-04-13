package com.francobm.livestreaminteractions.api.events.twitch;

import com.francobm.livestreaminteractions.api.cache.websocket.WebSocketConfig;
import com.francobm.livestreaminteractions.api.events.data.twitch.Raid;
import com.francobm.livestreaminteractions.api.cache.StreamType;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class LivestreamRaidEvent extends Event {
    private static final HandlerList HANDLER_LIST = new HandlerList();
    private final Raid raid;
    private final StreamType streamType;
    private final WebSocketConfig webSocketConfig;

    public LivestreamRaidEvent(StreamType streamType, WebSocketConfig webSocketConfig, Raid raid) {
        super(true);
        this.raid = raid;
        this.streamType = streamType;
        this.webSocketConfig = webSocketConfig;
    }

    public Raid getRaid() {
        return raid;
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
