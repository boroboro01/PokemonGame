package PokemonGame.pokemon;

import PokemonGame.Attack;
import PokemonGame.Pokemon;

public class Wartortle extends Pokemon {
	
	public Wartortle(String pokeName, String pokeType, int pokeLevel, int pokeTotalHP, int pokeHP, int pokePhysicDamage, int pokePhysicDefense,
			int pokeMagicDamage, int pokeMagicDefense) {
		super(pokeName, pokeType, pokeLevel, pokeTotalHP, pokeHP, pokePhysicDamage, pokePhysicDefense, pokeMagicDamage, pokeMagicDefense);
	}

	public void Defense(Attack attack) {
		int pokeDefense = 0;
		
		if(attack.attackMagic) {
			pokeDefense = pokeMagicDefense;
		} else {
			pokeDefense = pokePhysicDefense;
		}
		
		int pokeDamage = pokeDefense - attack.attackValue;
		if(pokeDamage > 0) {
			pokeDamage = -1;
		}
		
		if(attack.attackType == "Grass") { // Week type
			this.pokeHP = pokeHP + (pokeDamage * 2);
			System.out.println("It's super effective!");
			System.out.println(pokeName + "'s HP : " + pokeTotalHP + " / " + pokeHP);
		} else if(attack.attackType == "Fire") { // Strong type
			this.pokeHP = pokeHP + (pokeDamage / 2);
			System.out.println("It's not very effective...");
			System.out.println(pokeName + "'s HP : " + pokeTotalHP + " / " + pokeHP);
		} else {
			this.pokeHP = pokeHP + pokeDamage;
			System.out.println(pokeName + "'s HP : " + pokeTotalHP + " / " + pokeHP);
		}
	}
}