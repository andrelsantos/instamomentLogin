package br.com.instamoment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.instamoment.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
	Usuario findByEmail(String email);
}
