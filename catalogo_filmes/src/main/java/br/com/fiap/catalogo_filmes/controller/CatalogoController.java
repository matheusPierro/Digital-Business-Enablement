// Matheus Ramos de Pierro
// RM96920
package br.com.fiap.catalogo_filmes.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.catalogo_filmes.catalogo.Catalogo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/filmes")
public class CatalogoController {

    @PostMapping
    public void cadastrar(@RequestBody Catalogo filmes) {
        System.out.println(filmes);
    }

}
