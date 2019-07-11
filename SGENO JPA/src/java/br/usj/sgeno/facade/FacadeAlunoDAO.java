package br.usj.sgeno.facade;

import br.usj.sgeno.Aluno;
import br.usj.sgeno.Contrato;
import br.usj.sgeno.Empresa;
import br.usj.sgeno.Vagas;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class FacadeAlunoDAO {

    public static FacadeAlunoDAO FacadeAlunoDAO = new FacadeAlunoDAO();

    EntityManager em = Persistence
            .createEntityManagerFactory("SGENO")
            .createEntityManager();

    private final List<Aluno> aluno = new ArrayList<>();

    public void cadastrarAluno(Aluno a) {
        a.setId(Long.parseLong(String.valueOf(aluno.size())));
        aluno.add(a);
    }

    public List<Aluno> listarAluno() {
        return em.createQuery("SELECT matri_aluno, nm_aluno, curso_aluno, fase_aluno FROM aluno;")
                .getResultList();

    }

    public Aluno editarAluno(int a) {
        return em.find(Aluno.class, a);
    }

    public List<Aluno> excluirAluno(Long id) {
        return em.createQuery("DELETE FROM aluno WHERE id = " + id + ";")
                .getResultList();
    }
}
