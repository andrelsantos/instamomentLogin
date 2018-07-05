package br.com.instamoment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.instamoment.model.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long> {

}
