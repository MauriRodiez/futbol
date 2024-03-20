package com.back.futbol.dto;

import com.back.futbol.entity.Direccion;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class JugadorDTO {
    private Long id;

    private String name;

    private String position;

    private int number;

    private Direccion direccion;
}
