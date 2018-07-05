package br.com.instamoment.serviceInterface;

import java.util.List;

import br.com.instamoment.model.Usuario;

public interface UsuarioService {
	public Usuario buscarUsuarioEmail(String email);
	public void salvarUsuario(Usuario usuario);
}
