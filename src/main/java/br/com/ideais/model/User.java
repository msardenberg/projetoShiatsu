package br.com.ideais.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="USERR")
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="EMAIL",nullable=false, length=100)
	private String email;
	
	@Column(name="PASSWORD",nullable=false, length=64)
	private String password;
	
	@Column(name="ENABLE")
	private boolean enable = true;
	
	@Column(name="IMAGE")
	private String image;
	
	@Column(name="AUTHORITY")
	private String authority = "ROLE_USER";
	
//	@OneToMany(targetEntity=Session.class, mappedBy="session_id", fetch=FetchType.EAGER)
//	@Column(name="SESSION")
//	private List<Session> session;
	
	public User(){
	
	}
	
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}

	public boolean isEnable() {
		return enable;
	}

	public String getImg() {
		return image;
	}

	public String getAuthority() {
		return authority;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public void setImg(String image) {
		this.image = image;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
		}


//	public List<Session> getSession() {
//		return session;
//	}
//
//
//	public void setSession(List<Session> session) {
//		this.session = session;
//	}

}
