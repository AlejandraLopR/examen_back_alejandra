package com.examen_back_alejandra.examen_back_alejandra.domain.direccion;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable

@AllArgsConstructor
public class Direccion {
    private String calle;
    private String numeroInterior;
    private String numeroExterior;
    private String colonia;
    private Integer codigoPostal;
    private String ciudad;

    public Direccion() {
    }
    public Direccion(DatosDireccion direccion){
        this.calle =direccion.calle();
        this.codigoPostal = direccion.codigoPostal();
        this.colonia = direccion.colonia();
        this.numeroInterior = direccion.numeroInterior();
        this.numeroExterior = direccion.numeroExterior();
        this.ciudad = direccion.ciudad();
    }

    public String getCalle() {
        return calle;
    }

    public String getNumeroInterior() {
        return numeroInterior;
    }

    public String getNumeroExterior() {
        return numeroExterior;
    }

    public String getColonia() {
        return colonia;
    }

    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }
}
