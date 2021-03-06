package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidades.enums.NivelTrabalhador;

public class Trabalhador {
	private String nome;
	private NivelTrabalhador nivel;
	private Double salarioBase;
	
	// Quando colocamos um objeto dentro de outro objeto como estamos colocando aqui
	// o Departamento e a lista de ContratoPorHora dizemos que estamos fazendo uma
	// composi��o de objetos
	
	private Departamento departamento;
	
	// Arraylist precisa ser instanciado pois a classe gera valor nulo
	// quando o objeto for instanciado
	private List<ContratoPorHora> contratos = new ArrayList<>();
	
	public Trabalhador () {
		
	}
	
	public Trabalhador(String nome, NivelTrabalhador nivel, Double salarioBase, Departamento departamento) {
		
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(NivelTrabalhador nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	public void adicionaContrato(ContratoPorHora contrato) {
		contratos.add(contrato);
	}

	public void removerContrato(ContratoPorHora contrato) {
		contratos.remove(contrato);
	}
	
	public Double ganho(Integer ano, Integer mes) {
		Double total = salarioBase;
		Calendar cal = Calendar.getInstance();
		int mesContrato = 0;
		int anoContrato = 0;
		mes++;
		for (ContratoPorHora contrato : contratos) {
			cal.setTime(contrato.getDataContrato());
			mesContrato = cal.get(Calendar.MONTH);
			anoContrato = cal.get(Calendar.YEAR);
			// acrescentar mais um, pois o mes do Calendar come�a com zero !!
			mesContrato++;
			if ( anoContrato == ano && mesContrato == mes ) {
				total += contrato.valorTotalContrato();
			}
		}
		return total;
	}
}
