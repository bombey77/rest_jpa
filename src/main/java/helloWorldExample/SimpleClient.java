package helloWorldExample;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.net.URISyntaxException;

public class SimpleClient {

    public static void main(String[] args) throws URISyntaxException {
        Client client = ClientBuilder.newClient();;
        URI uri = new URI("http://localhost:8080");
        WebTarget target = client.target(uri);
        Invocation invocation = target.path("helloWorld").request().buildGet();
        Response response = invocation.invoke();
        if (response.getStatusInfo().getStatusCode() == Response.Status.OK.getStatusCode()) {
            System.out.println(response.readEntity(String.class));
        }

//        short version
//        System.out.println(client.target(uri).path("helloWorld").request().get(String.class));

        //Hello World
    }
}
