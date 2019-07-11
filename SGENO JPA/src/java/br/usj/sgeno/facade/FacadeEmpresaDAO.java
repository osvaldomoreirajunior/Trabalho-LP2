package br.usj.sgeno.facade;

import br.usj.sgeno.Contrato;
import br.usj.sgeno.Empresa;
import br.usj.sgeno.Vagas;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class FacadeEmpresaDAO {

    public static FacadeEmpresaDAO FacadeEmpresaDAO = new FacadeEmpresaDAO();

    EntityManager em = Persistence
            .createEntityManagerFactory("SGENO")
            .createEntityManager();

    private final List<Empresa> empresa = new ArrayList<>();

    public void cadastrarEmpresa(Empresa e) {
        e.setId_empresa(Long.parseLong(String.valueOf(empresa.size())));
        empresa.add(e);
    }

    public List<Empresa> listarEmpresa() {
        return em.createQuery("SELECT nm_empresa,end_empresa,tel_empresa,resp_empresa  FROM empresa;")
                .getResultList();

    }

    public Empresa editarEmpresa(int a) {
        return em.find(Empresa.class, a);
    }

    public List<Empresa> excluirEmpresa(Long id) {
        return em.createQuery("DELETE FROM empresa WHERE id = " + id + ";")
                .getResultList();
    }

}
