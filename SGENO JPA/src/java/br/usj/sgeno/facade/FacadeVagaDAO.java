package br.usj.sgeno.facade;

import br.usj.sgeno.Empresa;
import br.usj.sgeno.Vagas;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class FacadeVagaDAO {

    public static FacadeVagaDAO FacadeVagaDAO = new FacadeVagaDAO();

    EntityManager em = Persistence
            .createEntityManagerFactory("SGENO")
            .createEntityManager();

    private final List<Vagas> vagas = new ArrayList<>();

    public void cadastrarVagas(Vagas v) {
        v.setId_vaga(Long.parseLong(String.valueOf(vagas.size())));
        vagas.add(v);
    }

    public List<Vagas> listarVagas() {
        return em.createQuery("SELECT fk_empresa,titulo_vagas,curso_vagas,fase_vagas,turno_vagas  FROM vagas;")
                .getResultList();

    }

    public Vagas editarVagas(int a) {
        return em.find(Vagas.class, a);
    }

    public List<Vagas> excluirVagas(Long id) {
        return em.createQuery("DELETE FROM vagas WHERE id = " + id + ";")
                .getResultList();
    }

}
