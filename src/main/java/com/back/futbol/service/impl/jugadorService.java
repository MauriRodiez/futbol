package com.back.futbol.service.impl;

import com.back.futbol.dto.JugadorDTO;
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
    public List<JugadorDTO> listarTodos() {
        return jugadorRepository.findAll();
    }

    @Override
    public JugadorDTO buscarPorId(Long id) {
        Optional<JugadorDTO> jugadorOpcional = jugadorRepository.findById(id);
        if(jugadorOpcional.isPresent()){
            return jugadorOpcional.get();
        } else {
            return null;
        }
    }

    @Override
    public void actualizar(JugadorDTO jugadorDTO) {
        jugadorRepository.save(jugadorDTO);
    }

    @Override
    public String eliminar(Long id) {
        JugadorDTO seleccionado = buscarPorId(id);
        if(seleccionado != null){
            jugadorRepository.deleteById(id);
            return "El jugador "+ id + " ha sido eliminado";
        } else {
            return "No es posible eliminar al jugador porque no existe";
        }
    }
}
