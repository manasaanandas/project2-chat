package com.manasa.model;

import java.sql.Date;

public class outputmessage extends message {

    private Date time;
    
    public outputmessage(message original, Date time) {
        super(original.getId(), original.getMessage());
        this.time = time;
    }
    
    public Date getTime() {
        return time;
    }
    
    public void setTime(Date time) {
        this.time = time;
    }
}