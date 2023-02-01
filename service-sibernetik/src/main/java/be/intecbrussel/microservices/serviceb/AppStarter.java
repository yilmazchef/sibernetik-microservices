package be.intecbrussel.microservices.serviceb;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@OpenAPIDefinition ( info = @Info (
        title = "Service B",
        version = "1.0.0",
        description = "Service B API Information" )
)
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker
public class AppStarter {

    public static void main ( String[] args ) {
        SpringApplication.run ( AppStarter.class, args );
    }

    @Bean
    public RestTemplate restTemplate ( ) {
        return new RestTemplate ( );
    }

}
