package br.com.fiap.catalogo_filmes.catalogo;

import br.com.fiap.catalogo_filmes.fichaTecnica.FichaTecnica;

public record Catalogo(
                String titulo,
                String atorPrincipal,
                String duracao,
                String anoLancamento,
                String paisOrigem,
                Genero genero,
                FichaTecnica fichaTecnica) {
}