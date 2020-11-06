package dao;

import java.util.Scanner;

public class index {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Repositorio rp = new Repositorio();
		
		int opcao = 0;
		
		while( opcao != 4) {
		System.out.println("----------SITEMA DE CRUD----------");
		System.out.println("");
		System.out.println(" [1] Cadastra ");
		System.out.println(" [2] Lista ");
		System.out.println(" [3] Editar ");
		System.out.println(" [4] Sair");
		System.out.println("-----------------------------------");
		System.out.println("");
		System.out.println("selecione uma Opção: ");
		opcao = sc.nextInt();
		
		switch (opcao) {
		case (1):
			rp.Cadastro();
			break;
		case (2):
			rp.Listar();
			break;
		case (3):
			rp.editar();
			break;

		default:
			break;
		}//fim switch
		}// fim while		
sc.close();
	}

}
