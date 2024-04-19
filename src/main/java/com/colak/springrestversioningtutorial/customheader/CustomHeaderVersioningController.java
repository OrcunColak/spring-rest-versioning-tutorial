package com.colak.springrestversioningtutorial.customheader;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customHeader/api")
public class CustomHeaderVersioningController {

    // Http field is x-api-version=1
    @GetMapping(value = "/applicant", headers = {"x-api-version=1"})
    // here we are declaring the custom api header any name you can take up to your application design
    public String getApplicationURI1() {
        return "x-api-version=1";
    }

    // Http field is x-api-version=2
    // so here you can see we are getting result on the basis of header version x-api-version=2
    @GetMapping(value = "/applicant", headers = {"x-api-version=2"})
    public String getApplicationURI2() {
        return "x-api-version=2";
    }
}
