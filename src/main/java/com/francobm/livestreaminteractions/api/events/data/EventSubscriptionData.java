package com.francobm.livestreaminteractions.api.events.data;

public class EventSubscriptionData {
    private final String id;
    private final String user;
    private final int months;
    private final String message;
    private final String emotes;
    private final String subPlan;
    private final String subPlanName;
    private final String subType;

    public EventSubscriptionData(String id, String user, int months, String message, String emotes, String subPlan, String subPlanName, String subType) {
        this.id = id;
        this.user = user;
        this.months = months;
        this.message = message;
        this.emotes = emotes;
        this.subPlan = subPlan;
        this.subPlanName = subPlanName;
        this.subType = subType;
    }

    public String getId() {
        return id;
    }

    public String getUser() {
        return user;
    }

    public int getMonths() {
        return months;
    }

    public String getMessage() {
        return message;
    }

    public String getEmotes() {
        return emotes;
    }

    public String getSubPlan() {
        return subPlan;
    }

    public String getSubPlanName() {
        return subPlanName;
    }

    public String getSubType() {
        return subType;
    }
}
