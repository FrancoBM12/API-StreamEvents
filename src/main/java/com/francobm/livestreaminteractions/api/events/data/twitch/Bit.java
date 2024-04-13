package com.francobm.livestreaminteractions.api.events.data.twitch;

public class Bit {
    private int id;
    private String name;
    private String amount;
    private String emotes;
    private String message;
    private String _id;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAmount() {
        return amount;
    }

    public String getEmotes() {
        return emotes;
    }

    public String getMessage() {
        return message;
    }

    public String get_id() {
        return _id;
    }
}
