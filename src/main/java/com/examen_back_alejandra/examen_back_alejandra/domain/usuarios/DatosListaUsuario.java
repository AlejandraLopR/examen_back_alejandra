package com.examen_back_alejandra.examen_back_alejandra.domain.usuarios;

import com.examen_back_alejandra.examen_back_alejandra.domain.direccion.DatosDireccion;
import com.examen_back_alejandra.examen_back_alejandra.domain.direccion.Direccion;
import com.examen_back_alejandra.examen_back_alejandra.domain.direccion.RetornaDireccion;
import jakarta.persistence.Column;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.time.Period;

public record DatosListaUsuario(Long id, String nombre,String apellidoPaterno,String apellidoMaterno,
                                Integer edad,
                                String username, LocalDate fechaNacimiento,
                                RetornaDireccion direccion) {
    public DatosListaUsuario(Usuario usuario){
        this(usuario.getId(), usuario.getNombre(), usuario.getApellidoPaterno(),
                usuario. getApellidoMaterno(),
                calcularEdad(usuario.getFechaNacimiento()),usuario.getUsername(), usuario.getFechaNacimiento(),
                new RetornaDireccion(usuario.getDireccion()));
    }

    private static int calcularEdad(LocalDate fechaNacimiento) {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }
}
