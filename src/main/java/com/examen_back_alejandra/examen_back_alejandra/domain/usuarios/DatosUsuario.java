package com.examen_back_alejandra.examen_back_alejandra.domain.usuarios;

import com.examen_back_alejandra.examen_back_alejandra.domain.direccion.DatosDireccion;
import jakarta.persistence.Column;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DatosUsuario(
    @NotBlank
    String nombre,
    @NotBlank
    @Column(name = "apellido_paterno")
    String apellidoPaterno,
    @NotBlank
    @Column(name = "apellido_materno")
    String apellidoMaterno,
    @NotBlank
    String username,
    @NotBlank
    String password,
    @Column(name = "fecha_nacimiento")
    LocalDate fechaNacimiento,
    @NotNull
    @Valid
    DatosDireccion direccion

) {}
