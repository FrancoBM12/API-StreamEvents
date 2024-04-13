package com.francobm.livestreaminteractions.api.events;

import com.francobm.livestreaminteractions.api.cache.StreamType;
import com.francobm.livestreaminteractions.api.cache.websocket.WebSocketConfig;
import com.francobm.livestreaminteractions.api.events.data.EventChatData;
import com.francobm.livestreaminteractions.utils.LINotInstalledException;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class LivestreamChatEvent extends Event {

    public LivestreamChatEvent(StreamType streamType, WebSocketConfig webSocketConfig, EventChatData eventChatData) {
        super(true);
        throw new LINotInstalledException();
    }

    public EventChatData getEventChatData() {
        throw new LINotInstalledException();
    }

    public StreamType getStreamType() {
        throw new LINotInstalledException();
    }

    public WebSocketConfig getWebSocketConfig() {
        throw new LINotInstalledException();
    }

    @Override
    public HandlerList getHandlers() {
        throw new LINotInstalledException();
    }

    public static HandlerList getHandlerList() {
        throw new LINotInstalledException();
    }
}
