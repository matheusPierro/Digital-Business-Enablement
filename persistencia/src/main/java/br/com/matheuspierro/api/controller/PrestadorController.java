package br.com.matheuspierro.api.controller;

import br.com.matheuspierro.api.prestador.DadosCadastroPrestador;
import br.com.matheuspierro.api.prestador.Prestador;
import br.com.matheuspierro.api.prestador.PrestadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prestadores")
public class PrestadorController {

	@Autowired
	private PrestadorRepository repository;
	
	@PostMapping
	public void cadastrar(@RequestBody DadosCadastroPrestador dados) {
//		System.out.println(dados);
		repository.save(new Prestador(dados));
	}
}
