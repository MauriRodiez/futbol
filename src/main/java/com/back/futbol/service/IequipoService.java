package com.back.futbol.service;

import com.back.futbol.entity.Equipo;

import java.util.List;

public interface IequipoService {
    Equipo guardar(Equipo equipo);
    List<Equipo> listarTodos();
    Equipo buscarPorId(Long id);
    void actualizar(Equipo equipo);
    String eliminar(Long id);
}
