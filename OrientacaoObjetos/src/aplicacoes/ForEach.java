package aplicacoes;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] listaNomes = new String[] { "Maria", "Joao", "Jose", "Pedro", "Paulo"};
		
		
		for (int i = 0; listaNomes.length > i; i++) {
			System.out.println(listaNomes[i]);
		}
		
		
		System.out.println("---------------------------------------------------------");
		for (String nome : listaNomes) {
			System.out.println(nome);
		}
	}

}
