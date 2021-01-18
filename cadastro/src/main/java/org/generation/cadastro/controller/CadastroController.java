package org.generation.cadastro.controller;

import org.generation.cadastro.model.CadastroModel;
import org.generation.cadastro.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//INDICA QUE ESSA CLASSE É UM CONTROLLER
@RequestMapping("/cadastro")//INDICA POR QUAL URL ESSA CLASSE SERÁ ACESSADA
@CrossOrigin("*")//INDICA QUE ESSA CLASSE IRÁ ACEITAR REQUISIÇÕES DE QUALQUER ORIGEM
public class CadastroController {
	
	@Autowired
	private CadastroRepository repository;

	//MÉTODO PARA CADASTRAR O USUÁRIO:
	@PostMapping()//MÉTODO POST CRIA UMA REQUISIÇÃO HTTP.
	public ResponseEntity<CadastroModel> post (@RequestBody CadastroModel cadastro) {
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(repository.save(cadastro));
	}
}
