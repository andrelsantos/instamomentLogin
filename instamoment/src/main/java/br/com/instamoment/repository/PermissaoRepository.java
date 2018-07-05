package br.com.instamoment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.instamoment.model.Permissao;

public interface PermissaoRepository extends JpaRepository<Permissao,Integer> {
	Permissao findByPermissao(String permissao);
}
