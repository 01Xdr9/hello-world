package com.project.helloworld;

import java.time.LocalTime;

// To return JSON:
public class JSONTest {
    private String message;
    private LocalTime localTime;

    public JSONTest(String message) {
        this.message = message;
        localTime = LocalTime.now();
    }

    public String getMessage() {
        return message;
    }
    public LocalTime getLocalTime() {
        return localTime;
    }
}