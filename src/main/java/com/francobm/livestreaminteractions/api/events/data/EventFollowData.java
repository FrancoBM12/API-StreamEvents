package com.francobm.livestreaminteractions.api.events.data;

public class EventFollowData {
    private final String user;
    private final boolean follow;

    public EventFollowData(String user) {
        this(user, true);
    }

    public EventFollowData(String user, boolean follow) {
        this.user = user;
        this.follow = follow;
    }

    public String getUser() {
        return user;
    }

    public boolean isFollow() {
        return follow;
    }
}
