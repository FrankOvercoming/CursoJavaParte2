package entidades.excecoes;

// Se usar RuntimeException o compilador não obriga tratar a exceção se usar
// Exception o compilador obriga a tratar a exceção
public class ExcecoesPersonalizadasExcecao extends Exception {

	// Como a classe Exceptio é serializable então ela precisa ter um numero de versão
	// por isso a linha abaixo cria essa versão	
	private static final long serialVersionUID = 1L;

	public ExcecoesPersonalizadasExcecao (String mensagemDeErro) {
		super(mensagemDeErro);
	}
}
