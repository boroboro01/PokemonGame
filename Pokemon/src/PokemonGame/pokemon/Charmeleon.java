package PokemonGame.pokemon;

import PokemonGame.Attack;
import PokemonGame.Pokemon;

public class Charmeleon extends Pokemon{
	private static final int pokeID = 102;

	public Charmeleon(String pokeName, String pokeType, int pokeLevel, int pokeTotalHP, int pokeHP, int pokePhysicDamage, int pokePhysicDefense,
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
		
		if(attack.attackType == "Water") { // Week type
			this.pokeHP = pokeHP + (pokeDamage * 2);
			if(pokeHP < 0) pokeHP = 0;
			System.out.println("It's super effective!");
			System.out.println(pokeName + "'s HP : " + pokeHP + " / " + pokeTotalHP);
		} else if(attack.attackType == "Grass" || attack.attackType == "Fire") { // Strong type
			this.pokeHP = pokeHP + (pokeDamage / 2);
			if(pokeHP < 0) pokeHP = 0;
			System.out.println("It's not very effective...");
			System.out.println(pokeName + "'s HP : " + pokeHP + " / " + pokeTotalHP);
		} else {
			this.pokeHP = pokeHP + pokeDamage;
			if(pokeHP < 0) pokeHP = 0;
			System.out.println(pokeName + "'s HP : " + pokeHP + " / " + pokeTotalHP);
		}
	}
}
