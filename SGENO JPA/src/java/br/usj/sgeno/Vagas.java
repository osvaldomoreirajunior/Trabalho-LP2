package br.usj.sgeno;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Vagas {

    @Id
    @GeneratedValue
    private Long id_vaga;
    private String titulo;
    private Empresa empresa;
    private String curso;
    private String ch;
    private String horaDe;
    private String horaAte;
    private String turno;
    private String fase;
    private String obs;
    private float valor;

    public Long getId_vaga() {
        return id_vaga;
    }

    public void setId_vaga(Long id_vaga) {
        this.id_vaga = id_vaga;
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

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
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
