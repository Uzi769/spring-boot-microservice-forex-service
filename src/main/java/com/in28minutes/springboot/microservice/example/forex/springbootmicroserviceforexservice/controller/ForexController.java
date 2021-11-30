package com.in28minutes.springboot.microservice.example.forex.springbootmicroserviceforexservice.controller;

import com.in28minutes.springboot.microservice.example.forex.springbootmicroserviceforexservice.entity.ExchangeValue;
import com.in28minutes.springboot.microservice.example.forex.springbootmicroserviceforexservice.repository.ExchangeValueRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class ForexController {

    private final Environment environment;

    private final ExchangeValueRepository exchangeValueRepository;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to){
        ExchangeValue exchangeValue = exchangeValueRepository.findByFromAndTo(from, to);
        exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
        return exchangeValue;
    }


}
