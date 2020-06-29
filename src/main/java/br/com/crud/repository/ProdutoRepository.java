package br.com.crud.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.crud.entity.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
	Optional<Produto> findByNome(String nome);
	boolean existsByNome(String nome);
	
	
	

}
