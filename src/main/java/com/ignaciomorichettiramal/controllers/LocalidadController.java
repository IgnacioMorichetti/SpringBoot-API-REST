package com.ignaciomorichettiramal.controllers;

import com.ignaciomorichettiramal.entities.Localidad;
import com.ignaciomorichettiramal.services.LocalidadService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, Long, LocalidadService> {

    public LocalidadController(LocalidadService localidadService) {
        super(localidadService);
    }
}

