package com.colak.springrestversioningtutorial.uriversion;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Use URI Path
@RestController
@RequestMapping("/api")
public class URIPathVersionController {

    // http://localhost:8080/api/v1/applicant
    @GetMapping("/v1/applicant")
    public String getApplicationURI1(){
        return "/v1/applicant";
    }

    // http://localhost:8080/api/v2/applicant
    @GetMapping("/v2/applicant")
    public String getApplicationURI2(){
        return "/v2/applicant";
    }
}