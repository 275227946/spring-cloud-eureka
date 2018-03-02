package io.cy.serviceconsumer.consumer;

import io.cy.serviceconsumer.consumer.hystrix.ConsumerInterfaceHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by yang on 2018/1/15.
 */
@FeignClient(value = "service-provider", fallback = ConsumerInterfaceHystrix.class)
public interface ConsumerInterface {

    @RequestMapping(value = "/test",method = RequestMethod.POST)
    String getTest(@RequestParam(value = "input") String input);
}
