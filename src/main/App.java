package main;

/*Classe do front-end*/

import objects.Cliente;

import java.io.File;

import interfaces.LeituraTeclado;
import interfaces.Menu;
import methods.*;


public class App {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		
		//Inicializa��o ---- N�O MEXER !!!
		/*File clientes = new File(System.getProperty("user.home") + "\\clientes.ser");
		File servicos = new File(System.getProperty("user.home") + "\\servicos.ser");
		
		clientes.mkdirs(); servicos.mkdirs();*/
		
		// ------------------------------
		LeituraTeclado leitura = new LeituraTeclado();
		int escolha = 0;
		while (escolha != 5) {
			Menu.mostrarMenu();
			escolha = leitura.numero();
			
		if (escolha == 0){
			System.out.println("Nome do cliente:");
			String nome = leitura.texto();
			System.out.println("N�mero de telefone:");
			String telefone = leitura.texto();
			System.out.println("Data de nascimento:");
			String nascimento = leitura.texto();
			System.out.println("Informe o g�nero");
			System.out.println("Digite 0 para Masculino, 1 para Feminino ou 2 para Outros");
			int genero = leitura.numero();
			Cliente c = new Cliente(nome, telefone, nascimento, genero);
			Cadastrar.cliente(c);
			System.out.println(c);
		}
		
		if (escolha == 1) {
			System.out.println("Insira o nome do cliente a ser editado:");
			String alvo = leitura.texto();
			Editar.cliente(alvo);
			
		}
		
		if (escolha == 2) {
			System.out.println("Insira o nome do cliente a ser exclu�do:");
			String alvo = leitura.texto();
			Excluir.cliente(alvo);
		}
		
		if (escolha == 3) {
			System.out.println("Selecione a op��o desejada:");
			System.out.println("0- Listar por g�nero Masculino");
			System.out.println("1- Listar por g�nero Feminino");
			System.out.println("2- Listar por g�nero Outros");
			System.out.println("3- Listar todos");
			escolha = 0;
			escolha = leitura.numero();
			
			if (escolha != 3) {
				Listar.genero(escolha);
			}
			else {
				Listar.clientes();
			}
		}
		
		if (escolha == 4) {
			System.out.println("gerar relatorios");
		}
		
		
		
	}
		
  }

}
