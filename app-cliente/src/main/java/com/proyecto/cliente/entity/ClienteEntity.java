package com.proyecto.cliente.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class ClienteEntity {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotEmpty(message = "Ingrese un Nombre")
	private String nombre;
	
	@NotEmpty(message = "Ingrese un Apellido")
	private String apellido;
	
	@NotEmpty(message = "Ingrese Edad")
	private Long edad;
	
	@NotEmpty(message = "Ingrese Fecha de Nacimiento")
	private Date fechaNacimiento;
	
	public ClienteEntity(Long id, String nombre, String apellido, Long edad, Date fechaNacimiento){
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public ClienteEntity(String nombre, String apellido, Long edad, Date fechaNacimiento){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
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
	
}
