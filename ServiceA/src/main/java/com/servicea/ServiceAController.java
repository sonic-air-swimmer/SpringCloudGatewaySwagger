package com.servicea;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ServiceAController {

    @GetMapping("test")
    public String testServiceA(@RequestHeader Map<String, String> headers) {
        System.out.println(headers);

        return "Request HTTP Headers:" + headers;
    }
}
