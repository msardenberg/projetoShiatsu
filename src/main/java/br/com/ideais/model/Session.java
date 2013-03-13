package br.com.ideais.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

@Entity
@Table(name="SESSION")
@SequenceGenerator(name="SEQUENCIA", 
		           sequenceName="SESSION_SEQ",
		           allocationSize=1)
public class Session {
	
	@Id @Generated(GenerationTime.INSERT) 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQUENCIA")
	@Column(name="SESSION_ID", unique=true) 
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
