package com.restaurant.api.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.stereotype.Component;
import springfox.documentation.oas.web.OpenApiTransformationContext;
import springfox.documentation.oas.web.WebMvcOpenApiTransformationFilter;
import springfox.documentation.spi.DocumentationType;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * packageName : com.restaurant.api.config
 * className : OpenApiTransformatFilter
 * user : jwlee
 * date : 2023/01/19
 */
@Component
public class OpenApiServerFilter implements WebMvcOpenApiTransformationFilter {


    @Override
    public OpenAPI transform(OpenApiTransformationContext<HttpServletRequest> context) {

        OpenAPI openAPI = context.getSpecification();

        Server localServer = createServer("http://localhost:8080", "로컱 테스트");
        Server testServer = createServer( "http://127.0.0.1:8080", "테스트 서버");
        openAPI.setServers(Arrays.asList(localServer, testServer));

        return openAPI;
    }

    @Override
    public boolean supports(DocumentationType delimiter) {
        return delimiter.equals(DocumentationType.OAS_30);
    }

    private Server createServer(String url, String description) {
        Server server = new Server();
        server.setUrl(url);
        server.setDescription(description);
        return server;
    }
}
