package com.francobm.livestreaminteractions.api.events.data;

public class EventGiftData {
    private final String user;
    private final String giftName;
    private final String giftAmount;
    private final long giftId;
    private final String giftDescribe;
    private final int giftDiamonds;
    private final int giftRepeatCount;
    private final int giftRepeatEnd;

    public EventGiftData(String user, String giftName, String giftAmount, long giftId, String giftDescribe, int giftDiamonds, int giftRepeatCount, int giftRepeatEnd) {
        this.user = user;
        this.giftName = giftName;
        this.giftAmount = giftAmount;
        this.giftId = giftId;
        this.giftDescribe = giftDescribe;
        this.giftDiamonds = giftDiamonds;
        this.giftRepeatCount = giftRepeatCount;
        this.giftRepeatEnd = giftRepeatEnd;
    }

    public String getUser() {
        return user;
    }

    public String getGiftName() {
        return giftName;
    }

    public String getGiftAmount() {
        return giftAmount;
    }

    public long getGiftId() {
        return giftId;
    }

    public String getGiftDescribe() {
        return giftDescribe;
    }

    public int getGiftDiamonds() {
        return giftDiamonds;
    }

    public int getGiftRepeatCount() {
        return giftRepeatCount;
    }

    public int getGiftRepeatEnd() {
        return giftRepeatEnd;
    }
}
