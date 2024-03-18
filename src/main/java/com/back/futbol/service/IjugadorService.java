package com.back.futbol.service;

import com.back.futbol.entity.Jugador;

import java.util.List;

public interface IjugadorService {

    Jugador guardar(Jugador jugador);
    List<Jugador> listarTodos();
    Jugador buscarPorId(Long id);
    void actualizar(Jugador jugador);
    String eliminar(Long id);
}
