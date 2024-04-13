package com.francobm.livestreaminteractions.api.events.data.tiktok;

public class EventShareData {
    private final String user;
    private final int shareCount;
    public EventShareData(String user, int shareCount) {
        this.user = user;
        this.shareCount = shareCount;
    }

    public String getUser() {
        return user;
    }

    public int getShareCount() {
        return shareCount;
    }
}
