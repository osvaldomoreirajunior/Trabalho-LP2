package com.example.sgenoDB;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ContratoDB implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_contrato;
	
    private AlunoDB aluno;
    private EmpresaDB empresa;
    private String periodode;
    private String periodoate;
    private String horariode;
    private String horarioate;
    private int ch;
    private String aditivo;
    private float valor;
    private String agencia;
    private String obs;
    private String data;
    private String data2;

    public Long getId_contrato() {
        return id_contrato;
    }

    public void setId_contrato(Long id_contrato) {
        this.id_contrato = id_contrato;
    }

    public AlunoDB getAluno() {
        return aluno;
    }

    public void setAluno(AlunoDB aluno) {
        this.aluno = aluno;
    }

    public EmpresaDB getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaDB empresa) {
        this.empresa = empresa;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData2() {
        return data2;
    }

    public void setData2(String data2) {
        this.data2 = data2;
    }

    public String getHorariode() {
        return horariode;
    }

    public void setHorariode(String horariode) {
        this.horariode = horariode;
    }

    public String getHorarioate() {
        return horarioate;
    }

    public void setHorarioate(String horarioate) {
        this.horarioate = horarioate;
    }

    public String getPeriodode() {
        return periodode;
    }

    public void setPeriodode(String periodode) {
        this.periodode = periodode;
    }

    public String getPeriodoate() {
        return periodoate;
    }

    public void setPeriodoate(String periodoate) {
        this.periodoate = periodoate;
    }

    public int getCh() {
        return ch;
    }

    public void setCh(int ch) {
        this.ch = ch;
    }

    public String getAditivo() {
        return aditivo;
    }

    public void setAditivo(String aditivo) {
        this.aditivo = aditivo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
	
	
}
