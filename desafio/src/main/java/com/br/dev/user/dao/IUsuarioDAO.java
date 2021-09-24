package com.br.dev.user.dao;

import java.util.List;

import com.br.dev.model.Usuario;

public interface IUsuarioDAO {
	
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
	  */
	 public List<Usuario> getUsuarios();	
	 /**
	  * Get Usuario
	  *
	  * @param  String nome
	  */
	 public Usuario getUsuarioByNome(String nome);
}
