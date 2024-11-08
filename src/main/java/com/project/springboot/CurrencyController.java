package com.project.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {

    @Autowired
    private CurrenyServiceConfiguration currencyConfiguration;

    @RequestMapping("/currency")
    public CurrenyServiceConfiguration retreiveAllCurrency()
    {
        return currencyConfiguration;
    }
}
