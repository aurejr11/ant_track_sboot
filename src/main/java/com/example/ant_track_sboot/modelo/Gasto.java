package com.example.ant_track_sboot.modelo;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Gasto {

    @Id  // por primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrementable
    private Long id;

    @Column(name = "descripcion", length = 200) //Columna
    private String descripcion;

    @Column(name = "valor", nullable = false) //Columna obligatoria
    private double valor;
    
    @Column(name = "fecha_gasto", nullable = false ) //Columna obligatoria
    private LocalDateTime fecha;

    @Enumerated(EnumType.STRING) //viene de un ENUM datos fijos donde puede elegir
    private Categoria categoria;

    @Enumerated(EnumType.STRING) //viene de un ENUM datos fijos donde puede elegir
    private MedioPago medioPago;

    //relacion con tabla usuario
    //1 gasto asociado a 1 solo usuario
    
    @ManyToOne
    @JoinColumn (name = "fk_usuario", referencedColumnName = "id")
    private Usuario usuario;

    @OneToMany (mappedBy = "Gasto")
    private List <Categoria> categorias;

    @OneToMany (mappedBy = "Gasto")
    private List <Comercio> comercios;



    

  
    //Constructor vacio
    public Gasto() {
    }

    //Constructor full
    public Gasto(Long id, String descripcion, Double valor, LocalDateTime fecha, Categoria categoria,
            MedioPago medioPago, String observaciones) {
        this.id = id;
        this.descripcion = descripcion;
        this.valor = valor;
        this.fecha = fecha;
        this.categoria = categoria;
        this.medioPago = medioPago;
    }


    //SETTERS
    public void setId(Long id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setMedioPago(MedioPago medioPago) {
        this.medioPago = medioPago;
    }

 


    //GETTERS

    public Long getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Double getValor() {
        return valor;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public MedioPago getMedioPago() {
        return medioPago;
    }

  
       
}
