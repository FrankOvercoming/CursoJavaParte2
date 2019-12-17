package entidades;

public class DiretorioVerificado {
	
	private String caminhoDiretorio;
	private Boolean verificado;
	
	public DiretorioVerificado() {
		
	}
	
	public DiretorioVerificado(String caminhoDiretorio) {
		this.caminhoDiretorio = caminhoDiretorio;
	}
	
	public String getCaminhoDiretorio() {
		return caminhoDiretorio;
	}
	public void setCaminhoDiretorio(String caminhoDiretorio) {
		this.caminhoDiretorio = caminhoDiretorio;
	}
	public Boolean getVerificado() {
		return verificado;
	}
	public void setVerificado(Boolean verificado) {
		this.verificado = verificado;
	}
	
	

}
