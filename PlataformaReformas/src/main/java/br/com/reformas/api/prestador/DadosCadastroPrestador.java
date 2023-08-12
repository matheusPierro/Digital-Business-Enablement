package br.com.reformas.api.prestador;

public record DadosCadastroPrestador(
		String nome,
		String email,
		String telefone, 
		String cnpj,
		//Mudar na proxima aula 
		String especialidade, 
		String endereco
		) {
}
