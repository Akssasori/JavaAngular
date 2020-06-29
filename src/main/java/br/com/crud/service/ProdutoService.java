package br.com.crud.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.crud.entity.Produto;
import br.com.crud.repository.ProdutoRepository;

@Service
@Transactional
public class ProdutoService {
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	public List<Produto>list(){
		return produtoRepository.findAll();
		
	}
	
	public Optional <Produto> getOne(int id) {
		return produtoRepository.findById(id);
	}
	
	public Optional<Produto> getByNime(String nome){
		return produtoRepository.findByNome(nome);
	}
	
	public void save(Produto produto) {
		produtoRepository.save(produto);
	}
	
	public void delete (int id) {
		produtoRepository.deleteById(id);
	}
	public boolean existsById(int id) {
		return produtoRepository.existsById(id);
	}
	
	public boolean existsByNome(String nome) {
		return produtoRepository.existsByNome(nome);
	}

}
