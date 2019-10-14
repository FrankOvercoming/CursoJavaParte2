package aplicacoes;

public class BoxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 20;
		
		Object obj = x;
				
		System.out.println("Valor do objeto: " + obj);
		
		int a = (int) obj;
		
		System.out.println("Valor do int a: " + a);
	}

}
