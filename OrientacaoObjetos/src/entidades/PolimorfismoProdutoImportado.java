package entidades;

public class PolimorfismoProdutoImportado extends PolimorfismoProduto {
	private Double taxaImportacao;

	
	
	public PolimorfismoProdutoImportado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PolimorfismoProdutoImportado(String nome, Double preco, Double taxaImportacao) {
		super(nome, preco);
		this.taxaImportacao = taxaImportacao;
		// TODO Auto-generated constructor stub
	}

	public Double getTaxaImportacao() {
		return taxaImportacao;
	}

	public void setTaxaImportacao(Double taxaImportacao) {
		this.taxaImportacao = taxaImportacao;
	}
	
	public Double precoTotal() {
		return getPreco() + taxaImportacao;
	}
	
	@Override
	public String etiquetaDePreco() {
		return getNome() + " $ " + precoTotal() + " (Taxa importação: $ " + getTaxaImportacao() + ")" ; 
	}

}
