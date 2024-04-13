package com.francobm.livestreaminteractions.api.cache.websocket;

import java.util.ArrayList;
import java.util.List;

public class WebSocketConfig {
    private final String user;
    private String token;
    private final List<String> players;
    private boolean tryingConnect;

    public WebSocketConfig(String user) {
        this(user, "");
    }

    public WebSocketConfig(String user, String token) {
        this.user = user;
        this.token = token;
        players = new ArrayList<>();
    }

    public String getUser() {
        return user;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean isTryingConnect() {
        return tryingConnect;
    }

    public void setTryingConnect(boolean tryingConnect) {
        this.tryingConnect = tryingConnect;
    }

    public List<String> getPlayers() {
        return players;
    }
}
