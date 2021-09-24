package com.br.dev.managed.bean;

import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import org.springframework.dao.DataAccessException;

import com.br.dev.model.Evento;
import com.br.dev.model.EventoUsuario;
import com.br.dev.model.Usuario;
import com.br.dev.user.service.IEventoService;
import com.br.dev.user.service.IEventoUsuarioService;
import com.br.dev.user.service.IUsuarioService;

@ManagedBean(name = "eventoUsuarioMB")
@RequestScoped
public class EventoUsuarioManagedBean implements Serializable {
	
	private static final long serialVersionUID = 1L;

	// Spring EventoUsuario Service is injected...
	@ManagedProperty(value = "#{EventoUsuarioService}")
	IEventoUsuarioService eventoUsuarioService;
	
	@ManagedProperty(value = "#{EventoService}")
	IEventoService eventoService;
	
	@ManagedProperty(value = "#{UsuarioService}")
	IUsuarioService usuarioService;
	
	List<EventoUsuario> eventoUsuarioList;
	List<Evento> eventoList;
	List<Usuario> usuarioList;
	private int idEvento;
	private int idUsuario;
	private Evento evento;
	private Usuario usuario;

	/**
	 * addEventoUsuario
	 *
	 * @return String - Response Message
	 * @throws ParseException
	 */
	public String addEventoUsuario() {

		try {

			EventoUsuario evus = new EventoUsuario();
			Evento even = new Evento();
			even.setId(this.idEvento);
			Usuario usua = new Usuario();
			usua.setId(idUsuario);
			evus.setUsuario(usua);
			evus.setEvento(even);

			getEventoUsuarioService().addEventoUsuario(evus);

			return "pesquisaEventoUsuario";

		} catch (DataAccessException e) {
			e.printStackTrace();
		}

		return "cadastroEventoUsuario";
	}

	public void reset() {
		// this.setId(0);
		this.idEvento=0;
		this.idUsuario=0;
	}

	/**
	 * Get EventoUsuario List
	 *
	 * @return List - EventoUsuario List
	 */
	public List<EventoUsuario> getEventoUsuarioList() {
	  eventoUsuarioList = new ArrayList<EventoUsuario>();
	  eventoUsuarioList.addAll(getEventoUsuarioService().getEventoUsuarios());
	  return eventoUsuarioList;
	}
	
	/**
	 * Get EventoUsuario List
	 *
	 * @return List - EventoUsuario List
	 */
	public List<Evento> getEventoList() {
	  eventoList = new ArrayList<Evento>();
	  eventoList.addAll(getEventoService().getEventos());
	  return eventoList;
	}
	
	/**
	 * Get EventoUsuario List
	 *
	 * @return List - EventoUsuario List
	 */
	public List<Usuario> getUsuarioList() {
	  usuarioList = new ArrayList<Usuario>();
	  usuarioList.addAll(getUsuarioService().getUsuarios());
	  return usuarioList;
	}

	public int getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idusuario) {
		this.idUsuario = idusuario;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public IEventoUsuarioService getEventoUsuarioService() {
		return eventoUsuarioService;
	}

	public IEventoService getEventoService() {
		return eventoService;
	}

	public void setEventoService(IEventoService eventoService) {
		this.eventoService = eventoService;
	}

	public IUsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(IUsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	

	
}
