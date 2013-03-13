package br.com.ideais.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.springframework.security.core.GrantedAuthority;


@Entity
@Table(name="ROLE")
@SequenceGenerator(name="SEQUENCIA", 
		           sequenceName="ROLE_SEQ",
		           allocationSize=1)
public class Role implements java.io.Serializable, GrantedAuthority {
 
	private static final long serialVersionUID = 1L;
 
	@Id @Generated(GenerationTime.INSERT) 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQUENCIA")
	@Column(name="id", unique=true) 
	protected long id;
	
	@Column(name="role", nullable=false, length=64)
	private String role;
	
	@ManyToOne 
	@JoinColumn(name="user_id", nullable=false)
	private User user;
	
	
	public long getId() {
		return id;
	}
	
	public String getAuthority() {
		return role;
	}

	public User getUser() {
		return user;
	}
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setId(long valor) {
		this.id = valor;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
