package com.Alura.Screenmatch_frases.frase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FrasesService {

    @Autowired
    private fraseRespository respository;

    public FrasesDTO obtenerFrase() {
        Frases frases = respository.obtenerFraseAleatoria();
        return new FrasesDTO(frases.getTitulo(), frases.getFrase(), frases.getPersonaje(), frases.getPoster());
    }
}
