package be.intecbrussel.microservices.serviceb;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GreetingRepository extends JpaRepository < Greeting, Long > {

    List < Greeting > findALlByContentContainingIgnoreCase ( final String subject );
}
