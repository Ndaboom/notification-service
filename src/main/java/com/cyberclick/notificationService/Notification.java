package com.cyberclick.notificationService;

public class Notification {

    private String notificationId;
    private String notificationDescription;

    public Notification(String notificationId, String notificationDescription) {
        this.notificationId = notificationId;
        this.notificationDescription = notificationDescription;
    }

    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    public String getNotificationDescription() {
        return notificationDescription;
    }

    public void setNotificationDescription(String notificationDescription) {
        this.notificationDescription = notificationDescription;
    }
}
