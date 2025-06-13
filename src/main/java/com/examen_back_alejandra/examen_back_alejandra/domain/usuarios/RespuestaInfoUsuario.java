package com.examen_back_alejandra.examen_back_alejandra.domain.usuarios;

import com.examen_back_alejandra.examen_back_alejandra.domain.direccion.Direccion;
import jakarta.persistence.Embedded;

import java.time.LocalDate;

public record RespuestaInfoUsuario(String nombre, String apellidoPaterno,String apellidoMaterno, String username,
        LocalDate fechaNacimiento, Direccion direccion) {
    public RespuestaInfoUsuario(Usuario usuario){
        this(usuario.getNombre(), usuario.getApellidoPaterno(), usuario. getApellidoMaterno(), usuario.getUsername(), usuario.getFechaNacimiento(),usuario.getDireccion());
    }
}
