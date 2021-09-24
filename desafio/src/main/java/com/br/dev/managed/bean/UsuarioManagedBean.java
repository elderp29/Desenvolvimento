package com.br.dev.managed.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.springframework.dao.DataAccessException;

import com.br.dev.model.Usuario;
import com.br.dev.user.service.IUsuarioService;

@ManagedBean(name="usuarioMB")
@RequestScoped
public class UsuarioManagedBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//Spring Usuario Service is injected...
	@ManagedProperty(value="#{UsuarioService}")
	IUsuarioService usuarioService;
	 
	List<Usuario> usuarioList;
	private int id;
	private String nome;
	private String senha;
	private String email;
	
	/**
	  * logar
	  *
	  * @return String - Response Message
	  */
	 public String logar() {
	  try {
		   String retorno ="";
		   Usuario usuario = new Usuario();
		   usuario.setNome(getNome());
		   usuario.setSenha(getSenha());
		   
		   if(getNome() == null || getNome().equals("") || getSenha() == null || getSenha().equals("")) {
			   FacesContext.getCurrentInstance().addMessage("submit", new FacesMessage("Login ou Senha Incorretos!"));
			   return "login";
		   }
		   
		   retorno = getUsuarioService().logar(usuario);
		   
		   if(retorno.equals("ok")) {
			   return "bemVindo";
		   }
		   
		   
	  } catch (DataAccessException e) {
	   e.printStackTrace();
	  }  
	  
	  FacesContext.getCurrentInstance().addMessage("submit", new FacesMessage("Login ou Senha Incorretos!"));
	  return "login";
	 }
	 
	 /**
	  * addUsuario
	  *
	  * @return String - Response Message
	  */
	 public String addUsuario() {
		  try {
			   Usuario usua = new Usuario();
			   usua.setNome(getNome());
			   usua.setSenha(getSenha());
			   usua.setEmail(getEmail());
			   getUsuarioService().addUsuario(usua);
			   return "pesquisaUsuario";
		  } catch (DataAccessException e) {
			  e.printStackTrace();
		  }  
		 
		  return "cadastroUsuario";
		 }
	 /**
	  * Reset Fields
	  *
	  */
	 public void reset() {
	  //this.setId(0);
	  this.setNome("");
	  this.setEmail("");
	 }
	 
	 /**
	  * Get Usuario List
	  *
	  * @return List - Usuario List
	  */
	 public List<Usuario> getUsuarioList() {
	  usuarioList = new ArrayList<Usuario>();
	  usuarioList.addAll(getUsuarioService().getUsuarios());
	  return usuarioList;
	 }
	 
	 /**
	  * Get Usuario Service
	  *
	  * @return IUsuarioService - Usuario Service
	  */
	 public IUsuarioService getUsuarioService() {
	  return usuarioService;
	 }
	 
	 /**
	  * Set Usuario Service
	  *
	  * @param IUsuarioService - Usuario Service
	  */
	 public void setUsuarioService(IUsuarioService usuarioService) {
	  this.usuarioService = usuarioService;
	 }
	 
	 /**
	  * Set Usuario List
	  *
	  * @param List - Usuario List
	  */
	 public void setUsuarioList(List<Usuario> usuarioList) {
	  this.usuarioList = usuarioList;
	 }
	 
	 /**
	  * Get Usuario Id
	  *
	  * @return int - Usuario Id
	  */
	 public int getId() {
	  return id;
	 }
	 
	 /**
	  * Set Usuario Id
	  *
	  * @param int - Usuario Id
	  */
	 public void setId(int id) {
	  this.id = id;
	 }
	 
	 /**
	  * Get Usuario Nome
	  *
	  * @return String - Usuario Nome
	  */
	 public String getNome() {
	  return nome;
	 }
	 
	 /**
	  * Set Usuario Nome
	  *
	  * @param String - Usuario Nome
	  */
	 public void setNome(String nome) {
	  this.nome = nome;
	 }
	 
	 /**
	  * Get Usuario Email
	  *
	  * @return String - Usuario Email
	  */
	 public String getEmail() {
	  return email;
	 }
	 
	 /**
	  * Set Usuario Email
	  *
	  * @param String - Usuario Email
	  */
	 public void setEmail(String email) {
	  this.email = email;
	 }

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
