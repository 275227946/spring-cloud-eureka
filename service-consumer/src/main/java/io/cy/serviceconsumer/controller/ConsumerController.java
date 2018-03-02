package io.cy.serviceconsumer.controller;

import io.cy.serviceconsumer.consumer.ConsumerInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yang on 2018/1/15.
 */
@RestController
public class ConsumerController {

    @Autowired
    ConsumerInterface consumerInterface;

    @RequestMapping(value = "/consumer_test",method = RequestMethod.GET)
    public String test(){
        return consumerInterface.getTest("123123");
    }
}
