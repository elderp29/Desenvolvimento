package com.br.dev.user.dao;

import java.util.List;

import com.br.dev.model.Evento;

public interface IEventoDAO {
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
	  */
	 public List<Evento> getEventos();	
	 
	 /**
	  * Get Evento List
	  *
	  */
	 public List<Evento> getEventosByNome(String nome);	

}
