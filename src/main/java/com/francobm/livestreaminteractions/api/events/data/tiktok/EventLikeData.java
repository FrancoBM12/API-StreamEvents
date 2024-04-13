package com.francobm.livestreaminteractions.api.events.data.tiktok;

public class EventLikeData {

    private final String user;
    private final int likesCount;
    private final int totalLikesCount;

    public EventLikeData(String user, int likesCount, int totalLikesCount) {
        this.user = user;
        this.likesCount = likesCount;
        this.totalLikesCount = totalLikesCount;
    }

    public String getUser() {
        return user;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public int getTotalLikesCount() {
        return totalLikesCount;
    }
}
