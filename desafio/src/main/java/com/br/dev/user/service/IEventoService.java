package com.br.dev.user.service;

import java.util.List;

import com.br.dev.model.Evento;

public interface IEventoService {
	
	 /**
	  * Add Evento
	  *
	  * @param  Evento evento
	  */
	 public void addEvento(Evento evento);
	 
	 /**
	  * Update Evento
	  *
	  * @param  Evento evento
	  */
	 public void updateEvento(Evento evento);
	 
	 /**
	  * Delete Evento
	  *
	  * @param  Evento evento
	  */
	 public void deleteEvento(Evento evento);
	 
	 /**
	  * Get Evento
	  *
	  * @param  int Evento Id
	  */
	 public Evento getEventoById(int id);
	 
	 /**
	  * Get Evento List
	  *
	  * @return List - Evento list
	  */
	 public List<Evento> getEventos();
	 
	 /**
	  * verificaEvento Evento 
	  *
	  * @return boolean
	  */
	 public boolean verificaEvento(Evento evento); 
	
}
