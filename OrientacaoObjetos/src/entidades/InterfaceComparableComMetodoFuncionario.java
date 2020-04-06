package entidades;

public class InterfaceComparableComMetodoFuncionario implements Comparable<InterfaceComparableComMetodoFuncionario> {
	private String nome;
	private Double salario;
	
	
	public InterfaceComparableComMetodoFuncionario(String nome, Double salario) {
		this.nome = nome;
		this.salario = salario;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getSalario() {
		return salario;
	}


	public void setSalario(Double salario) {
		this.salario = salario;
	}


	@Override
	public int compareTo(InterfaceComparableComMetodoFuncionario o) {
		// TODO Auto-generated method stub
		// Na implementa��o do metodo comparable vamos retornar um numero positivo, negativo
		// ou zero, se for positivo ent�o o valor informado � maior do que o objeto recebido
		// aqui pela fun��o compareTo, se for negativo o valor informado � menor e se for
		// zero o valor � igual, no caso vamos comparar o objeto instanciado pela classe
		// this.getNome com o objeto recebido pelo metodo compareTo
		
		// Exemplificando
		// System.out.println("maria".compareTo("Alex"));
		// resultado 12 pois maria � maior do que Alex
		// System.out.println("Alex".compareTo("maria"));
		// resultado -12 pois alex � menor do que maria
		// System.out.println("maria".compareTo("maria"));
		// resultado 0 pois maria � igual a maria
		
		// Regra para comparable
		// Regra para compareTo
		// Regra para sort
		// Regra para ordena��o
		
		// Para ordenar em ordem decrescente s� colocar - pois assim o valor ser� trocado
		// ent�o ficaria -this.getNome().compareTo(o.getNome());
		
		return -this.getNome().compareTo(o.getNome());
	}


	
	
	

}
