package com.tests.springBootTest;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by madalinaluca on 3/7/18.
 */
@org.springframework.web.bind.annotation.RestController("/")
public class RestController {

    @GetMapping("/hello")
    public String getAll() {
        return "Helloo world";
    }
}
