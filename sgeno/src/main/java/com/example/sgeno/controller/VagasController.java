package com.example.sgeno.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.sgeno.crud.VagasCrud;
import com.example.sgenoDB.EmpresaDB;
import com.example.sgenoDB.VagasDB;



@Controller
@RequestMapping("/vagas.html")
public class VagasController {

	
	@Autowired
	private VagasCrud vagasCrud;
	
	@GetMapping
	public ModelAndView listarVaga() {
		List<VagasDB> lista = vagasCrud.findAll();
		
		ModelAndView modelAndView = new ModelAndView("vagas.html");
		modelAndView.addObject("vagas.html", lista);

		return modelAndView;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@GetMapping("nova-vaga.html")
	public String adicionarVaga(HttpServletRequest request, @RequestParam("titulo") String titulo,@RequestParam("empresa") EmpresaDB empresa,
			@RequestParam("curso") String curso,@RequestParam("ch") String ch,@RequestParam("horade") String horade,
			@RequestParam("horaate") String horaate,@RequestParam("turno") String turno,@RequestParam("fase") String fase,
			@RequestParam("obs") String obs,@RequestParam("valor") Float valor) {
		
		VagasDB vagas = new VagasDB();
		
		vagas.setTitulo(titulo);
		vagas.setEmpresa(empresa);
		vagas.setCurso(curso);
		vagas.setCh(ch);
		vagas.setHoraDe(horade);
		vagas.setHoraAte(horaate);
		vagas.setTurno(turno);
		vagas.setFase(fase);
		vagas.setObs(obs);
		vagas.setValor(valor);
		
		VagasDB novaVaga = vagasCrud.save(vagas);
		return "redirect:" + request.getRequestURI() + "/" + novaVaga.getId_vaga();
	}
	
	@DeleteMapping("vagas.html")
	public void deletarVaga(@RequestBody VagasDB vagas) {
		vagasCrud.delete(vagas);
	}
	
	@PutMapping("vagas.html")
	public VagasDB atualizarVaga(@RequestBody VagasDB contrato, @RequestParam("titulo") String titulo,@RequestParam("empresa") EmpresaDB empresa,
			@RequestParam("curso") String curso,@RequestParam("ch") String ch,@RequestParam("horade") String horade,
			@RequestParam("horaate") String horaate,@RequestParam("turno") String turno,@RequestParam("fase") String fase,
			@RequestParam("obs") String obs,@RequestParam("valor") Float valor) {
		return vagasCrud.save(contrato);
	}
	
	
}
