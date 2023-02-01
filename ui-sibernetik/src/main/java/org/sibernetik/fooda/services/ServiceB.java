package org.sibernetik.fooda.services;

import org.sibernetik.fooda.data.dto.Greeting;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Service
@FeignClient(name = "service-b", url = "http://localhost:8000")
public interface ServiceB {

    @GetMapping ( "/greeting" )
    Greeting greeting ( @RequestParam ( value = "name" ) String name );
    
}
