package com.example.chatapp;

public class messages {
    String text;
    String senderID;
    String receiverID;
    long time_sent;
    long time_delivered;
    long time_seen;
    String type;

    public messages() {}

    public messages(String text, String senderID, String receiverID, long time_sent, long time_delivered,
        long time_seen, String type){
        this.text = text;
        this.senderID = senderID;
        this.receiverID = receiverID;
        this.time_sent = time_sent;
        this.time_delivered = time_delivered;
        this.time_seen = time_seen;
        this.type = type;
    }
    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSenderId() {
        return this.senderID;
    }

    public void setSenderID(String senderID) {
        this.senderID = senderID;
    }

    public String getReceiverId() {
        return this.receiverID;
    }

    public void setReceiverID(String ReceiverID) {
        this.receiverID = receiverID;
    }
    public long getTime_sent() {
        return this.time_sent;
    }

    public void setTime_sent(long time_sent) {
        this.time_sent = time_sent;
    }
    public long getTime_delivered() {
        return this.time_delivered;
    }

    public void setTime_delivered(long time_delivered) {
        this.time_delivered = time_delivered;
    }
    public long getTime_seen() {
        return this.time_seen;
    }

    public void setTime_seen(long time_seen) {
        this.time_seen = time_seen;
    }
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
