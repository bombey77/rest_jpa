package exception_mapper;

import javax.servlet.ServletException;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import javax.xml.ws.WebServiceException;
import java.io.IOException;

@Path("/exception")
public class Runner {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String putElement() throws IOException {
//        throw new ServletException();
//        throw new WebServiceException();
//        throw new WebApplicationException();
//        throw new BadRequestException();
//        throw new ForbiddenException();
//        throw new NotAcceptableException();
//        throw new NotAllowedException("wrong credential");
//        throw new NotAuthorizedException("wrong credential");
//        throw new NotFoundException();
//        throw new NotSupportedException();
        throw new IOException("some text");
    }
}

@Provider
class MyMapper implements ExceptionMapper<RuntimeException> {

    @Override
    public Response toResponse(RuntimeException e) {
        return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).type(MediaType.TEXT_PLAIN).build();
    }
}
