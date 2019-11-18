package com.proyecto.cliente.exception;

@SuppressWarnings("serial")
public class ClienteNotFoundException extends RuntimeException{
	
	public ClienteNotFoundException(Long id) {
		super("Cliente no encontrado con id : "+id);
	}

}
