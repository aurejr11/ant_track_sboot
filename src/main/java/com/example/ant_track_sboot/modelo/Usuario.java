package com.example.ant_track_sboot.modelo;

import java.time.LocalDate;
import java.util.List;

import com.example.ant_track_sboot.modelo.utils.TipoDocumento;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;

public class Usuario {


    private Integer id;

    @Column (name = "nombresCompletos", nullable = false, unique = false, length = 50)
    private String nombres;
    
    @Column (name = "tipo_Documento", nullable = false, unique = false)
    @Enumerated(EnumType.STRING)
    private TipoDocumento tipoDocumento;
    
    
    @Column (name = "documento", nullable = false, unique = true, length = 15)
    private String documento;
    
    @Column (name = "edad", nullable = true, unique = false)
    private Integer edad; 
    
    @Column (name = "genero", nullable = false, unique = true, length = 15)
    private boolean genero;
    
    @Column (name = "correo", nullable = false, unique = true, length = 15)
    private String correo;
    
    @Column (name = "contacto", nullable = false, unique = true, length = 15)
    private String contacto;
    
    @Column (name = "presupMensual", nullable = false, unique = true)
    private float presupMensual;
    
    @Column (name = "FechaRegistro", nullable = false, unique = true, length = 15)
    private LocalDate fechaRegistro;




    @OneToMany (mappedBy = "usuario")
    private List <Gasto> gastos;

      @OneToMany (mappedBy = "usuario")
    private List <MetodoPago> MetodosPago;









    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }
    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public boolean isGenero() {
        return genero;
    }
    public void setGenero(boolean genero) {
        this.genero = genero;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getContacto() {
        return contacto;
    }
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    public float getPresupMensual() {
        return presupMensual;
    }
    public void setPresupMensual(float presupMensual) {
        this.presupMensual = presupMensual;
    }
    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }
    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    
  
}
