package PokemonGame;

import PokemonGame.pokemon.Charmander;
import PokemonGame.pokemon.Charmeleon;
import PokemonGame.pokemon.Rattata;
import PokemonGame.pokemon.Squirtle;

public class Main {
	public static void main(String[] args) {
		System.out.println("Pokemon");
		
		Trainer player = new Trainer();
		Trainer AI = new Trainer();
		Pokemon Charmander = new Charmander("Charmander", "Fire", 5, 100, 100, 14, 5, 14, 5);
		Pokemon Squirtle = new Squirtle("Squirtle", "Water", 5, 100, 100, 11, 8, 11, 8);
		Pokemon Rattata = new Rattata("Rattata", "Normal", 3, 30, 30, 6, 2, 6, 2);
		
		
		Charmander.printPokeInfo();
		Squirtle.printPokeInfo();
		Rattata.printPokeInfo();
		
		Rattata.Defense(Squirtle.WaterGun()); //Squirtle Attack Rattata
		
		Charmander.Defense(Squirtle.WaterGun()); //Squirtle Attack Charmander
		Squirtle.Defense(Charmander.Ember());
		Charmander.Growl(Squirtle);
		Squirtle.TailWhip(Charmander);
		Squirtle.Withdraw();
		
		Charmander.printPokeInfo();
		Squirtle.printPokeInfo();
		
		Charmander.printPokeInfo();
//		
//		trainer.setTrainerCandy(10);
		player.catchPokemon(Charmander);
		player.catchPokemon(Squirtle);
		AI.catchPokemon(Rattata);
//		trainer.myPokemon();
//		trainer.feedingCandy();
		
		
		Battle battle = new Battle(player, AI);
		battle.Run();
	}
}
