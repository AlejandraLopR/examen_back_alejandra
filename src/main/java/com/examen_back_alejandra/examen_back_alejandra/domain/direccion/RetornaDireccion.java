package com.examen_back_alejandra.examen_back_alejandra.domain.direccion;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;

public record RetornaDireccion(
        String calle,
        @Column(name = "numero_interior")
        String numeroInterior,
        @Column(name = "numero_exterior")
        String numeroExterior,
        String colonia,
        @Column(name = "codigo_postal")
        Integer codigoPostal,
        String ciudad
) {
    public RetornaDireccion(Direccion direccion){
        this(direccion.getCalle(), direccion.getNumeroInterior(), direccion.getNumeroExterior(), direccion.getColonia(),
                direccion.getCodigoPostal(), direccion.getCiudad());
    }
}
