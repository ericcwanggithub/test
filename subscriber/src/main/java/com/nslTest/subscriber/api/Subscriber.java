package com.nslTest.subscriber.api;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Subscriber {
	private Set<String> newSubscribers = new HashSet<String>();
	private Set<String> stayedSubscribers = new HashSet<String>();
	private Set<String> unsubscribedSubscribers = new HashSet<String>();
    public Subscriber() {
        // Jackson deserialization
    }
    
    @JsonProperty
    public Set<String> getNew() {
        return newSubscribers;
    }
    @JsonProperty
    public Set<String> getStayed() {
        return stayedSubscribers;
    }
    @JsonProperty
    public Set<String> getUnsubscribed() {
        return unsubscribedSubscribers;
    }
    
}
