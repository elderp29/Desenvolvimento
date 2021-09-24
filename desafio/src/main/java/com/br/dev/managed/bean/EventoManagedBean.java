package com.br.dev.managed.bean;

import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.springframework.dao.DataAccessException;

import com.br.dev.model.Evento;
import com.br.dev.model.Evento;
import com.br.dev.user.service.IEventoService;

@ManagedBean(name = "eventoMB")
@RequestScoped
public class EventoManagedBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Spring Evento Service is injected...
	@ManagedProperty(value = "#{EventoService}")
	IEventoService eventoService;

	List<Evento> eventoList;
	private int id;
	private String nome;
	private Date data;
	private Date hora;
	private String local;

	/**
	 * addEvento
	 *
	 * @return String - Response Message
	 * @throws ParseException
	 */
	public String addEvento() {

		try {

			Evento event = new Evento();

			event.setNome(getNome());
			event.setData(data);
			event.setHora(hora);
			event.setLocal(getLocal());

			if (getEventoService().verificaEvento(event)) {
				FacesContext.getCurrentInstance().addMessage("submit", new FacesMessage("Evento ja cadastrado!"));
				return "cadastroEvento";
			}

			getEventoService().addEvento(event);

			return "pesquisaEvento";

		} catch (DataAccessException e) {
			e.printStackTrace();
		}

		return "cadastroEvento";
	}

	public void reset() {
		// this.setId(0);
		this.setNome("");
		this.setData(null);
	}

	/**
	 * Get Evento List
	 *
	 * @return List - Evento List
	 */
	public List<Evento> getEventoList() {
	  eventoList = new ArrayList<Evento>();
	  eventoList.addAll(getEventoService().getEventos());
	  return eventoList;
	}

	public String teste() {

		eventoList = getEventoService().getEventos();

		return "ok";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Date getHora() {
		return hora;
	}
	
	public void setHora(Date hora) {
		this.hora = hora;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public IEventoService getEventoService() {
		return eventoService;
	}

	public void setEventoService(IEventoService eventoService) {
		this.eventoService = eventoService;
	}

}
