package objects;

import java.io.Serializable;

/*Classe que representa o objeto Cliente*/


public class Cliente implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//------------------------------------------------------//
	//Atributos
	private String nome;
	private String telefone;
	private String nascimento;
	private int genero;
	private int idade;
	
	//------------------------------------------------------//
	//Construtor
	public Cliente(String nome, String telefone, String nascimento, int genero) {
		this.nome = nome;
		this.telefone = telefone;
		this.nascimento = nascimento;
		this.genero = genero;
	}
	
	//------------------------------------------------------//
	//M�todo toString
	@Override
	public String toString() {
		return "nome=" + nome + " telefone=" + telefone + " nascimento=" + nascimento + " genero=" + genero + "\n";
	}

	public void print() {
		String genEscrito = null;
		switch (this.getGenero()) {
		case 0:
			genEscrito = "Masculino";
			break;
		case 1:
			genEscrito = "Feminino";
			break;
		case 2:
			genEscrito = "Outros";
			break;
		}
		System.out.println("\n*********************");
		System.out.println("CLIENTE CADASTRADO");
		System.out.println("*********************");
		System.out.println("Nome: "+this.getNome());
		System.out.println("Telefone: "+this.getTelefone());
		System.out.println("Data de nascimento: "+this.getNascimento());
		System.out.println("G�nero: "+genEscrito);
		System.out.println("*********************");
	}
	
	//------------------------------------------------------//
	//Getters e Setters
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public int getGenero() {
		return genero;
	}
	public void setGenero(int genero) {
		this.genero = genero;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	

	
}
