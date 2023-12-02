package br.com.matheuspierro.api.prestador;

import br.com.matheuspierro.api.endereco.DadosEndereco;

public record DadosCadastroPrestador(
		String nome,
		String email,
		String telefone,
		String cnpj,
		Especialidade especialidade,
		DadosEndereco endereco

) {

}
