package br.usj.sgeno.bean;

import br.usj.sgeno.Aluno;
import br.usj.sgeno.Contrato;
import br.usj.sgeno.Empresa;
import br.usj.sgeno.Vagas;
import br.usj.sgeno.facade.FacadeAlunoDAO;
import br.usj.sgeno.facade.FacadeContratoDAO;
import br.usj.sgeno.facade.FacadeEmpresaDAO;
import br.usj.sgeno.facade.FacadeVagaDAO;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class BeanSgeno {

    public BeanSgeno() {

    }

    private FacadeAlunoDAO facadealuno;
    private FacadeContratoDAO facadecontrato;
    private FacadeEmpresaDAO facadeempresa;
    private FacadeVagaDAO facadevagas;
    
    private Aluno aluno;
    private Empresa empresa;
    private Contrato contrato;
    private Vagas vagas;

    
    
    public void adicionarAluno() {
        facadealuno.cadastrarAluno(aluno);
    }
    
    public List<Aluno> listarAluno(){
        return facadealuno.listarAluno();
    }
    
    public Aluno editarAluno(int a){
        return facadealuno.editarAluno(a);
    }
    
    public List<Aluno> deleteAluno(Long id){
        return facadealuno.excluirAluno(id);
    }
    
    public void adicionarEmpresa() {
        facadeempresa.cadastrarEmpresa(empresa);
    }
    
    public List<Empresa> listarEmpresa(){
        return facadeempresa.listarEmpresa();
    }
    
    public Empresa editarEmpresa(int a){
        return facadeempresa.editarEmpresa(a);
    }
    
    public List<Empresa> deleteEmpresa(Long id){
        return facadeempresa.excluirEmpresa(id);
    }
    
    public void adicionarVagas() {
        facadevagas.cadastrarVagas(vagas);
    }
    
    public List<Vagas> listarVagas(){
        return facadevagas.listarVagas();
    }
    
    public Vagas editarVagas(int a){
        return facadevagas.editarVagas(a);
    }
    
    public List<Vagas> deleteVagas(Long id){
        return facadevagas.excluirVagas(id);
    }
    
    public void adicionarContrato() {
        facadecontrato.cadastrarContrato(contrato);
    }
    
    public List<Contrato> listarContrato(){
        return facadecontrato.listarContrato();
    }
    
    public Contrato editarContrato(int a){
        return facadecontrato.editarContrato(a);
    }
    
    public List<Contrato> deleteContrato(Long id){
        return facadecontrato.excluirContrato(id);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public Vagas getVagas() {
        return vagas;
    }

    public void setVagas(Vagas vagas) {
        this.vagas = vagas;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
