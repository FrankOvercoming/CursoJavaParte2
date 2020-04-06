package entidades;

public class GenericsDelimitadosProduto implements Comparable<GenericsDelimitadosProduto> {

	// Esta classe implementa a interface Comparable porque vamos colocar ela na classe
	// GenericsDelimitadosCalculoServico que terá a função de máximo que retorna o valor
	// máximo de uma lista de objetos, no caso a lista será deste objeto então
	// esta função usa o compareTo logo precisamos implementar a classe Comparable aqui
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
		// Aqui sobre escrevemos a função toString que todo objeto deve ter se não for
		// sobreescrita herda de object
		// Usamos @Override para o compilador saber que estamos sobre escrevendo um metodo
		// de uma super classe então o compilador verifica se está sendo sobre escrito
		// da forma correta seguindo a assinatura do metodo
		// Regra para sobre escrita
		// Regra para sobreescrita
		// Regra para Override
		// Regra para assinatura do metodo
		return "Produto: " + this.getNome() + " Preço: " + String.format("%.2f", getPreco());
	}
	
	@Override
	public int compareTo(GenericsDelimitadosProduto produto) {
		// TODO Auto-generated method stub
		// Aqui vamos comparar um produto com outro, no caso vamos comparar o preço
		// então precisamos retornar se o preço do produto que está vindo como parametro
		// é maior, menor ou igual ao preço do produto da classe atual instanciada
		// Regra para compareTo
		// Regra para Comparable
		// Regra para comparação
		// Regra para comparacao
		Integer retorno = 0;
		// Aqui usamos iif, sendo--> (teste de condicao) ? true : false;
		// Regra para iif
		retorno = (produto.getPreco().doubleValue() < this.getPreco().doubleValue()) ? 10 : - 10;
		// Temos que converter o Wrapper Double para doubleValue pois nas comparações
		// o java compara o objeto inteiro e não apenas o valor double
		// ai teria que usar equals, então se converte e depois se compara
		// Regra para Wrapper class
		// Regra para double
		// Regra para comparar wrapper class
		// Regra para equals
		retorno = (this.getPreco().doubleValue() == produto.getPreco().doubleValue() ) ? 0 : retorno;
		
		// Podemos usar o compareTo do double porque ele tem, mas preferi criar e testar
		// a minha própria comparação
		// Regra para compareTo
		// Regra para Comparable
		// Regra para comparação
		// Regra para comparacao

		// return getPreco().compareTo(produto.getPreco());
		
//		if (retorno == 0) {
//			System.out.println("Retorno zero produtos this, produto: " + this + "," + produto);
//		}
		return retorno;
	}
	
	
	
}
