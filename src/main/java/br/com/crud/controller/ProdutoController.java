package br.com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.crud.dto.Mensagem;
import br.com.crud.entity.Produto;
import br.com.crud.service.ProdutoService;

@RestController
@RequestMapping("/produto")
@CrossOrigin(origins = "http://localhost:4200")
public class ProdutoController {
	
	@Autowired
	ProdutoService produtoService;
	
	@GetMapping("/lista")
	public ResponseEntity<List <Produto>> list(){
		List<Produto> list = produtoService.list();
		return new ResponseEntity(list, HttpStatus.OK);
		
	}
	@GetMapping("/detail/{id}")
	public ResponseEntity<Produto> gerById(@PathVariable("id") int id){
		if(!produtoService.existsById(id))
			return new ResponseEntity(new Mensagem("não existe"), HttpStatus.NOT_FOUND);
		Produto produto = produtoService.getOne(id).get();
		return new ResponseEntity(produto, HttpStatus.OK);
	}

}
