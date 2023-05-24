package PokemonGame.pokemon;

import PokemonGame.Attack;
import PokemonGame.Pokemon;

public class Rattata extends Pokemon {
	private static final int pokeID = 4;
	
	public Rattata(String pokeName, String pokeType, int pokeLevel, int pokeTotalHP, int pokeHP, int pokePhysicDamage, int pokePhysicDefense,
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
		
		
		this.pokeHP = pokeHP + pokeDamage;
		if(pokeHP < 0) pokeHP = 0;
		System.out.println(pokeName + "'s HP : " + pokeHP + " / " + pokeTotalHP);
	}
	
	public void skillList() {
		System.out.println("1) Tackle");
		System.out.println("3) TailWhip");
	}
	public Attack useAttackSkill(int skill, Pokemon enemy) {
		switch(skill) {
		case 1: return Tackle();
		case 2: return Tackle();
		}
		return null;
	}
	public void useUtilSkill(int skill, Pokemon enemy) {
		switch(skill) {
		case 3: TailWhip(enemy);
		break;
		case 4: TailWhip(enemy);
		break;
		}
		return;
	}
}