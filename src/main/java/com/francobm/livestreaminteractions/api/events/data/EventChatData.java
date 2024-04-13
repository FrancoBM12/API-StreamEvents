package com.francobm.livestreaminteractions.api.events.data;

public class EventChatData {

    private final String user;
    private final String comment;
    private final String language;

    public EventChatData(String user, String comment, String language) {
        this.user = user;
        this.comment = comment;
        this.language = language;
    }

    public String getUser() {
        return user;
    }

    public String getComment() {
        return comment;
    }

    public String getLanguage() {
        return language;
    }
}
