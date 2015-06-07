package com.github.wesleyegberto.soaaplicado.cap3.service;

import javax.xml.ws.WebFault;

@WebFault(targetNamespace = "http://service.cap3.soaaplicado.wesleyegberto.github.com/exceptions", name = "UsuarioNaoAutorizado")
public class UsuarioNaoAutorizadoException extends Exception {
	private static final long serialVersionUID = 8347309886620070257L;

	public UsuarioNaoAutorizadoException() {
		super();
	}

	public UsuarioNaoAutorizadoException(String message, Throwable cause) {
		super(message, cause);
	}

	public UsuarioNaoAutorizadoException(String message) {
		super(message);
	}

	public UsuarioNaoAutorizadoException(Throwable cause) {
		super(cause);
	}

	public UsuarioNaoAutorizadoException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
