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

import com.example.sgeno.crud.ContratoCrud;
import com.example.sgenoDB.AlunoDB;
import com.example.sgenoDB.ContratoDB;
import com.example.sgenoDB.EmpresaDB;


@Controller
@RequestMapping("/contrato.html")
public class ContratoController {

	@Autowired
	private ContratoCrud contratoCrud;
	
	@GetMapping
	public ModelAndView listarContrato() {
		List<ContratoDB> lista = contratoCrud.findAll();
		
		ModelAndView modelAndView = new ModelAndView("contrato.html");
		modelAndView.addObject("contrato.html", lista);

		return modelAndView;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@PostMapping("novo-contrato.html")
	public String adicionarContrato(HttpServletRequest request, @RequestParam("aluno") AlunoDB aluno, @RequestParam("empresa") EmpresaDB empresa,
			@RequestParam("periodode") String periodode, @RequestParam("periodoate") String periodoate,@RequestParam("horariode") String horariode,
			@RequestParam("horarioate") String horarioate, @RequestParam("ch") Integer ch,@RequestParam("aditivo") String aditivo,
			@RequestParam("valor") Float valor,@RequestParam("agencia") String agencia,@RequestParam("obs") String obs,@RequestParam("data") String data, 
			@RequestParam("data2") String data2) {
		
		ContratoDB Contrato = new ContratoDB();
		
		Contrato.setAluno(aluno);
		Contrato.setEmpresa(empresa);
		Contrato.setPeriodode(periodode);
		Contrato.setPeriodoate(periodoate);
		Contrato.setHorariode(horariode);
		Contrato.setHorarioate(horarioate);
		Contrato.setCh(ch);
		Contrato.setAditivo(aditivo);
		Contrato.setValor(valor);
		Contrato.setAgencia(agencia);
		Contrato.setObs(obs);
		Contrato.setData(data);
		Contrato.setData2(data2);
		
		ContratoDB novoContrato = contratoCrud.save(Contrato);
		return "redirect:" + request.getRequestURI() + "/" + novoContrato.getId_contrato();
	}
	
	@DeleteMapping("contrato.html")
	public void deletarContrato(@RequestBody ContratoDB contrato) {
		contratoCrud.delete(contrato);
	}
	
	@PutMapping("contrato.html")
	public ContratoDB atualizarContrato(@RequestBody ContratoDB contrato, @RequestParam("aluno") AlunoDB aluno, @RequestParam("empresa") EmpresaDB empresa,
			@RequestParam("periodode") String periodode, @RequestParam("periodoate") String periodoate,@RequestParam("horariode") String horariode,
			@RequestParam("horarioate") String horarioate, @RequestParam("ch") Integer ch,@RequestParam("aditivo") String aditivo,
			@RequestParam("valor") Float valor,@RequestParam("agencia") String agencia,@RequestParam("obs") String obs,@RequestParam("data") String data, 
			@RequestParam("data2") String data2) {
		return contratoCrud.save(contrato);
	}
	
	
	
}
