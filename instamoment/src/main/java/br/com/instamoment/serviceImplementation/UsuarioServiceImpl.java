package br.com.instamoment.serviceImplementation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.instamoment.model.Permissao;
import br.com.instamoment.model.Usuario;
import br.com.instamoment.repository.PermissaoRepository;
import br.com.instamoment.repository.UsuarioRepository;
import br.com.instamoment.serviceInterface.UsuarioService;

@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private PermissaoRepository permissaoRepository;
	
	@Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public Usuario buscarUsuarioEmail(String email) {
		return usuarioRepository.findByEmail(email);
	}

	@Override
	public void salvarUsuario(Usuario usuario) {
		usuario.setPassword(bCryptPasswordEncoder.encode(usuario.getPassword()));
		usuario.setAtivo(1);
		Permissao permissao = permissaoRepository.findByPermissao("CLIENTE");
		usuario.setPermissoes(new HashSet<Permissao>(Arrays.asList(permissao)));
		usuarioRepository.save(usuario);
	}

	
}
