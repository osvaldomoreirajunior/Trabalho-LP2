package com.example.sgeno.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.sgeno.crud.AlunoCrud;
import com.example.sgenoDB.AlunoDB;

//Aqui é todo o método que vai adicionar/alterar/deletar/listar o aluno
//No lugar do /nomeDaPágina você coloca o nome da página que irá mandar as requisições
//Lembrando que a tua lista de alunos é diferente da página de cadastro e etc, ai tu coloca certinho.

@Controller
@RequestMapping("/alunos.html")
public class AlunoController {

	@Autowired
	private AlunoCrud alunoCrud;
	
	@GetMapping
	public ModelAndView listarAluno() {
		List<AlunoDB> lista = alunoCrud.findAll();
		
		ModelAndView modelAndView = new ModelAndView("alunos.html");
		modelAndView.addObject("alunos.html", lista);

		return modelAndView;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@PostMapping("novo-aluno.html")
	public String adicionarAluno(HttpServletRequest request, @RequestParam("matricula") String matricula, @RequestParam("nome") String nome,@RequestParam("curso") String curso,@RequestParam("fase") Integer fase,@RequestParam("sexo") String sexo,@RequestParam("telefone") String telefone,@RequestParam("celular") String celular,@RequestParam("email") String email) {
		AlunoDB aluno = new AlunoDB();
		aluno.setMatrícula(matricula);
		aluno.setNome(nome);
		aluno.setCurso(curso);
		aluno.setFase(fase);
		aluno.setSexo(sexo);
		aluno.setTelefone(telefone);
		aluno.setCelular(celular);
		aluno.setEmail(email);
		AlunoDB novoAluno = alunoCrud.save(aluno);
		return "redirect:" + request.getRequestURI() + "/" + novoAluno.getId();
	}
	
	@DeleteMapping("alunos.html")
	public void deletarAluno(@RequestBody AlunoDB aluno) {
		alunoCrud.delete(aluno);
	}
	
	@PutMapping("alunos.html")
	public AlunoDB atualizarAluno(@RequestBody AlunoDB aluno, @RequestParam("matricula") String matricula, @RequestParam("nome") String nome,@RequestParam("curso") String curso,@RequestParam("fase") Integer fase,@RequestParam("sexo") String sexo,@RequestParam("telefone") String telefone,@RequestParam("celular") String celular,@RequestParam("email") String email) {
		return alunoCrud.save(aluno);
	}
	
}
