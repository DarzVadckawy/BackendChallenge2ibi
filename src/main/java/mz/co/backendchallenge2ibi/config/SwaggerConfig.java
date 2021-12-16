package mz.co.backendchallenge2ibi.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * @author Dário Silvano Maxaieie
 * This is the class responsible for configuring Swagger
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {


    @Bean
    public OpenAPI countryAPI() {
        return new OpenAPI()
                .info(new Info().title("Countries REST API")
                        .description("This is an REST API that allows us to do different operations based on countries")
                        .version("v0.0.1")
                        .contact(new Contact().name("Dário Silvano Maxaieie").email("dariomaxaieie@gmail.com")
                                .url("https://www.linkedin.com/in/dariomaxaieie/"))
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")));


    }

}
