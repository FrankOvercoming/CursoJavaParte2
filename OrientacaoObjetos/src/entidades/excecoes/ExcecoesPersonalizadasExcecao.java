package entidades.excecoes;

// Se usar RuntimeException o compilador n�o obriga tratar a exce��o se usar
// Exception o compilador obriga a tratar a exce��o
public class ExcecoesPersonalizadasExcecao extends Exception {

	// Como a classe Exceptio � serializable ent�o ela precisa ter um numero de vers�o
	// por isso a linha abaixo cria essa vers�o	
	private static final long serialVersionUID = 1L;

	public ExcecoesPersonalizadasExcecao (String mensagemDeErro) {
		super(mensagemDeErro);
	}
}
