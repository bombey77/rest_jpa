package json_response;

import xml_response.Student;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/student_json")
public class StudentDto {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStudent() {
        return Response.ok(new Student(1L, "Roman", "Moto")).build();
    }
}
