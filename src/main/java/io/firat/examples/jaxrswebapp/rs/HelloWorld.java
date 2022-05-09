
package io.firat.examples.jaxrswebapp.rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/")
public final class HelloWorld {
    public HelloWorld() {}
    @GET
    @Path("/hello/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello(@PathParam("name") final String name) {
        return "Hello " + name + "!!";
    }
    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHelloWorld() {
        return "Hello World!";
    }
    @GET
    @Path("/query")
    public Response getUsers(
            @QueryParam("hi") String hi,
            @QueryParam("lan") String lan){
        return Response
                .status(200)
                .entity("language : "+lan+" ==> "+hi).build();
    }
}
