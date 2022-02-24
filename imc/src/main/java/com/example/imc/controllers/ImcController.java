package com.example.imc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.imc.models.Imc;
import com.example.imc.repository.ImcRepository;

@RestController
@RequestMapping("/api")
public class ImcController {

	
	@Autowired
	ImcRepository imcRepository;
	
	@GetMapping("/imc")
	public List<Imc> listaImc(){
		return imcRepository.findAll();
	}
	
	@PostMapping("/imc")
	public Imc salvarImc(@RequestBody Imc imc) {
		return imcRepository.save(imc);
	}
	
	@DeleteMapping("/imc")
	public String deletarImc(@RequestBody Imc imc) {
		
		try {
			
			imcRepository.delete(imc);
			return "IMC deletado com sucesso";
		}catch(Exception e){
			return "Erro ao deletar IMC";
		}
		
	}
	
	@PutMapping("/imc")
	public String alterarImc(@RequestBody Imc imc) {
		
		try {
			
			imcRepository.save(imc);
			return "IMC alterado com sucesso";
		}catch(Exception e){
			return "Erro ao alterar IMC";
		}
		
	}
}
