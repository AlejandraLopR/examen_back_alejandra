package com.examen_back_alejandra.examen_back_alejandra.domain.usuarios;

import com.examen_back_alejandra.examen_back_alejandra.domain.direccion.Direccion;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Getter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Usarios")
@Table (name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellidoMaterno;
    private String appeldioPaterno;
    private String username;
    private String password;
    private LocalDate fechaNacimiento;

    @Embedded
    private Direccion direccion;

    public Usuario(DatosUsuario user){
        this.nombre = user.nombre();
        this.appeldioPaterno = user.apellidoPaterno();
        this.apellidoMaterno = user.appelldoMaterno();
        this.nombre = user.nombre();
        this.password = user.password();
        this.direccion = new Direccion(user.direccion());
        this.fechaNacimiento = user.fechaNacimiento();
    }



}
