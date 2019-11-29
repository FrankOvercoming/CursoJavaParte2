package aplicacoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidades.ExcecoesPersonalizadasReservas;
import entidades.excecoes.ExcecoesPersonalizadasExcecao;


public class ExcecoesPersonalizadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			try {
				System.out.println("Numero do quarto: ");
				int numeroQuarto = sc.nextInt();
				System.out.println("Entre data do checkIn(dd/mm/yyyy): ");
				Date checkIn = sdf.parse(sc.next());
				System.out.println("Entre data do checkOut(dd/mm/yyyy): ");
				Date checkOut = sdf.parse(sc.next());
//			if (checkIn.after(checkOut)) {
//				System.out.println("Erro a data de checkIn n�o pode ser posterior"
//						+ " a data de checkOut");
//			} else {
				ExcecoesPersonalizadasReservas reserva = new ExcecoesPersonalizadasReservas(numeroQuarto, checkIn, checkOut);
				System.out.println("Reserva: " + reserva);
				
				System.out.println();
				System.out.println("Atualize as reservas: ");
				System.out.println("Entre data do checkIn(dd/mm/yyyy): ");
				checkIn = sdf.parse(sc.next());
				System.out.println("Entre data do checkOut(dd/mm/yyyy): ");
				checkOut = sdf.parse(sc.next());
				
// 				Este trecho seria usado se a classe n�o fizesse a valida��o de entrada de dados
//				na fun��o atualizaDatas
//				Date agora = new Date(); // retorna data de agora
//				
//				if ( checkIn.before(agora) || checkOut.before(agora) ) {
//					System.out.println("Data de checkIn ou checkOut n�o pode ser anterior a data atual");
//					
//				} else if(checkIn.after(checkOut)){
//					System.out.println("Data de checkIn n�o pode ser posterior a data de checkOut");
//				} else {

				// Este trecho comentado seria usado se fizemos a classe retornar o erro atrav�s
				// de uma String pela fun��o atualizaDatas n�o usando ent�o um lan�amento de
				// exce��o

				//	String retorno = reserva.atualizaDatas(checkIn, checkOut);
				//	if (retorno.isEmpty()) {
				//		System.out.println("Reserva: " + reserva);
				//	} else
				//		System.out.println(retorno);
				
				reserva.atualizaDatas(checkIn, checkOut);
				System.out.println("Reserva: " + reserva);
				
//			}
			}
			catch (ParseException e) {
				System.out.println("Valor inv�lido");
			}
			catch (ExcecoesPersonalizadasExcecao e) {
				// Neste caso o e.getMessage retorna a mensagem cadastrada por mim la na classe
				// de reserva que ir� disparar este erro caso as datas estejam erradas quanto
				// ao tempo de checkIn ou checkOut
				System.out.println("Erro ao inserir datas: " + e.getMessage());
			}
			catch(RuntimeException e) {
				// Atrav�s do UpCasting � possivel capturar erros como o
			    // InputMismatchException pois todos os erros herdam de RuntimeException
				System.out.println("Erro inesperado !!");
			}
	}

}
