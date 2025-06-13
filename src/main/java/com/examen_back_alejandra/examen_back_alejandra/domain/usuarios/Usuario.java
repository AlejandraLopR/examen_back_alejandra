package com.examen_back_alejandra.examen_back_alejandra.domain.usuarios;

import com.examen_back_alejandra.examen_back_alejandra.domain.direccion.Direccion;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@Entity(name = "Usarios")
@Table (name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellidoMaterno;
    private String apellidoPaterno;
    private String username;
    private String password;
    private LocalDate fechaNacimiento;

    @Embedded
    private Direccion direccion;

    public Usuario(){}
    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getPassword() {
        return password;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public String getUsername() {
        return username;
    }

    public Usuario(DatosUsuario user){
        this.nombre = user.nombre();
        this.apellidoPaterno = user.apellidoPaterno();
        this.apellidoMaterno = user.apellidoMaterno();
        this.username = user.username();
        this.password = user.password();
        this.direccion = new Direccion(user.direccion());
        this.fechaNacimiento = user.fechaNacimiento();
    }



}
