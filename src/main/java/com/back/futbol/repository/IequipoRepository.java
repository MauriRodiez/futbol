package com.back.futbol.repository;

import com.back.futbol.entity.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IequipoRepository extends JpaRepository<Equipo, Long> {
}
