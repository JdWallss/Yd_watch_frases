package com.Alura.Screenmatch_frases.frase;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface fraseRespository extends JpaRepository <Frases, Long>{

    @Query("SELECT f FROM Frases f ORDER BY RANDOM() LIMIT 1")
    public Frases obtenerFraseAleatoria();

}
