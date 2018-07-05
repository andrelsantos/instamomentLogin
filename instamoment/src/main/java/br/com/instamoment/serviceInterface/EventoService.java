package br.com.instamoment.serviceInterface;

import java.util.List;

import br.com.instamoment.model.Evento;

public interface EventoService {
	public Evento buscarEventoNome(String Nome);
	public List<Evento> buscarEventos();
}
