package javabasico;

public class FuncoesParaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = " teste de strings ";
		String saidaUpper = original.toUpperCase();
		String saidaLower = saidaUpper.toLowerCase();
		String pedaco = original.substring(6);
		String pedacoMeio = original.substring(6, 10);
		String trocaStringChar = original.replace('e', 'i');
		String trocaString = original.replace("te", "ai");
		
		// Regra para String
		int f  = original.indexOf("e");
		int g = original.lastIndexOf("e");
		System.out.println(original);
		System.out.println(saidaUpper);
		System.out.println(saidaLower);
		System.out.println("Saida: " + pedaco);
		System.out.println("Saida pedaco meio:" + pedacoMeio + "----" );
		System.out.println("Pedaco meio com trim:" + pedacoMeio.trim() + "---");
		System.out.println("Replace char:" + trocaStringChar);
		System.out.println("Replace string:" + trocaString);
		System.out.println("Primeira ocorrencia de \"e\" posição: " + f);
		System.out.println("Ultima ocorrencia de \"e\" posição: " + g);
		
		//Usando split
		String[] saidas = original.split("s");
		for(int i=0; i< saidas.length; i++) {
			System.out.println("Palavra " + i + saidas[i]);
		}
	}
	

}
