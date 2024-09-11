
package EscolaSenai;

import java.util.Scanner;

public class Menu {

    public static void menuAluno(){

        int opcao;
		do {

			System.out.println("\n- MENU -");
			System.out.println("O que deseja fazer?");
			System.out.println("1- Cadastrar novo aluno");
			System.out.println("2- Atualizar aluno");
			System.out.println("3- Deletar aluno");
			System.out.println("4- Listar alunos");
			System.out.println("0- Sair\n");
			System.out.print("Digite uma opção: ");
			Scanner sc = new Scanner(System.in);
			opcao = sc.nextInt();
            System.out.println("\n");

			switch(opcao){
				case 1:
					Aluno.cadastrarAluno();
					break;
				case 2:
					// Atualizar Aluno
					System.out.println("Atualizando aluno...");
					break;
					case 3:
					// Deletar Aluno
					System.out.println("Deletando aluno...");
					break;
				case 4:
					Aluno.imprimeListaDeAluno();
					break;
				case 0:
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Opção inválida");
					break;
			}
		} while(opcao != 0);

    }

}
