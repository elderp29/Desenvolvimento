package com.br.dev.user.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.br.dev.model.EventoUsuario;

public class EventoUsuarioDAO implements IEventoUsuarioDAO{
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
	  * Add EventoUsuario
	  *
	  * @param  EventoUsuario eventoUsuario
	  */
	 public void addEventoUsuario(EventoUsuario eventoUsuario) {
	  getSessionFactory().getCurrentSession().save(eventoUsuario);
	 }
	 
	 /**
	  * Delete EventoUsuario
	  *
	  * @param  EventoUsuario eventoUsuario
	  */
	 public void deleteEventoUsuario(EventoUsuario eventoUsuario) {
	  getSessionFactory().getCurrentSession().delete(eventoUsuario);
	 }
	 
	 /**
	  * Update EventoUsuario
	  *
	  * @param  EventoUsuario eventoUsuario
	  */
	 public void updateEventoUsuario(EventoUsuario eventoUsuario) {
	  getSessionFactory().getCurrentSession().update(eventoUsuario);
	 }
	 
	 /**
	  * Get EventoUsuario
	  *
	  * @param  int EventoUsuario Id
	  * @return EventoUsuario
	  */
	 public EventoUsuario getEventoUsuarioById(int id) {
		 Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(EventoUsuario.class);
		 criteria.add(Restrictions.eq("id",id));
	     return (EventoUsuario)  criteria.uniqueResult();
	 }
	 
	 /**
	  * Get EventoUsuario List
	  *
	  * @return List - EventoUsuario list
	 */  
	 @SuppressWarnings("unchecked")
	public List<EventoUsuario> getEventoUsuarios() {
		 Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(EventoUsuario.class);
	     return (List<EventoUsuario>) criteria.list();
	 }

}
