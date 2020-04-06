package entidades;

public class GenericsDelimitadosProduto implements Comparable<GenericsDelimitadosProduto> {

	// Esta classe implementa a interface Comparable porque vamos colocar ela na classe
	// GenericsDelimitadosCalculoServico que ter� a fun��o de m�ximo que retorna o valor
	// m�ximo de uma lista de objetos, no caso a lista ser� deste objeto ent�o
	// esta fun��o usa o compareTo logo precisamos implementar a classe Comparable aqui
	// Regra para comparable
	// Regra para generics
	// Regra para compareTo
	
	private String nome;
	private Double preco;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		// Aqui sobre escrevemos a fun��o toString que todo objeto deve ter se n�o for
		// sobreescrita herda de object
		// Usamos @Override para o compilador saber que estamos sobre escrevendo um metodo
		// de uma super classe ent�o o compilador verifica se est� sendo sobre escrito
		// da forma correta seguindo a assinatura do metodo
		// Regra para sobre escrita
		// Regra para sobreescrita
		// Regra para Override
		// Regra para assinatura do metodo
		return "Produto: " + this.getNome() + " Pre�o: " + String.format("%.2f", getPreco());
	}
	
	@Override
	public int compareTo(GenericsDelimitadosProduto produto) {
		// TODO Auto-generated method stub
		// Aqui vamos comparar um produto com outro, no caso vamos comparar o pre�o
		// ent�o precisamos retornar se o pre�o do produto que est� vindo como parametro
		// � maior, menor ou igual ao pre�o do produto da classe atual instanciada
		// Regra para compareTo
		// Regra para Comparable
		// Regra para compara��o
		// Regra para comparacao
		Integer retorno = 0;
		// Aqui usamos iif, sendo--> (teste de condicao) ? true : false;
		// Regra para iif
		retorno = (produto.getPreco().doubleValue() < this.getPreco().doubleValue()) ? 10 : - 10;
		// Temos que converter o Wrapper Double para doubleValue pois nas compara��es
		// o java compara o objeto inteiro e n�o apenas o valor double
		// ai teria que usar equals, ent�o se converte e depois se compara
		// Regra para Wrapper class
		// Regra para double
		// Regra para comparar wrapper class
		// Regra para equals
		retorno = (this.getPreco().doubleValue() == produto.getPreco().doubleValue() ) ? 0 : retorno;
		
		// Podemos usar o compareTo do double porque ele tem, mas preferi criar e testar
		// a minha pr�pria compara��o
		// Regra para compareTo
		// Regra para Comparable
		// Regra para compara��o
		// Regra para comparacao

		// return getPreco().compareTo(produto.getPreco());
		
//		if (retorno == 0) {
//			System.out.println("Retorno zero produtos this, produto: " + this + "," + produto);
//		}
		return retorno;
	}
	
	
	
}
