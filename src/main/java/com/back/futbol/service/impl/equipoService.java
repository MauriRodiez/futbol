package com.back.futbol.service.impl;

import com.back.futbol.entity.Equipo;
import com.back.futbol.entity.Jugador;
import com.back.futbol.repository.IequipoRepository;
import com.back.futbol.service.IequipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class equipoService implements IequipoService {

    private IequipoRepository equipoRepository;
    @Autowired
    public equipoService(IequipoRepository equipoRepository){
        this.equipoRepository = equipoRepository;
    }
    @Override
    public Equipo guardar(Equipo equipo) {
        return equipoRepository.save(equipo);
    }

    @Override
    public List<Equipo> listarTodos() {
        return equipoRepository.findAll();
    }

    @Override
    public Equipo buscarPorId(Long id) {
        Optional<Equipo> equipoOptional = equipoRepository.findById(id);
        if(equipoOptional.isPresent()){
            return equipoOptional.get();
        } else {
            return null;
        }
    }

    @Override
    public void actualizar(Equipo equipo) {
        equipoRepository.save(equipo);
    }

    @Override
    public String eliminar(Long id) {
        Equipo seleccionado = buscarPorId(id);
        if(seleccionado != null){
            equipoRepository.deleteById(id);
            return "El equipo "+ id + " ha sido eliminado";
        } else {
            return "No es posible eliminar al equipo porque no existe";
        }
    }
}
