package com.example.demo.Entity;

public enum MessageType {
    warning("اخطار"),
    notification("اعلان"),
    Event("کمپین");

    public final String label;
    MessageType(String label){
        this.label = label;
    }
}
