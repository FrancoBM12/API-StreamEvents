package com.francobm.livestreaminteractions.api.events.data;

public class EventRedeemPointData {
    private final String id;
    private final String title;
    private final String channelId;
    private final String status;
    private final String redeemedAt;
    private final String user;
    private final long cost;
    private final String prompt;
    private final String backgroundColorHex;

    public EventRedeemPointData(String id, String title, String channelId, String status, String redeemedAt, String user, long cost, String prompt, String backgroundColorHex) {
        this.id = id;
        this.title = title;
        this.channelId = channelId;
        this.status = status;
        this.redeemedAt = redeemedAt;
        this.user = user;
        this.cost = cost;
        this.prompt = prompt;
        this.backgroundColorHex = backgroundColorHex;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getChannelId() {
        return channelId;
    }

    public String getStatus() {
        return status;
    }

    public String getRedeemedAt() {
        return redeemedAt;
    }

    public String getUser() {
        return user;
    }

    public long getCost() {
        return cost;
    }

    public String getPrompt() {
        return prompt;
    }

    public String getBackgroundColorHex() {
        return backgroundColorHex;
    }
}
