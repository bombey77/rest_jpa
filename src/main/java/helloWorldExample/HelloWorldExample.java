package helloWorldExample;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/helloWorld")
public class HelloWorldExample {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getHelloWorld() {
        return "Hello World";
    }

    @Path("/post")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String getPost() {
        return "{\"person\":\"human\"}";
    }
}
