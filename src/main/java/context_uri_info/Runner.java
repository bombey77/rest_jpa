package context_uri_info;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/context")
public class Runner {

    @Context
    private UriInfo uriInfo;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getContextPath() {
        return uriInfo.getPath();
    }
//    context

    @GET
    @Path("/absPath")
    @Produces(MediaType.TEXT_PLAIN)
    public String getContextInfo() {
        return uriInfo.getAbsolutePath().toString();
    }
//    http://localhost:8080/context/absPath
}
