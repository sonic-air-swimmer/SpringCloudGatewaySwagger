package com.servicea;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceAController {

    @GetMapping("servicea/test")
    public String testServiceA() {
        return "Testing ServiceA";
    }
}
