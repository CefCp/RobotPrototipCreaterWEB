package jtt.projekts.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user")
	private int id;
	private String name;
	private String email;
	private String password;
	private String role;
	
	 public User() {	}
	
	 public User(String name,String email, String password,String role ) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.role = role;
	}

	public String getEmail() {return email;	}

	public void setEmail(String email) {this.email = email;	}

	public void setPassword(String password) {this.password = password;	}

	public int getId() {	return id;}

	public void setId(int id) {	this.id = id;}

	public String getName() {	return name;}

	public void setName(String name) {	this.name = name;}

	public String getRole() {	return role;}

	public void setRole(String role) {	this.role = role;}

	public String getPassword() {return password;}


	 
}
