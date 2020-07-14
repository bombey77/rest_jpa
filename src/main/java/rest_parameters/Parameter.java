package rest_parameters;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/param")
@Produces(MediaType.TEXT_PLAIN)
public class Parameter {

    //    localhost:8080/param//123
    @GET
    @Path("{id}")
    public String getId(@PathParam("id") String id) {
        return "id - " + id;
    }

    //    localhost:8080/param/id/123
    @GET
    @Path("/id/{id}")
    public String getPathId(@PathParam("id") String id) {
        return "id path - " + id;
    }

    //    localhost:8080/param/userName/roman
    @GET
    @Path("userName/{name: [a-zA-Z]*}")
    public String getWithRegEx(@PathParam("name") String name) {
        return "user name - " + name;
    }

    //    localhost:8080/param/age/?userAge=33
    @GET
    @Path("/age/")
    public String getQueryParam(@QueryParam("userAge") String userAge) {
        return "user age - " + userAge;
    }

    //    localhost:8080/param/matrixParam/;userCity=Kiev
    //    localhost:8080/param/matrixParam
    @GET
    @Path("/matrixParam/")
    public String getMatrixParameter(@DefaultValue("New York") @MatrixParam("userCity") String city) {
        return "user city - " + city;
    }

    @GET
    @Path("/sessionId")
    public String getCookies(@DefaultValue("null") @CookieParam("sessionId") String sessionId) {
        return "session id - " + sessionId;
    }

    //    http://localhost:8080/param/header
    @GET
    @Path("/header")
    public String getHeaderParam(@HeaderParam("User-Agent") String userParam) {
        return "header param - " + userParam;
    }
    //    header param - Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Safari/537.36

    @POST
    @Path("/form")
    public String getFormParam(@FormParam("inputField") String form) {
        return "form param - " + form;
    }
    //    form param - value from the input field
}
