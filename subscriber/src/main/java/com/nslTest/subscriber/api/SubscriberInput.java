package com.nslTest.subscriber.api;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SubscriberInput {
	@JsonProperty("start")
	private Set<String> startSubscribers = new HashSet<String>();
	@JsonProperty("end")
	private Set<String> endSubscribers = new HashSet<String>();
	public Set<String> getStartSubscribers() {
		return startSubscribers;
	}
	public Set<String> getEndSubscribers() {
		return endSubscribers;
	}
}
