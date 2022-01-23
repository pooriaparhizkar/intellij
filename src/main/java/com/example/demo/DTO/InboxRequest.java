package com.example.demo.DTO;

import com.example.demo.Entity.MessageType;
import com.example.demo.Entity.User;

import javax.persistence.*;

public class InboxRequest {
    private String title;
    private String description;
    private MessageType messageType;
    private Long userid;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }
}
