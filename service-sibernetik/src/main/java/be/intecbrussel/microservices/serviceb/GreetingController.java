package be.intecbrussel.microservices.serviceb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Service-B - Hello, %s!";
    private final AtomicLong counter = new AtomicLong ( );

    private final GreetingRepository greetingRepository;

    public GreetingController ( GreetingRepository greetingRepository ) {
        this.greetingRepository = greetingRepository;
    }

    @GetMapping ( "/greeting" )
    public Greeting greeting ( @RequestParam ( value = "name", defaultValue = "World" ) String name ) {
        return greetingRepository.save ( new Greeting ( )
                .withContent ( String.format ( template, name ) )
                .withPhone ( "123456789" ) );
    }
}

