package aplicacoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidades.Comentarios;
import entidades.Postagens;

public class StringBuilder {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

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
