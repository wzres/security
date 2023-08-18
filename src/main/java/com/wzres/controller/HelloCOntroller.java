package com.wzres.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName：HelloCOntroller
 * @description：
 * @date：2023-05-13 14:11
 */

@RestController
public class HelloCOntroller {

    @GetMapping("/hello")
    public String hello(){
        return "springsecurity";
    }
}
