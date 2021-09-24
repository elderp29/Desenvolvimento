package com.br.dev.user.service;

import java.util.List;

import com.br.dev.model.EventoUsuario;

public interface IEventoUsuarioService {
	/**
	  * Add EventoUsuario
	  *
	  * @param  EventoUsuario eventoUsuario
	  */
	 public void addEventoUsuario(EventoUsuario eventoUsuario);
	 
	 /**
	  * Update EventoUsuario
	  *
	  * @param  EventoUsuario eventoUsuario
	  */
	 public void updateEventoUsuario(EventoUsuario eventoUsuario);
	 
	 /**
	  * Delete EventoUsuario
	  *
	  * @param  EventoUsuario eventoUsuario
	  */
	 public void deleteEventoUsuario(EventoUsuario eventoUsuario);
	 
	 /**
	  * Get EventoUsuario
	  *
	  * @param  int EventoUsuario Id
	  */
	 public EventoUsuario getEventoUsuarioById(int id);
	 
	 /**
	  * Get EventoUsuario List
	  *
	  * @return List - EventoUsuario list
	  */
	 public List<EventoUsuario> getEventoUsuarios();
}
