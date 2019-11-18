package com.proyecto.cliente.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class ClienteEntity {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotEmpty(message = "Ingrese un Nombre")
	private String nombre;
	
	@NotEmpty(message = "Ingrese un Apellido")
	private String apellido;
	
	@NotNull(message = "Ingrese Edad")
	private Long edad;
	
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="dd/MM/yyyy")
	@NotNull(message = "Ingrese Fecha de Nacimiento")
	private Date fechaNacimiento;
	
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date fechaProbableMuerte;
	
	public ClienteEntity(){
	}
	
	public ClienteEntity(Long id, String nombre, String apellido, Long edad, Date fechaNacimiento, Date fechaProbableMuerte){
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaProbableMuerte = fechaProbableMuerte;
	}
	
	public ClienteEntity(String nombre, String apellido, Long edad, Date fechaNacimiento, Date fechaProbableMuerte){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaProbableMuerte = fechaProbableMuerte;
	}	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Long getEdad() {
		return edad;
	}
	public void setEdad(Long edad) {
		this.edad = edad;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Date getFechaProbableMuerte() {
		return fechaProbableMuerte;
	}

	public void setFechaProbableMuerte(Date fechaProbableMuerte) {
		this.fechaProbableMuerte = fechaProbableMuerte;
	}
	
}
