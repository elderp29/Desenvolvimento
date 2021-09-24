package com.br.dev.user.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.br.dev.model.Evento;
import com.br.dev.user.dao.IEventoDAO;

public class EventoService implements IEventoService {

	// EventoDAO is injected...
	IEventoDAO eventoDAO;

	/**
	 * Add Evento
	 *
	 * @param Evento evento
	 */
	@Transactional(readOnly = false)
	public void addEvento(Evento evento) {
		getEventoDAO().addEvento(evento);
	}

	/**
	 * Delete Evento
	 *
	 * @param Evento evento
	 */
	@Transactional(readOnly = false)
	public void deleteEvento(Evento evento) {
		getEventoDAO().deleteEvento(evento);
	}

	/**
	 * Update Evento
	 *
	 * @param Evento evento
	 */
	@Transactional(readOnly = false)
	public void updateEvento(Evento evento) {
		getEventoDAO().updateEvento(evento);
	}

	/**
	 * Get Evento
	 *
	 * @param int Evento Id
	 */
	public Evento getEventoById(int id) {
		return getEventoDAO().getEventoById(id);
	}

	/**
	 * Get Evento List
	 *
	 */
	@Transactional(readOnly = false)
	public List<Evento> getEventos() {
		return getEventoDAO().getEventos();
	}

	/**
	 * Get Evento DAO
	 *
	 * @return IEventoDAO - Evento DAO
	 */
	public IEventoDAO getEventoDAO() {
		return eventoDAO;
	}

	/**
	 * Set Evento DAO
	 *
	 * @param IEventoDAO - Evento DAO
	 */
	public void setEventoDAO(IEventoDAO eventoDAO) {
		this.eventoDAO = eventoDAO;
	}

	@Transactional(readOnly = false)
	public boolean verificaEvento(Evento evento) {

		List<Evento> lista = getEventoDAO().getEventosByNome(evento.getNome());

		if (lista.isEmpty()) {
			return false;
		} else {
			return true;
		} 	

	}

}
