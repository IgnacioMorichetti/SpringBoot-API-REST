package com.ignaciomorichettiramal.controllers;

import com.ignaciomorichettiramal.entities.Autor;
import com.ignaciomorichettiramal.services.AutorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/autores")
public class AutorController extends BaseControllerImpl<Autor, Long, AutorService> {

    public AutorController(AutorService autorService) {
        super(autorService);
    }
}

