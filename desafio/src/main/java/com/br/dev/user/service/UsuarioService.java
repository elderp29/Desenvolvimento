package com.br.dev.user.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.br.dev.model.Evento;
import com.br.dev.model.Usuario;
import com.br.dev.user.dao.IEventoDAO;
import com.br.dev.user.dao.IUsuarioDAO;

@Transactional(readOnly = true)
public class UsuarioService implements IUsuarioService{
	
	 // UsuarioDAO is injected...
	 IUsuarioDAO usuarioDAO;
	 
	 
	 /**
	  * Add Usuario
	  *
	  * @param  Usuario usuario
	  */
	 @Transactional(readOnly = false)
	 public void addUsuario(Usuario usuario) {
	  getUsuarioDAO().addUsuario(usuario);
	 }
	 
	 /**
	  * Delete Usuario
	  *
	  * @param  Usuario usuario
	  */
	 @Transactional(readOnly = false)
	 public void deleteUsuario(Usuario usuario) {
	  getUsuarioDAO().deleteUsuario(usuario);
	 }
	 
	 /**
	  * Update Usuario
	  *
	  * @param  Usuario usuario
	  */
	 @Transactional(readOnly = false)
	 public void updateUsuario(Usuario usuario) {
	  getUsuarioDAO().updateUsuario(usuario);
	 }
	 
	 /**
	  * Get Usuario
	  *
	  * @param  int Usuario Id
	  */
	 public Usuario getUsuarioById(int id) {
	  return getUsuarioDAO().getUsuarioById(id);
	 }
	 
	 /**
	  * Get Usuario List
	  *
	  */
	 @Transactional(readOnly = false)
	 public List<Usuario> getUsuarios() {
	  return getUsuarioDAO().getUsuarios();
	 }
	 /**
	  * Logar Usuario
	  *
	  * @param   Usuario usuario
	  */
	 public String logar(Usuario usuario) {
		 
	
		 
		if(usuario.getNome() == null && !usuario.getNome().equals("") || usuario.getSenha() ==null && !usuario.getSenha().equals("")) {
			return "erro";
		}
		
		if(usuario.getNome().equals("administrador") && usuario.getSenha().equals("123456")){
			return "ok";
		}else {
			Usuario usuaSalvo = getUsuarioDAO().getUsuarioByNome(usuario.getNome());
			
			if(usuaSalvo != null  && usuaSalvo.getSenha().equals(usuario.getSenha()) ) {
				return "ok";
			}
			
		}
		return "erro";
	 }
	 /**
	  * Get Usuario DAO
	  *
	  * @return IUsuarioDAO - Usuario DAO
	  */
	 public IUsuarioDAO getUsuarioDAO() {
	  return usuarioDAO;
	 }
	 
	 /**
	  * Set Usuario DAO
	  *
	  * @param IUsuarioDAO - Usuario DAO
	  */
	 public void setUsuarioDAO(IUsuarioDAO usuarioDAO) {
	  this.usuarioDAO = usuarioDAO;
	 }
}
