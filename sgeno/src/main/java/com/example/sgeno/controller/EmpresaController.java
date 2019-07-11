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

import com.example.sgeno.crud.EmpresaCrud;
import com.example.sgenoDB.EmpresaDB;

@Controller
@RequestMapping("/empresa.html")
public class EmpresaController {
	
	@Autowired
	private EmpresaCrud empresaCrud;
	
	@GetMapping
	public ModelAndView listarAluno() {
		List<EmpresaDB> lista = empresaCrud.findAll();
		
		ModelAndView modelAndView = new ModelAndView("empresa.html");
		modelAndView.addObject("empresa.html", lista);

		return modelAndView;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@PostMapping("nova-empresa.html")
	public String adicionarEmpresa(HttpServletRequest request, @RequestParam("nome") String nome,@RequestParam("endereco") String endereco,
			@RequestParam("telefone") String telefone,@RequestParam("email") String email,@RequestParam("responsavel") String responsavel) {
		
		EmpresaDB empresa = new EmpresaDB();
		
		empresa.setNome(nome);
		empresa.setEndereco(endereco);
		empresa.setTelefone(telefone);
		empresa.setEmail(email);
		empresa.setResponsavel(responsavel);
		
		EmpresaDB novoContrato = empresaCrud.save(empresa);
		return "redirect:" + request.getRequestURI() + "/" + novoContrato.getId_empresa();
	}
	
	@DeleteMapping("empresa.html")
	public void deletarEmpresa(@RequestBody EmpresaDB contrato) {
		empresaCrud.delete(contrato);
	}
	
	@PutMapping("empresa.html")
	public EmpresaDB atualizarEmpresa(@RequestBody EmpresaDB contrato, @RequestParam("nome") String nome,@RequestParam("endereco") String endereco,
			@RequestParam("telefone") String telefone,@RequestParam("email") String email,@RequestParam("responsavel") String responsavel) {
		return empresaCrud.save(contrato);
	}
	
}
