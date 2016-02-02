package com.nslTest.subscriber;

import com.nslTest.subscriber.resources.NSLTestResource;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class NSLTestApplication extends Application<NSLTestConfiguration> {

    public static void main(final String[] args) throws Exception {
        new NSLTestApplication().run(args);
    }

    @Override
    public String getName() {
        return "nslTest";
    }

    @Override
    public void initialize(final Bootstrap<NSLTestConfiguration> bootstrap) {
    }

    @Override
    public void run(final NSLTestConfiguration configuration,
                    final Environment environment) {
        final NSLTestResource nslRresource = new NSLTestResource();
        environment.jersey().register(nslRresource);
    }

}
