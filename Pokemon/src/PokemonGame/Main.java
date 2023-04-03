package PokemonGame;

import PokemonGame.pokemon.Charmander;
import PokemonGame.pokemon.Charmeleon;
import PokemonGame.pokemon.Rattata;
import PokemonGame.pokemon.Squirtle;

public class Main {
	public static void main(String[] args) {
		System.out.println("Pokemon");
		
		Trainer trainer = new Trainer();
		Charmander Charmander = new Charmander("Charmander", "Fire", 5, 100, 100, 14, 5, 14, 5);
		Squirtle Squirtle = new Squirtle("Squirtle", "Water", 5, 100, 100, 11, 8, 11, 8);
		Rattata Rattata = new Rattata("Rattata", "Normal", 3, 30, 30, 6, 2, 6, 2);
		
		
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
		
		trainer.setTrainerCandy(10);
		trainer.catchPokemon(Squirtle);
		trainer.myPokemon();
		trainer.feedingCandy();
	}
}
