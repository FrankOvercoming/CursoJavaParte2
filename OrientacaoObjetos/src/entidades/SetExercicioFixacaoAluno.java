package entidades;

public class SetExercicioFixacaoAluno {
	private int codigo;

	public SetExercicioFixacaoAluno(int codigo) {
	
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SetExercicioFixacaoAluno other = (SetExercicioFixacaoAluno) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}
	
	
	
	
	
	
}
