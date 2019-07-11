package com.example.sgenoDB;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class LoginDB implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_aluno;
	private String usuario;
	private String senha;
	
	
	public Long getId_aluno() {
		return id_aluno;
	}
	public void setId_aluno(Long id_aluno) {
		this.id_aluno = id_aluno;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
