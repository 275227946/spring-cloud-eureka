package io.cy.serviceconsumer.consumer.hystrix;

import io.cy.serviceconsumer.consumer.ConsumerInterface;
import org.springframework.stereotype.Component;

/**
 * Created by yang on 2018/1/15.
 */
@Component
public class ConsumerInterfaceHystrix implements ConsumerInterface {
    @Override
    public String getTest(String input) {
        return "consumer interface unavailable";
    }
}
