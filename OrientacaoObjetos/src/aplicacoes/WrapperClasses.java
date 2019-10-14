package aplicacoes;

public class WrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Usar wrapper classes em objetos java criados para banco de dados
		// como por exemplo produtos, pois assim os valores podem ser nulo e não zero
		// quando os campos forem primitivos, tipo int, double, boolean, então
		// usar as classes Integer, Double, Boolean
		int x = 20;
		
		Integer obj = x;
				
		System.out.println("Valor do Wrapper Class Integer: " + obj);
		
		int a =  obj * 3;
		
		System.out.println("Valor do int a: " + a);

	}

}
