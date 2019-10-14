package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Postagens {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momento;
	private String titulo;
	private String conteudo;
	private Integer qtdLikes;
	
	private List<Comentarios> comentariosLista = new ArrayList<>();
	
	
	public Postagens() {
		
	}


	public Postagens(Date momento, String titulo, String conteudo, Integer qtdLikes) {
		this.momento = momento;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.qtdLikes = qtdLikes;
		
	}


	public Date getMomento() {
		return momento;
	}


	public void setMomento(Date momento) {
		this.momento = momento;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getConteudo() {
		return conteudo;
	}


	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}


	public Integer getQtdLikes() {
		return qtdLikes;
	}


	public void setQtdLikes(Integer qtdLikes) {
		this.qtdLikes = qtdLikes;
	}


	public void addComentario(Comentarios comentario) {
		comentariosLista.add(comentario);
		
	}

	public void removeComentario(Comentarios comentario) {
		comentariosLista.remove(comentario);
	}
	
	public List<Comentarios> getComentarios(){
		return comentariosLista;
	}
	
	public void exibeComentarios(StringBuilder saida) {
		for ( Comentarios comentario : comentariosLista) {
			saida.append(comentario.getTexto() + "\n");
		}
	}
	
	public String toString() {
		StringBuilder saida = new StringBuilder();
		saida.append(titulo + "\n");
		saida.append(qtdLikes);
		saida.append(" Likes - ");
		saida.append(sdf.format(momento) + "\n" );
		saida.append(conteudo + "\n");
		saida.append("Comentarios:\n");
		exibeComentarios(saida);
		return saida.toString();
	}
	
}
