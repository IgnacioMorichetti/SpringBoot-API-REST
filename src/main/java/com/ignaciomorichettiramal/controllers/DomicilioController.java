package com.ignaciomorichettiramal.controllers;

import com.ignaciomorichettiramal.entities.Domicilio;
import com.ignaciomorichettiramal.services.DomicilioService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/domicilios")
public class DomicilioController extends BaseControllerImpl<Domicilio, Long, DomicilioService> {

    public DomicilioController(DomicilioService domicilioService) {
        super(domicilioService);
    }
}

