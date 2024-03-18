package com.back.futbol.controller;

import com.back.futbol.entity.Equipo;
import com.back.futbol.service.IequipoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/equipo")
public class equipoController {

    private IequipoService equipoService;

    public equipoController(IequipoService equipoService){
        this.equipoService = equipoService;
    }
    @PostMapping
    public ResponseEntity<Equipo> guardar(@RequestBody Equipo equipo){
        return ResponseEntity.ok(equipoService.guardar(equipo));
    }

}
