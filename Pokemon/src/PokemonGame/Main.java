package PokemonGame;

import PokemonGame.pokemon.*;

public class Main {
	public static void main(String[] args) {
		System.out.println("Pokemon");
		
		Trainer player = new Trainer();
		Trainer AI = new Trainer();
		Pokemon Charmander = new Charmander("Charmander", "Fire", 5, 100, 100, 14, 2, 14, 2);
		Pokemon Bulbasaur = new Bulbasaur("Bulbasaur", "Grass", 5, 100, 100, 12, 2, 12, 4);
		Pokemon Squirtle = new Squirtle("Squirtle", "Water", 5, 100, 100, 10, 6, 10, 6);
		Pokemon Rattata = new Rattata("Rattata", "Normal", 3, 50, 50, 12, 2, 10, 2);
		
		Charmander.printPokeInfo();
		Squirtle.printPokeInfo();
		Rattata.printPokeInfo();
		
//		trainer.setTrainerCandy(10);
		player.catchPokemon(Charmander);
		player.catchPokemon(Squirtle);
		AI.catchPokemon(Rattata);
		AI.catchPokemon(Bulbasaur);
//		trainer.myPokemon();
//		trainer.feedingCandy();
		
		
		Battle battle = new Battle(player, AI);
		battle.Run();
	}
}
