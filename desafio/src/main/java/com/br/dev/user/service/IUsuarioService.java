package com.br.dev.user.service;

import java.util.List;

import com.br.dev.model.Usuario;

public interface IUsuarioService {
	 /**
	  * Add Usuario
	  *
	  * @param  Usuario usuario
	  */
	 public void addUsuario(Usuario usuario);
	 
	 /**
	  * Update Usuario
	  *
	  * @param  Usuario usuario
	  */
	 public void updateUsuario(Usuario usuario);
	 
	 /**
	  * Delete Usuario
	  *
	  * @param  Usuario usuario
	  */
	 public void deleteUsuario(Usuario usuario);
	 
	 /**
	  * Get Usuario
	  *
	  * @param  int Usuario Id
	  */
	 public Usuario getUsuarioById(int id);
	 
	 /**
	  * Get Usuario List
	  *
	  * @return List - Usuario list
	  */
	 public List<Usuario> getUsuarios();
	 
	 /**
	  * Add Usuario
	  *
	  * @param  Usuario usuario
	  */
	 public String logar(Usuario usuario);
}
