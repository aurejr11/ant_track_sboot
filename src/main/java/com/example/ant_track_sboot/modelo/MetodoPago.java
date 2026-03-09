
package com.example.ant_track_sboot.modelo;

import com.example.ant_track_sboot.modelo.utils.Estados;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

// Esta clase la trabaja Mafe H
//Datos: id, formaPago(efectivo, tarjeta), franquicia(bancolombia), estado(activo/inactivo),descripcion

@Entity
@Table(name = "metodos_pago")
public class MetodoPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, length = 50)
    private Long id;

    @Column(name = "forma_pago", nullable = false, length = 50)
    private String formaPago;

    @Column(name = "franquicia", nullable = false, length = 50)
    private String franquicia;

    @Column(name = "estado", nullable = false, length = 50)
    private Estados estado;

    @Column(name = "descripcion", nullable = false, length = 255)
    private String descripcion;

    //relacion bd

      @ManyToOne
    @JoinColumn (name = "fk_usuario", referencedColumnName = "id")
    private Usuario usuario;




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getFranquicia() {
        return franquicia;
    }

    public void setFranquicia(String franquicia) {
        this.franquicia = franquicia;
    }

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


   


}
