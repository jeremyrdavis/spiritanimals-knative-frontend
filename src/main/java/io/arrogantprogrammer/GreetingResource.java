package io.arrogantprogrammer;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
@Produces(MediaType.TEXT_PLAIN)
public class GreetingResource {

    @GET
    public String hello() {
        return "Hello from Quarkus REST";
    }

    @POST
    public String helloName(String name) {
        return "Hello " + name + " from Quarkus REST";
    }
}
