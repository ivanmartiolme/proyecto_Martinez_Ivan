package com.example.tarea1_martinez_ivan.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "encuestas")

public class Encuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty (message = "El nombre no puede estar en blanco")
    @Size(min = 2, message = "El nombre debe tener al menos 2 caracteres que no sean espacios en blanco")
    private String nombre;
    @NotEmpty (message = "El apellido no puede estar en blanco")
    @Size(min = 2, message = "El apellido debe tener al menos 2 caracteres que no sean espacios en blanco")
    private String apellidos;
    @Email(message = "El email electrónico no tiene un formato válido")
    private String email;
    @Min( value = 18, message = "La edad tiene que ser igual o seperior a 18 años")
    private int edad;
    @NotBlank(message = "Campo de texto obligatorio")
    private String telefono;
    @PastOrPresent(message = "La fecha debe ser igual o anterior al dia de hoy")
    private LocalDate fechaInicio;
    @NotEmpty (message = "El motivo no puede estar en blanco")
    private String motivo;
    private String servicios;
    @NotEmpty (message = "La satisfacción son obligatorias")
    private String satisfacion;
    private String comentarios;


    public Encuesta(Long id, String nombre, String apellidos, String email, int edad, String telefono, LocalDate fechaInicio, String motivo, String servicios, String satisfacion, String comentarios) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.edad = edad;
        this.telefono = telefono;
        this.fechaInicio = fechaInicio;
        this.motivo = motivo;
        this.servicios = servicios;
        this.satisfacion = satisfacion;
        this.comentarios = comentarios;
    }

    public Encuesta() {

    }

    public Long getId() {return id; }

    public void setId(Long id) { this.id = id; }

    public  String getNombre() { return nombre;}

    public void setNombre( String nombre) { this.nombre = nombre; }

    public String getApellidos() {return apellidos; }

    public void setApellidos(String apellidos) {this.apellidos = apellidos;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public int getEdad() {return edad;}

    public void setEdad(int edad) {this.edad = edad;}

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {this.telefono = telefono;}

    public LocalDate getFechaInicio() {return fechaInicio;}

    public void setFechaInicio(LocalDate fechaInicio) {this.fechaInicio = fechaInicio;}

    public String getMotivo() {return motivo;}

    public void setMotivo(String motivo) {this.motivo = motivo;}

    public String getServicios() {return servicios;}

    public void setServicios(String servicios) {this.servicios = servicios;}

    public String getSatisfacion() {return satisfacion;}

    public void setSatisfacion(String satisfacion) {this.satisfacion = satisfacion;}

    public String getComentarios() {return comentarios;}

    public void setComentarios(String comentarios) {this.comentarios = comentarios;}

    @Override
    public String toString() {
        return "encuestas{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                ", edad=" + edad +
                ", telefono=" + telefono +
                ", fechaInicio=" + fechaInicio +
                ", motivo='" + motivo + '\'' +
                ", servicios='" + servicios + '\'' +
                ", satisfacion='" + satisfacion + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }
}
