package entidades.excecoes;

// Se usar RuntimeException o compilador não obriga tratar a exceção se usar
// Exception o compilador obriga a tratar a exceção
//	Regra para exceção
// Regra para throw
// Regra para tratamento de erros
// Regra para RuntimeException
// Regra para Exception
public class ExcecoesPersonalizadasExcecao extends Exception {

	// Como a classe Exception é serializable então ela precisa ter um numero de versão
	// por isso a linha abaixo cria essa versão
	// Regra para exceção
	// Regra para throw
	// Regra para tratamento de erros
	// Regra para Exception
	private static final long serialVersionUID = 1L;

	public ExcecoesPersonalizadasExcecao (String mensagemDeErro) {
		super(mensagemDeErro);
	}
}
