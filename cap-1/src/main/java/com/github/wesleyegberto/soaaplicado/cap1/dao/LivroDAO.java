package com.github.wesleyegberto.soaaplicado.cap1.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.github.wesleyegberto.soaaplicado.cap1.model.Livro;

public class LivroDAO {

	public List<Livro> listaLivros() {
		List<Livro> livros = new ArrayList<>();
		
		livros.add(new Livro("SOA Aplicado", Arrays.asList("Alexandre Saudete"), "Casa do Código", 2012, "Bom livro"));
		
		return livros;
	}

}
