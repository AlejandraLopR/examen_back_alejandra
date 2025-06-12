package com.examen_back_alejandra.examen_back_alejandra.domain.usuarios;

import com.examen_back_alejandra.examen_back_alejandra.domain.direccion.DatosDireccion;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosUsuario(
    @NotBlank
    String nombre,
    @NotBlank
    String apellidoPaterno,
    @NotBlank
    String appelldoMaterno,
    @NotBlank
    String username,
    @NotBlank
    String password,
    @NotNull
    @Valid
    DatosDireccion direccion
) {}
