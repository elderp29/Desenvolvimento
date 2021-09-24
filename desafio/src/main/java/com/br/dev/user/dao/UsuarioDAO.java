package com.br.dev.user.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.br.dev.model.Usuario;

public class UsuarioDAO implements IUsuarioDAO{
	
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
	  * Add Usuario
	  *
	  * @param  Usuario usuario
	  */
	 public void addUsuario(Usuario usuario) {
	  getSessionFactory().getCurrentSession().save(usuario);
	 }
	 
	 /**
	  * Delete Usuario
	  *
	  * @param  Usuario usuario
	  */
	 public void deleteUsuario(Usuario usuario) {
	  getSessionFactory().getCurrentSession().delete(usuario);
	 }
	 
	 /**
	  * Update Usuario
	  *
	  * @param  Usuario usuario
	  */
	 public void updateUsuario(Usuario usuario) {
	  getSessionFactory().getCurrentSession().update(usuario);
	 }
	 
	 /**
	  * Get Usuario
	  *
	  * @param  int Usuario Id
	  * @return Usuario
	  */
	 public Usuario getUsuarioById(int id) {
		 Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Usuario.class);
		 criteria.add(Restrictions.eq("id",id));
	     return (Usuario)  criteria.uniqueResult();
	 }
	 
	 /**
	  * Get Usuario List
	  *
	  * @return List - Usuario list
	  */
	 public List<Usuario> getUsuarios() {
		 
		 Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Usuario.class);
	     return (List<Usuario>) criteria.list();
	  
	 }
	 /**
	  * Get Usuario
	  *
	  * @param  String nome
	  * @return Usuario
	  */
	 public Usuario getUsuarioByNome(String nome) {
		 Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Usuario.class);
		 criteria.add(Restrictions.eq("nome",nome));
	     return (Usuario)  criteria.uniqueResult();
	 }
}
