package com.Alura.Screenmatch_frases.frase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrasesController {

    @Autowired
    FrasesService service;

    @GetMapping("/series/frases")
    public FrasesDTO obtenerFrases(){
        return service.obtenerFrase();
    }
}
