package com.br.dev.user.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.br.dev.model.EventoUsuario;
import com.br.dev.user.dao.IEventoUsuarioDAO;

public class EventoUsuarioService implements IEventoUsuarioService {

		// EventoUsuarioDAO is injected...
		IEventoUsuarioDAO eventoUsuarioDAO;

		/**
		 * Add EventoUsuario
		 *
		 * @param EventoUsuario eventoUsuario
		 */
		@Transactional(readOnly = false)
		public void addEventoUsuario(EventoUsuario eventoUsuario) {
			getEventoUsuarioDAO().addEventoUsuario(eventoUsuario);
		}

		/**
		 * Delete EventoUsuario
		 *
		 * @param EventoUsuario eventoUsuario
		 */
		@Transactional(readOnly = false)
		public void deleteEventoUsuario(EventoUsuario eventoUsuario) {
			getEventoUsuarioDAO().deleteEventoUsuario(eventoUsuario);
		}

		/**
		 * Update EventoUsuario
		 *
		 * @param EventoUsuario eventoUsuario
		 */
		@Transactional(readOnly = false)
		public void updateEventoUsuario(EventoUsuario eventoUsuario) {
			getEventoUsuarioDAO().updateEventoUsuario(eventoUsuario);
		}

		/**
		 * Get EventoUsuario
		 *
		 * @param int EventoUsuario Id
		 */
		public EventoUsuario getEventoUsuarioById(int id) {
			return getEventoUsuarioDAO().getEventoUsuarioById(id);
		}

		/**
		 * Get EventoUsuario List
		 *
		 */
		@Transactional(readOnly = false)
		public List<EventoUsuario> getEventoUsuarios() {
			return getEventoUsuarioDAO().getEventoUsuarios();
		}

		/**
		 * Get EventoUsuario DAO
		 *
		 * @return IEventoUsuarioDAO - EventoUsuario DAO
		 */
		public IEventoUsuarioDAO getEventoUsuarioDAO() {
			return eventoUsuarioDAO;
		}

		/**
		 * Set EventoUsuario DAO
		 *
		 * @param IEventoUsuarioDAO - EventoUsuario DAO
		 */
		public void setEventoUsuarioDAO(IEventoUsuarioDAO eventoUsuarioDAO) {
			this.eventoUsuarioDAO = eventoUsuarioDAO;
		}

}
