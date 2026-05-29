package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "opiniones")
public class Review {

    @Id
    private String id;
    
    private String cliente;
    private String plataforma_origen;
    private String comentario;
    private int calificacion_estrellas;
    private String fecha_publicacion;
    private String categoria_reparacion;

    public Review() {}

   
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    
    public String getCliente() { return cliente; }
    public void setCliente(String cliente) { this.cliente = cliente; }
    
    public String getPlataforma_origen() { return plataforma_origen; }
    public void setPlataforma_origen(String plataforma_origen) { this.plataforma_origen = plataforma_origen; }
    
    public String getComentario() { return comentario; }
    public void setComentario(String comentario) { this.comentario = comentario; }
    
    public int getCalificacion_estrellas() { return calificacion_estrellas; }
    public void setCalificacion_estrellas(int calificacion_estrellas) { this.calificacion_estrellas = calificacion_estrellas; }
    
    public String getFecha_publicacion() { return fecha_publicacion; }
    public void setFecha_publicacion(String fecha_publicacion) { this.fecha_publicacion = fecha_publicacion; }
    
    public String getCategoria_reparacion() { return categoria_reparacion; }
    public void setCategoria_reparacion(String categoria_reparacion) { this.categoria_reparacion = categoria_reparacion; }
}
