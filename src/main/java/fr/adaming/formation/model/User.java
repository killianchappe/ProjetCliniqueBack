package fr.adaming.formation.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_users")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idUser;
	private String loginUser;
	private String pwdUser;
	private String emailUser;

	// Constructeurs
	public User() {
		super();
	}

	public User(String loginUser, String pwdUser, String emailUser) {
		super();
		this.loginUser = loginUser;
		this.pwdUser = pwdUser;
		this.emailUser = emailUser;
	}

	public User(long idUser, String loginUser, String pwdUser, String emailUser) {
		super();
		this.idUser = idUser;
		this.loginUser = loginUser;
		this.pwdUser = pwdUser;
		this.emailUser = emailUser;
	}

	// Getters et Setters
	public long getIdUser() {
		return idUser;
	}

	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}

	public String getLoginUser() {
		return loginUser;
	}

	public void setLoginUser(String loginUser) {
		this.loginUser = loginUser;
	}

	public String getPwdUser() {
		return pwdUser;
	}

	public void setPwdUser(String pwdUser) {
		this.pwdUser = pwdUser;
	}

	public String getEmailUser() {
		return emailUser;
	}

	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", loginUser=" + loginUser + ", pwdUser=" + pwdUser + ", emailUser="
				+ emailUser + "]";
	}

}
