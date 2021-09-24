package com.br.dev.user.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.br.dev.model.Evento;

public class EventoDAO implements IEventoDAO{
	
	private SessionFactory sessionFactory;
	 
	 /**
	  * Get Hibernate Session Factory
	  *
	  * @return SessionFactory - Hibernate Session Factory
	  */
	 public SessionFactory getSessionFactory() {
	  return sessionFactory;
	 }
	 
	 /**
	  * Set Hibernate Session Factory
	  *
	  * @param SessionFactory - Hibernate Session Factory
	  */
	 public void setSessionFactory(SessionFactory sessionFactory) {
	        this.sessionFactory = sessionFactory;
	    }
	 
	 /**
	  * Add Evento
	  *
	  * @param  Evento evento
	  */
	 public void addEvento(Evento evento) {
	  getSessionFactory().getCurrentSession().save(evento);
	 }
	 
	 /**
	  * Delete Evento
	  *
	  * @param  Evento evento
	  */
	 public void deleteEvento(Evento evento) {
	  getSessionFactory().getCurrentSession().delete(evento);
	 }
	 
	 /**
	  * Update Evento
	  *
	  * @param  Evento evento
	  */
	 public void updateEvento(Evento evento) {
	  getSessionFactory().getCurrentSession().update(evento);
	 }
	 
	 /**
	  * Get Evento
	  *
	  * @param  int Evento Id
	  * @return Evento
	  */
	 public Evento getEventoById(int id) {
		 Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Evento.class);
		 criteria.add(Restrictions.eq("id",id));
	     return (Evento)  criteria.uniqueResult();
	 }
	 
	 /**
	  * Get Evento List
	  *
	  * @return List - Evento list
	 */  
	 @SuppressWarnings("unchecked")
	public List<Evento> getEventos() {
		 Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Evento.class);
	     return (List<Evento>) criteria.list();
	 }
	 
	 public List<Evento> getEventosByNome(String nome){
		 Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Evento.class);
		 criteria.add(Restrictions.eq("nome",nome));
		 return   criteria.list();
		 
	      
	 }
}
