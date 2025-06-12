package com.examen_back_alejandra.examen_back_alejandra.domain.direccion;

import jakarta.validation.constraints.NotBlank;

public record DatosDireccion(
        @NotBlank
        String calle,
        @NotBlank
        String numeroInterior,
        @NotBlank
        String numeroExterior,
        @NotBlank
        String colonia,
        @NotBlank
        Integer codigoPostal,
        @NotBlank
        String ciudad
) {
}
