package br.com.ideais.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.springframework.security.core.GrantedAuthority;

@Entity 
@Table(name="USER_SECURITY")
public class UserSecurity  implements GrantedAuthority, java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id @Generated(GenerationTime.INSERT) 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", unique=true) 
	protected long id;
	
	public long getId() {return id;}
	public void setId(long valor) {this.id = valor;}
	
	@Column(name="role", nullable=false, length=64)
	private String role;
	@ManyToOne @JoinColumn(name="user_id", nullable=false)
	private User user;
	
	public String getRole() {return role;}
	public void setRole(String valor) {role = valor;}
	
	public User getUser() {return user;}
	public void setUser(User usr) {user = usr;}
	
	public String getAuthority() {
		return role;
	}
	
}
