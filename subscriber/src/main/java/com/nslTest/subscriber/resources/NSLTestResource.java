package com.nslTest.subscriber.resources;

import java.util.Set;

import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nslTest.subscriber.api.Subscriber;
import com.nslTest.subscriber.api.SubscriberInput;

@Path("/subscribers")
@Produces(MediaType.APPLICATION_JSON)
public class NSLTestResource {

    public NSLTestResource() {
    }

    @PUT
    @Produces("application/json")
    public Subscriber chechSubscribers(SubscriberInput input) { 
    	// get input data
    	Set<String> startSubscribers = input.getStartSubscribers();
    	Set<String> endSubscribers = input.getEndSubscribers();
    	
    	// create result
    	Subscriber result = new Subscriber();
    	Set<String> newSubscribers = result.getNew();
    	Set<String> stayedSubscribers = result.getStayed();
    	Set<String> unsubscribedSubscribers = result.getUnsubscribed();
    	for(String  subscriberEmail:endSubscribers){ //loop through endSubscribers
    		if (startSubscribers.remove(subscriberEmail)){ 
    			stayedSubscribers.add(subscriberEmail);	//found in startSubscribers, add to stayedSubscribers
    		}else{
    			newSubscribers.add(subscriberEmail);// not found in startSubscribers, add to newSubscribers
    		}
    	}
    	unsubscribedSubscribers.addAll(startSubscribers); // not exist in endSubscribers, add to unsubscribedSubscribers
    	return result;
    }
}