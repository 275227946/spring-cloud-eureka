package io.cy.serviceprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yang on 2018/1/15.
 */
@RestController
public class ServiceController {

    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public String test(@RequestParam String input){
        return "input is : " + input;
    }
}
