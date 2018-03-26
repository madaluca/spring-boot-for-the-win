package com.app.springboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;

import java.text.NumberFormat;

/**
 * Created by madalinaluca on 3/7/18.
 */
@org.springframework.web.bind.annotation.RestController("/")
public class RestController {

    Double amount = 1234554646.7865656;
    NumberFormat nf = NumberFormat.getCurrencyInstance();

    @GetMapping("/hello")
    public String getAll() {
        return nf.format(amount);
    }
}
