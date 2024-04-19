package com.colak.springrestversioningtutorial.contentnegotiation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Use Media Type
@RestController
@RequestMapping("/contentNegotiations/api")
public class ContentNegotiationVersioningController {

    // Http field is Accept=application/vesion1+json
    @GetMapping(value = "/applicant", produces = {"application/vesion1+json"})
    // defining custom content details on the basis of that you are deciding which request we are entertain for which version
    public String getApplicationURI1() {
        return "application/vesion1+json";
    }

    // Http field is Accept=application/vesion2+json
    @GetMapping(value = "/applicant", produces = {"application/vesion2+json"})
    public String getApplicationURI2() {
        return "application/vesion2+json";
    }
}
