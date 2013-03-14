package br.com.ideais.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="SESSIONS")
@SequenceGenerator(name="SEQUENCIA", 
		           sequenceName="SESSIONS_SEQ",
		           allocationSize=1)
public class Session {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQUENCIA")
	@Column(name="SESSIONS_ID") 
	private long id;
	
	@Column(name="HORARIO_INICIAL")
	private double horarioInicial;
	
	@Column(name="HORARIO_FINAL")
	private double horarioFinal;
	
	@OneToOne
	private User user;
	
	
	public Session (){	
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getHorarioInicial() {
		return horarioInicial;
	}

	public void setHorarioInicial(double horarioInicial) {
		this.horarioInicial = horarioInicial;
	}

	public double getHorarioFinal() {
		return horarioFinal;
	}

	public void setHorarioFinal(double horarioFinal) {
		this.horarioFinal = horarioFinal;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
