package com.devsuperior.dslearnbds.services.exceptions;

public class DatabaseException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public DatabaseException(String msg) {
		super(msg); //retorna o argumento para o construtor da super classe
	}

		
}
