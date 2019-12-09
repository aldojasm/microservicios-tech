package com.proyecto.appclient.exception;

@SuppressWarnings("serial")
public class ClienteNotFoundException extends RuntimeException{
	
	public ClienteNotFoundException(Long id) {
		super("Cliente no encontrado con id : "+id);
	}

}
