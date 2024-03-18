package com.back.futbol.repository;

import com.back.futbol.entity.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IjugadorRepository extends JpaRepository<Jugador, Long> {
}
