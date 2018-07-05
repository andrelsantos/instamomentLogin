package br.com.instamoment.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.instamoment.model.Evento;
import br.com.instamoment.repository.EventoRepository;
import br.com.instamoment.serviceInterface.EventoService;

@Service
@Transactional
public class EventoServiceImpl implements EventoService {
	
	@Autowired
	private EventoRepository eventoRepository;

	@Override
	public Evento buscarEventoNome(String Nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Evento> buscarEventos() {
		return eventoRepository.findAll();
	}

}
