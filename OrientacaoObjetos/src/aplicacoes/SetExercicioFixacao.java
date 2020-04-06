package aplicacoes;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entidades.SetExercicioFixacaoAluno;

public class SetExercicioFixacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char teste = 66;
		System.out.println(teste);
		System.out.println("Quantos cursos para o professor X?: ");
		int qtdCursos = sc.nextInt();
		sc.nextLine();
		Set<SetExercicioFixacaoAluno> alunos = new HashSet<>();
		for(int i=65; i <= (qtdCursos + 64); i++) {
			System.out.println("Quantos alunos para o curso " + (char)i + " ?: " );
			int qtdAlunos = sc.nextInt();
			for( int f = 1; f <= qtdAlunos; f++) {
				System.out.println("Entre aluno numero: " + f);
				SetExercicioFixacaoAluno aluno = new SetExercicioFixacaoAluno(sc.nextInt());
				alunos.add(aluno);
			}
		}
		System.out.println("Total de alunos: " + alunos.size());
		
	}

}
