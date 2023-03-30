package PokemonGame.pokemon;

import PokemonGame.Attack;
import PokemonGame.NormalSkill;
import PokemonGame.Pokemon;

public class Rattata extends Pokemon implements NormalSkill{
	
	public Rattata(String pokeName, String pokeType, int pokeLevel, int pokeTotalHP, int pokeHP, int pokePhysicDamage, int pokePhysicDefense,
			int pokeMagicDamage, int pokeMagicDefense) {
		super(pokeName, pokeType, pokeLevel, pokeTotalHP, pokeHP, pokePhysicDamage, pokePhysicDefense, pokeMagicDamage, pokeMagicDefense);
	}

	public void Defense(Attack attack) {
		this.pokeHP = pokeHP + (pokePhysicDefense - attack.attackValue);
		System.out.println("Rattata is attacked!");
		System.out.println("HP : " + pokeHP);
	}
	public Attack Tackle(int damage) {
		System.out.println("Rattata Tackle!");
		int attackValue = damage;
		String attackType = "Normal";
		return new Attack(attackValue, attackType);
	}
	
	public void Grrr() {
		System.out.println("Grrrr...");
	}
}