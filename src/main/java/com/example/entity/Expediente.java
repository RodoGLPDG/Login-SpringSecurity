package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "expedientes") // Nombre de la tabla en la base de datos
public class Expediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fechaApertura;
    private String fechaCierre;
    private String fondoDocumental;
    private String numeroCaja;
    private String numeroExpediente;
    private String claveClasificacion;
    private String tituloExpediente;
    private String descripcion;
    private String tipoExpediente;//?
    private String tipoFormato;
    private String extraccion;
    private String acceso; 
    private String tradicion;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFechaApertura() {
		return fechaApertura;
	}
	public void setFechaApertura(String fechaApertura) {
		this.fechaApertura = fechaApertura;
	}
	public String getFechaCierre() {
		return fechaCierre;
	}
	public void setFechaCierre(String fechaCierre) {
		this.fechaCierre = fechaCierre;
	}
	public String getFondoDocumental() {
		return fondoDocumental;
	}
	public void setFondoDocumental(String fondoDocumental) {
		this.fondoDocumental = fondoDocumental;
	}
	public String getNumeroCaja() {
		return numeroCaja;
	}
	public void setNumeroCaja(String numeroCaja) {
		this.numeroCaja = numeroCaja;
	}
	public String getNumeroExpediente() {
		return numeroExpediente;
	}
	public void setNumeroExpediente(String numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}
	public String getClaveClasificacion() {
		return claveClasificacion;
	}
	public void setClaveClasificacion(String claveClasificacion) {
		this.claveClasificacion = claveClasificacion;
	}
	public String getTituloExpediente() {
		return tituloExpediente;
	}
	public void setTituloExpediente(String tituloExpediente) {
		this.tituloExpediente = tituloExpediente;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getTipoExpediente() {
		return tipoExpediente;
	}
	public void setTipoExpediente(String tipoExpediente) {
		this.tipoExpediente = tipoExpediente;
	}
	public String getTipoFormato() {
		return tipoFormato;
	}
	public void setTipoFormato(String tipoFormato) {
		this.tipoFormato = tipoFormato;
	}
	public String getExtraccion() {
		return extraccion;
	}
	public void setExtraccion(String extraccion) {
		this.extraccion = extraccion;
	}
	public String getAcceso() {
		return acceso;
	}
	public void setAcceso(String acceso) {
		this.acceso = acceso;
	}
	public String getTradicion() {
		return tradicion;
	}
	public void setTradicion(String tradicion) {
		this.tradicion = tradicion;
	}
	public Expediente(Long id, String fechaApertura, String fechaCierre, String fondoDocumental, String numeroCaja,
			String numeroExpediente, String claveClasificacion, String tituloExpediente, String descripcion,
			String tipoExpediente, String tipoFormato, String extraccion, String acceso, String tradicion) {
		super();
		this.id = id;
		this.fechaApertura = fechaApertura;
		this.fechaCierre = fechaCierre;
		this.fondoDocumental = fondoDocumental;
		this.numeroCaja = numeroCaja;
		this.numeroExpediente = numeroExpediente;
		this.claveClasificacion = claveClasificacion;
		this.tituloExpediente = tituloExpediente;
		this.descripcion = descripcion;
		this.tipoExpediente = tipoExpediente;
		this.tipoFormato = tipoFormato;
		this.extraccion = extraccion;
		this.acceso = acceso;
		this.tradicion = tradicion;
	}
	public Expediente() {
		super();
		// TODO Auto-generated constructor stub
	}
  
}