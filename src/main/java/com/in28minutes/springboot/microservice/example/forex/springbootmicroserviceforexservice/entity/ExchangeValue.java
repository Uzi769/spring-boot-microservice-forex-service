package com.in28minutes.springboot.microservice.example.forex.springbootmicroserviceforexservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity(name="EXCHANGE_VALUE")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ExchangeValue {

    @Id
    private Long id;

    @Column(name = "currency_from")
    private String from;

    @Column(name = "currency_to")
    private String to;

    private BigDecimal conversionMultiple;

    private int port;

    public void setPort(int port) {
        this.port = port;
    }
}
