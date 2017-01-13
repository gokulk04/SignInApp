package com.example.gokul.signinapp_1_8.objects;

/**
 * Created by Kraji on 1/12/2017.
 */

public class SignIn extends FirebaseObject {
    private String userId;
    private String time;
    private String eventId;

    public SignIn() {

    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }
}
