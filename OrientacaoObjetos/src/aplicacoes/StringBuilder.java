package aplicacoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidades.Comentarios;
import entidades.Postagens;

public class StringBuilder {
	// SimpleDateFormat sdf foi instanciado como static pois assim todo objeto postagens
		// criado não criará um objeto sdf novo, pois static pertence a classe, assim sendo
		// economizando memoria e recursos
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Comentarios c1 = new Comentarios("Tenha uma ótima viagem");
		Comentarios c2 = new Comentarios("Oh que legal");
		
		Postagens postagem1 = new Postagens(
				sdf.parse("21/06/2018 13:05:44"),
				"Viajando para PQP",
				"Estou indo visitar esse lugar incrivel",
				12);
		postagem1.addComentario(c1);
		postagem1.addComentario(c2);
		
		System.out.println(postagem1);
	}

}
