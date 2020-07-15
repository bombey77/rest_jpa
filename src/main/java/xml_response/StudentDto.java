package xml_response;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/student")
public class StudentDto {

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Student getStudent() {
        return new Student(1L, "Roman", "Moto");
    }
}
