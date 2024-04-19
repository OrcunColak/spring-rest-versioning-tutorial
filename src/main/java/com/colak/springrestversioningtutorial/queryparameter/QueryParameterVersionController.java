package com.colak.springrestversioningtutorial.queryparameter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Use Query Parameter
@RestController
@RequestMapping("/query/api")
public class QueryParameterVersionController {

    // http://localhost:8080/query/api?version=1
    @GetMapping(value = "/applicant", params = {"version=1"})
    public String getApplicationURI1() {
        return "version=1";
    }

    // http://localhost:8080/query/api?version=2
    @GetMapping(value = "/applicant", params = {"version=2"})
    public String getApplicationURI2() {
        return "version=2";
    }
}
