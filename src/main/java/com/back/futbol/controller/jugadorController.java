package com.back.futbol.controller;

import com.back.futbol.entity.Equipo;
import com.back.futbol.entity.Jugador;
import com.back.futbol.service.IequipoService;
import com.back.futbol.service.IjugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jugadores")
public class jugadorController {

    private IjugadorService jugadorService;
    @Autowired
    public jugadorController(IjugadorService jugadorService){
        this.jugadorService = jugadorService;
    }
    @PostMapping
    public ResponseEntity<Jugador> guardar(@RequestBody Jugador jugador){
        return ResponseEntity.ok(jugadorService.guardar(jugador));
    }
}
