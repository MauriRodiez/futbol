package com.back.futbol.service;

import com.back.futbol.dto.JugadorDTO;
import com.back.futbol.entity.Jugador;

import java.util.List;

public interface IjugadorService {

    Jugador guardar(Jugador jugador);
    List<JugadorDTO> listarTodos();
    JugadorDTO buscarPorId(Long id);
    void actualizar(JugadorDTO jugadorDTO);
    String eliminar(Long id);
}
