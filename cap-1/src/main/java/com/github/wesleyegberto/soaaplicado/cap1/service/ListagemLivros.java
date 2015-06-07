package com.github.wesleyegberto.soaaplicado.cap1.service;

import java.util.List;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import com.github.wesleyegberto.soaaplicado.cap1.dao.LivroDAO;
import com.github.wesleyegberto.soaaplicado.cap1.model.Livro;

@WebService
public class ListagemLivros {
	
	public List<Livro> listaLivros() {
		LivroDAO livroDao = new LivroDAO();
		return livroDao.listaLivros();
	}
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/livros", new ListagemLivros());
		System.out.println("Serviço inicializado...");
	}

}
