package br.com.ideais.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

@Entity
@Table(name="CONFIG")
@SequenceGenerator(name="SEQUENCIA", 
		           sequenceName="CONFIG_SEQ",
		           allocationSize=1)
public class Config {

	@Id @Generated(GenerationTime.INSERT) 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQUENCIA")
	@Column(name="SESSION_ID", unique=true) 
	private long id;
	
	
	@Column(name="DIA_DA_SEMANA")
	private int diaDaSemana;
	
	@Column(name="HORARIO_INICIO")
	private double horarioInicio;
	
	@Column(name="HORARIO_TERMINO")
	private double horarioTermino;
	
	@Column(name="INTERVALO_INICIO")
	private double intervaloInicio;
	
	@Column(name="INTERVALO_DURACAO")
	private double intervaloDuracao;

	
	public Config(){
		
	}
	
	public int getDiaDaSemana() {
		return diaDaSemana;
	}

	public void setDiaDaSemana(int diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}

	public double getHorarioInicio() {
		return horarioInicio;
	}

	public void setHorarioInicio(double horarioInicio) {
		this.horarioInicio = horarioInicio;
	}

	public double getHorarioTermino() {
		return horarioTermino;
	}

	public void setHorarioTermino(double horarioTermino) {
		this.horarioTermino = horarioTermino;
	}

	public double getIntervaloInicio() {
		return intervaloInicio;
	}

	public void setIntervaloInicio(double intervaloInicio) {
		this.intervaloInicio = intervaloInicio;
	}

	public double getIntervaloDuracao() {
		return intervaloDuracao;
	}

	public void setIntervaloDuracao(double intervaloDuracao) {
		this.intervaloDuracao = intervaloDuracao;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
