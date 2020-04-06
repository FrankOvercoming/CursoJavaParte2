package aplicacoes;

import entidades.HashcodeEqualsCliente;

public class HashcodeEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Maria";
		String b = "João";
		String c = "Maria";
		
		System.out.println(a.equals(b));
		
		System.out.println("HashCode a: " + a.hashCode());
		System.out.println("HashCode b: " + b.hashCode());
		System.out.println("HashCode c: " + c.hashCode());
		
		// Hashcode é mais rapido do que Equals mas não é 100% pois se os objetos derem
		// hashcode diferentes então com 100% de certeza são diferentes, mas se derem iguais
		// pode ter havido colizão devido ao numero limitado de casa para a saida do
		// hashcode que é Integer
		// Hashcode é muito usado em extensas listas que contem a maioria dos itens diferentes
		// Hashcode de objetos iguais tem que obrigatoriamente dar valores iguais
		// Usado da seguinte forma em listas grandes, primeiro vc compara o hashcode
		// que é muito mais rapido do que o equals, se der igual vc compara com equals para
		// confirmar 100%
		// Regra para HashCode
		// Regra para equals
		
		
		// Testando Hashcode e Equals feito para a Classe criada
		
		HashcodeEqualsCliente cli1 = new HashcodeEqualsCliente("Joao", "joao@email.com.br");
		HashcodeEqualsCliente cli2 = new HashcodeEqualsCliente("Maria", "maria@email.com.br");
		HashcodeEqualsCliente cli3 = new HashcodeEqualsCliente("Joao", "joao@uol.com.br");
	
		System.out.println("cli1 = cli2 por hashcode: " + (cli1.hashCode() == cli2.hashCode()));
		System.out.println("cli1 = cli3 por hashcode: " + (cli1.hashCode() == cli3.hashCode()));
 		
		System.out.println("cli1 = cli2 por equals: " + cli1.equals(cli2));
		System.out.println("cli1 = cli3 por equals: " + cli1.equals(cli3));
		
		// Abaixo testando comparação de strings literais com ==
		String str1 = "Test";
		String str2 = "Test";
		
		String str3 = new String("Test");
		String str4 = new String("Test"); // Aqui força a criação de um novo objeto como
		// um objeto comum
		// Regra para String
		
		
		System.out.println("str1 = str2: " + (str1 == str2));
		System.out.println("str3 = str4: " + (str3 == str4));
		
		// Quando testamos string literal isto é, escrita no próprio código como 
		// String str1 = "Test" o compilador aceita usar == e não trata como == para
		// objetos
		// Regra para String literais
		// Regra para Literais de String
		// Regra para ==
	}

}
