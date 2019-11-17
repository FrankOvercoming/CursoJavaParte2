package entidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PolimorfismoProdutoUsado extends PolimorfismoProduto {

	private Date dataFabricacao;
		// SimpleDateFormat sdf foi instanciado como static pois assim todo objeto postagens
		// criado não criará um objeto sdf novo, pois static pertence a classe, assim sendo
		// economizando memoria e recursos
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	
	public PolimorfismoProdutoUsado() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PolimorfismoProdutoUsado(String nome, Double preco, String dataDeFabricacao) throws ParseException {
		super(nome, preco);
		dataFabricacao = sdf.parse(dataDeFabricacao);
		// TODO Auto-generated constructor stub
	}
	public Date getDataFabricacao() {
		return dataFabricacao;
	}
	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	@Override
	public String etiquetaDePreco() {
		return getNome() + " (Usado) $ " + getPreco() + " (Fabricado em: " + sdf.format(dataFabricacao) + ")";
	}
	
}
