package com.br.dev.managed.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="menuMB")
@RequestScoped
public class MenuManagedBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public String caregarTelaUsuario() {
		return "cadastroUsuario";
	}
	
	public String caregarConsultaUsuario() {
		return "pesquisaUsuario";
	}
	
	public String caregarTelaEvento() {
		return "cadastroEvento";
	}
	public String caregarConsultaEvento() {
		return "pesquisaEvento";
	}
	
	public String caregarTelaEventoUsuario() {
		return "cadastroEventoUsuario";
	}
}
