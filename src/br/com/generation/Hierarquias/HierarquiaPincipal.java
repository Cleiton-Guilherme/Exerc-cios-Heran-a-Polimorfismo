package br.com.generation.Hierarquias; 


public class HierarquiaPincipal {
	public static void main(String[] args) {
		Cachorro dog = new Cachorro("Piter",2);
		Cavalo horse = new Cavalo("Maximus",12);
		Preguiça sloth = new Preguiça();
		
		System.out.println("\n--------------------------------Cachorro----------------------------------");
		System.out.println("O cachorro vibra ao ver sua dona:");
		dog.emitirSom();
		System.out.println("\nApós avistar seu lanche o cachorro disparou.");
		dog.correr();
		System.out.println("\n--------------------------------Cavalo------------------------------------");
		System.out.println("O "+horse.getNome()+" após não encontrar nada para comer reclamou:");
		horse.emitirSom();
		System.out.println("\nEntão seu dono o chamou: "+horse.getNome()+" venha cá!");
		horse.correr();
		System.out.println("\n--------------------------------Preguiça----------------------------------");
		System.out.println("A preguiça resolveu tentar escalar uma arvore que era muito grande: ");
		sloth.emitirSom();
		System.out.println("\nApós recusar-se ela cedeu e tentou: ");
		sloth.escalando();
		System.out.println();
	}

}