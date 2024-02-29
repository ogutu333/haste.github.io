package com.haste.ReportObject;

/**
 * Created by Deborah on 29/02/24.
 */

public class Subscription {
    String name;
    String distance;
    String topic;

    public Subscription(){}

    public Subscription(String name, String distance, String topic){
        this.name = name;
        this.distance = distance;
        this.topic = topic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
