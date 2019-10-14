package entidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio1Cliente {

	private String nome;
	private String email;
	private Date aniversario;
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Exercicio1Cliente() {
		
	}

	public Exercicio1Cliente(String nome, String email, Date aniversario) {
		this.nome = nome;
		this.email = email;
		this.aniversario = aniversario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAniversario() {
		return sdf.format(aniversario);
	}

	public void setAniversario(String dataAniversario) throws ParseException {
		
		this.aniversario = sdf.parse(dataAniversario);
	}

	@Override
	public String toString() {
		return "Exercicio1Cliente [nome=" + nome + ", email=" + email + ", aniversario=" + aniversario + ", sdf=" + sdf
				+ "]";
	}
	
	
	
	
	
}
