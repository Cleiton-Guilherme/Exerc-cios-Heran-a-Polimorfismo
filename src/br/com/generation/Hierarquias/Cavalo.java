package br.com.generation.Hierarquias;

public class Cavalo extends Animal {
	
	public Cavalo(String nome, int idade) {
		Super(nome, idade);
		
	}
     private void Super(String nome, int idade) {
		// TODO Auto-generated method stub
		
	}
	public void correr() {
    	 System.out.println("Pcoto, Pocoto, Pocoto...");
    	 
     }
     public void emitirSom() {
    	 System.out.println("Estou com fome!! - Relinchou o Cavalo");
     }
}
