package com.proyecto.appclient.exception;

import java.util.Set;

@SuppressWarnings("serial")
public class ClienteUnSupportedFieldPatchException extends RuntimeException{
	
	public ClienteUnSupportedFieldPatchException(Set<String> Keys) {
		super("campo "+Keys.toString()+" no esta permitido");
	}

}
