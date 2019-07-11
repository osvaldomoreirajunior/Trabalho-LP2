package com.example.sgenoDB;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class VagasDB implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_vagas;
	
    private String titulo;
    private EmpresaDB empresa;
    private String curso;
    private String ch;
    private String horaDe;
    private String horaAte;
    private String turno;
    private String fase;
    private String obs;
    private float valor;

    public Long getId_vaga() {
        return id_vagas;
    }

    public void setId_vaga(Long id_vaga) {
        this.id_vagas = id_vaga;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public EmpresaDB getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaDB empresa) {
        this.empresa = empresa;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCh() {
        return ch;
    }

    public void setCh(String ch) {
        this.ch = ch;
    }

    public String getHoraDe() {
        return horaDe;
    }

    public void setHoraDe(String horaDe) {
        this.horaDe = horaDe;
    }

    public String getHoraAte() {
        return horaAte;
    }

    public void setHoraAte(String horaAte) {
        this.horaAte = horaAte;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
	
}
