package uri_builder;

import javax.ws.rs.core.UriBuilder;

public class Runner {

    public static void main(String[] args) {
        System.out.println(
                UriBuilder.fromUri("http://localhost:8080/")
                        .path("book")
                        .queryParam("size", "777")
                        .toTemplate()
        );
//        http://localhost:8080/book?size=777

        System.out.println(
                UriBuilder.fromUri("http://localhost:8080/")
                        .path("book")
                        .matrixParam("size", "777")
                        .toTemplate()
        );
//        http://localhost:8080/book;size=777
    }
}
