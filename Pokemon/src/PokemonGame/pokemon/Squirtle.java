package PokemonGame.pokemon;

import PokemonGame.Attack;
import PokemonGame.Pokemon;

public class Squirtle extends Pokemon {
	private static final int pokeID = 201;
	
	public Squirtle(String pokeName, String pokeType, int pokeLevel, int pokeTotalHP, int pokeHP, int pokePhysicDamage, int pokePhysicDefense,
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
			if(pokeHP < 0) pokeHP = 0;
			System.out.println("It's super effective!");
			System.out.println(pokeName + "'s HP : " + pokeHP + " / " + pokeTotalHP);
		} else if(attack.attackType == "Fire" || attack.attackType == "Water") { // Strong type
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
	
	public void skillList() {
		System.out.println("1) Tackle");
		System.out.println("2) WaterGun");
		System.out.println("3) TailWhip");
		System.out.println("4) Withdraw");
	}
	public Attack useAttackSkill(int skill, Pokemon enemy) {
		switch(skill) {
		case 1: return Tackle();
		case 2: return WaterGun();
		}
		return null;
	}
	public void useUtilSkill(int skill, Pokemon enemy) {
		switch(skill) {
		case 3: TailWhip(enemy);
		break;
		case 4: Withdraw();
		break;
		}
		return;
	}
}