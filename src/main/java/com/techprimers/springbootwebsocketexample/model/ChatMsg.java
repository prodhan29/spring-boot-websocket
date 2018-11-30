package com.techprimers.springbootwebsocketexample.model;

public class ChatMsg {

    public String name;
    public String channelId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }
}
