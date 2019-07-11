package com.example.sgenoDB;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class AlunoDB implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_aluno;
	
    private String matrícula;
    private String nome;
    private String curso;
    private int fase;
    private String telefone;
    private String celular;
    private String email;
    private String sexo;

    public Long getId() {
        return id_aluno;
    }

    public void setId(Long id) {
        this.id_aluno = id;
    }

    public String getMatrícula() {
        return matrícula;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setMatrícula(String matrícula) {
        this.matrícula = matrícula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
	
}
