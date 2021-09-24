package com.br.dev.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.br.dev.util.Util;

@Entity
@Table(name="EVENTO")
public class Evento {
	
	@Id
	@Column(name="EVEN_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="EVEN_NOME", unique = true, nullable = false)
	private String nome;
	 
	@Column(name="EVEN_DATA", unique = true, nullable = false)
	@Temporal(TemporalType.DATE)
	private Date data;
	 
	@Column(name="EVEN_HORA", unique = true, nullable = false)
	@Temporal(TemporalType.TIME)
	private Date hora;
	
	@Column(name="EVEN_LOCAL", unique = true, nullable = false)
	private String local;
	
	public Evento() {}
	
	public Evento(int id, String local) {
		this.id =id;
		this.local = local;
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
	
	public String getDataDesc() {
		if (data != null) {
			return Util.dataParaString(data, "dd/mm/yyyy");
		}
		return "";
	}
	
	public void setData(Date data) {
		this.data = data;
	}

	public Date getHora() {
		return hora;
	}
	
	public String getHoraDesc() {
		if (hora != null) {
			return Util.dataParaString(hora, "hh:mm:ss");
		}
		return "";
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

}
