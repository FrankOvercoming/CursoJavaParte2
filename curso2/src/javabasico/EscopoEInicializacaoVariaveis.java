package javabasico;

public class EscopoEInicializacaoVariaveis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valor = 20;
		String saida;
		
		// Regra para escopo {} e variavel inicializada ou não
		// se a variavel não estiver visivel o compilador da erro
		// isso acontece se a variavel for criada dentro de um escopo {}
		// ou da erro de inicializacao se a variavel não tiver valor quando
		// for usada em algum momento
		if (valor > 100) {
			saida = "Funfou";
		} else {
			saida = "funfou2";
		}
		System.out.println(saida);

	}
	
	
}
