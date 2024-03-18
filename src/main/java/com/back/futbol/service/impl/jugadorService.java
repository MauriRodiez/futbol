package com.back.futbol.service.impl;

import com.back.futbol.entity.Jugador;
import com.back.futbol.repository.IjugadorRepository;
import com.back.futbol.service.IjugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class jugadorService implements IjugadorService {

    private IjugadorRepository jugadorRepository;
    @Autowired
    public jugadorService(IjugadorRepository jugadorRepository){
        this.jugadorRepository = jugadorRepository;
    }
    @Override
    public Jugador guardar(Jugador jugador) {
        return jugadorRepository.save(jugador);
    }

    @Override
    public List<Jugador> listarTodos() {
        return jugadorRepository.findAll();
    }

    @Override
    public Jugador buscarPorId(Long id) {
        Optional<Jugador> jugadorOpcional = jugadorRepository.findById(id);
        if(jugadorOpcional.isPresent()){
            return jugadorOpcional.get();
        } else {
            return null;
        }
    }

    @Override
    public void actualizar(Jugador jugador) {
        jugadorRepository.save(jugador);
    }

    @Override
    public String eliminar(Long id) {
        Jugador seleccionado = buscarPorId(id);
        if(seleccionado != null){
            jugadorRepository.deleteById(id);
            return "El jugador "+ id + " ha sido eliminado";
        } else {
            return "No es posible eliminar al jugador porque no existe";
        }
    }
}
