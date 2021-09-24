package com.br.dev.user.dao;

import java.util.List;

import com.br.dev.model.EventoUsuario;

public interface IEventoUsuarioDAO {
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
	  */
	 public List<EventoUsuario> getEventoUsuarios();	
	
}
