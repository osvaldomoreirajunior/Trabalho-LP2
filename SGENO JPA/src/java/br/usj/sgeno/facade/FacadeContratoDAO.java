package br.usj.sgeno.facade;

import br.usj.sgeno.Aluno;
import br.usj.sgeno.Contrato;
import br.usj.sgeno.Vagas;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class FacadeContratoDAO {

    public static FacadeContratoDAO FacadeContratoDAO = new FacadeContratoDAO();

    EntityManager em = Persistence
            .createEntityManagerFactory("SGENO")
            .createEntityManager();

    private final List<Contrato> contrato = new ArrayList<>();

    
    public void cadastrarContrato(Contrato c) {
        c.setId_contrato(Long.parseLong(String.valueOf(contrato.size())));
        contrato.add(c);
    }

    public List<Contrato> listarContrato() {
        return em.createQuery("SELECT fk_aluno, fk_empresa,periodode_contrato,periodoate_contrato,ch_contrato,valor_contrato  FROM contrato;")
                .getResultList();

    }

    public Contrato editarContrato(int a) {
        return em.find(Contrato.class, a);
    }

    public List<Contrato> excluirContrato(Long id) {
        return em.createQuery("DELETE FROM contrato WHERE id = " + id + ";")
                .getResultList();
    }

}
