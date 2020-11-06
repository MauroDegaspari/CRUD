package dao;

import java.util.ArrayList;
import java.util.Scanner;

import entidade.Usuario;

public class Repositorio {

	Scanner sc = new Scanner(System.in);
	Usuario usuario = new Usuario();
	ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();		

	public void Cadastro() {
		
		usuario = new Usuario();
		System.out.println("");
		System.out.println("++++++++++ CADASTRO DE CLIENTES ++++++++++");
		System.out.println("");
		System.out.print(" Digite seu nome: ");
		usuario.setNome(sc.next());
		
		System.out.print(" Digite o CPF:");
		usuario.setCpf(sc.next());
		
		System.out.print(" Digite o sexo: ");
		usuario.setSexo(sc.next());
		
		System.out.print("Digite a sua Idade: ");
		usuario.setIdade(sc.nextInt());
		
		listaUsuario.add(usuario);
	

	} // METHOD Cadastro
	
	public void Listar() {
		
		for (int i = 0; i < listaUsuario.size(); i++) {
			
			System.out.println( "Nome: " +listaUsuario.get(i).getNome()+"\n CPF " + listaUsuario.get(i).getCpf()
					+"\n Sexo: "+ listaUsuario.get(i).getSexo()+ "\n Idade: " + listaUsuario.get(i).getIdade());
			System.out.println("");
			System.out.println("----------------------");
			System.out.println("");
			

		}
	} // METODO LISTAR
	
	public void editar() {
		
		String cpf; 
		System.out.println("Digite o CPF do Usuario para Editar: ");
		cpf = sc.next();
		
		for (int i = 0; i < listaUsuario.size(); i++) {
			if (listaUsuario.get(i).getCpf().equalsIgnoreCase(cpf) && !listaUsuario.get(i).getCpf().isEmpty()){
				
				int opcao = 0;
				while(opcao != 5) {
				System.out.println(" Usuario encontrado: "+ listaUsuario.get(i).getNome());
				System.out.println("");
				System.out.println("[1] Editar Nome");
				System.out.println("[2] Editar Sexo");
				System.out.println("[3] Editar Idade");
				System.out.println("[4] DELETAR USUARIO");
				System.out.println("");
				System.out.println(" Digite a Opção");
				opcao = sc.nextInt();
				
				switch (opcao) {
				case (1):
					System.out.println(" ***** EDITAR NOME *****");
					System.out.println("");
					System.out.println("Nome Atual:" + listaUsuario.get(i).getNome());
					System.out.println(" Digite o novo nome:");
					listaUsuario.get(i).setNome(sc.next());
					System.out.println("");
					System.out.println(" NOME ATUALIZADO! ");
				
					break;
					
				case (2):
					System.out.println(" ***** EDITAR SEXO *****");
					System.out.println("");
					System.out.println("Sexo Atual:" + listaUsuario.get(i).getSexo());
					System.out.println(" Digite o Sexo:");
					listaUsuario.get(i).setSexo(sc.next());
					System.out.println("");
					System.out.println(" Sexo ATUALIZADO! ");
				
					break;
					
				case (3):
					System.out.println(" ***** EDITAR IDADE *****");
					System.out.println("");
					System.out.println("Idade Atual:" + listaUsuario.get(i).getIdade());
					System.out.println(" Digite a idade:");
					listaUsuario.get(i).setIdade(sc.nextInt());
					System.out.println("");
					System.out.println(" IDADE ATUALIZADO! ");
				
					break;
				case (4):
					System.out.println(" ***** DELETAR USUÁRIO *****");
					System.out.println("");
					System.out.println(" Deseja deletar o Usuário e todos os dados? ");
					System.out.println("[1] sim");
					System.out.println("[2] não");
					int deletar = sc.nextInt();
					if (deletar == 1 ) {
						listaUsuario.remove(i);
						System.out.println(" Usuario deletado");
						opcao = 5;
						break;
						}
						else if(deletar == 2) {System.out.println(" voltando ao menu.");
						}else{
							System.out.println(" opção invalida");
							break;
							}
					
		;
				
					break;
					
				default:
					System.out.println("opção invalida.");
					break;
				}// switch
				}// while
						
			}else
			{
				System.out.println("Usuario não encontrado!");
			}
		}//for
	}
	
	
	
}
