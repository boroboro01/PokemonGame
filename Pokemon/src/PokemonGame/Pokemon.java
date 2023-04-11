package PokemonGame;

import PokemonGame.SkillList.NormalSkill;
import PokemonGame.SkillList.FireSkill;
import PokemonGame.SkillList.WaterSkill;

public class Pokemon implements NormalSkill, FireSkill, WaterSkill{
	public static final String RESET = "\u001B[0m";   
	public static final String FONT_GREEN = "\u001B[32m"; 
	public static final String FONT_RED = "\u001B[31m";
	public static final String FONT_BLUE = "\u001B[34m"; 
	public static final String FONT_YELLOW = "\u001B[33m"; 
	public static final String FONT_BROWN = "\u001B[0;33m";
	public static final String FONT_OCHAR = "\u001B[0;38;5;95m";
	
	protected String pokeName;
	protected String pokeType;
	protected int pokeLevel;
	protected int pokeTotalHP;
	protected int pokeHP;
	protected int pokePhysicDamage;
	protected int pokePhysicDefense;
	protected int pokeMagicDamage;
	protected int pokeMagicDefense;
	protected String[] skillList = new String[4];
	
	public Pokemon(String pokeName, String pokeType, int pokeLevel, int pokeTotalHP, int pokeHP, int pokePhysicDamage, int pokePhysicDefense,
			int pokeMagicDamage, int pokeMagicDefense ) {
		this.pokeName = pokeName;
		this.pokeType = pokeType;
		this.pokeLevel = pokeLevel;
		this.pokeTotalHP = pokeTotalHP;
		this.pokeHP = pokeHP;
		this.pokePhysicDamage = pokePhysicDamage;
		this.pokePhysicDefense = pokePhysicDefense;
		this.pokeMagicDamage = pokeMagicDamage;
		this.pokeMagicDefense = pokeMagicDefense;
	}
	
	public void printPokeInfo() {
		System.out.println("===========================================");
		System.out.println("	Name : " + pokeName);
		System.out.println("	Type : " + pokeType);
		System.out.println("	Level : " + pokeLevel);
		System.out.println("	HP : " + pokeTotalHP + " / " + pokeHP);
		System.out.println("	Pyhsic Damage : " + pokePhysicDamage);
		System.out.println("	Pyhsic Defense : " + pokePhysicDefense);
		System.out.println("	Magic Damage : " + pokeMagicDamage);
		System.out.println("	Magic Defense : " + pokeMagicDefense);
		System.out.println("===========================================");
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
		
		if(attack.attackType == "Something") { // Week type
			this.pokeHP = pokeHP + (2 * pokeDamage);
			System.out.println("It's super effective!");
			System.out.println(pokeName + "'s HP : " + pokeTotalHP + " / " + pokeHP);
		} else if(attack.attackType == "Something") { // Strong type
			this.pokeHP = pokeHP + (2 * pokeDamage);
			System.out.println("It's not very effective...");
			System.out.println(pokeName + "'s HP : " + pokeTotalHP + " / " + pokeHP);
		} else {
			this.pokeHP = pokeHP + pokeDamage;
			System.out.println(pokeName + "'s HP : " + pokeTotalHP + " / " + pokeHP);
		}
	}
	
	
	
	//Normal Skill List
	public Attack Tackle() {
		System.out.println(pokeName + "'s Tackle!");
		int attackDamage = pokePhysicDamage;
		String attackType = "Normal";
		Boolean attackMagic = false;
		return new Attack(attackDamage, attackType, attackMagic);
	}
	public void TailWhip(Pokemon pokemon) {
		System.out.println(pokeName + "'s Tail Whip!");
		System.out.println(pokemon.pokeName + "'s Physical Defense have rankdown!");
		pokemon.pokePhysicDefense = (int) (pokemon.pokePhysicDefense - pokemon.pokePhysicDefense * 0.3);
	};
	public void Growl(Pokemon pokemon) {
		System.out.println(pokeName + "'s Growl!");
		System.out.println(pokemon.pokeName + "'s Physical Damage have rankdown!");
		pokemon.pokePhysicDamage = (int) (pokemon.pokePhysicDamage - pokemon.pokePhysicDamage * 0.3);
	};
	public Attack Slash() {
		System.out.println(pokeName + "'s Slash!");
		int attackDamage = pokePhysicDamage + 5;
		String attackType = "Normal";
		Boolean attackMagic = false;
		return new Attack(attackDamage, attackType, attackMagic);
	}
	
	//Grass Skill List
	public Attack VineWhip() {
		System.out.println(FONT_GREEN + pokeName + "'s Vine Whip!" + RESET);
		int attackDamage = pokePhysicDamage + 3;
		String attackType = "Grass";
		Boolean attackMagic = false;
		return new Attack(attackDamage, attackType, attackMagic);
	}
	public Attack RazorLeaf() {
		System.out.println(FONT_GREEN + pokeName + "'s Razor Leaf!" + RESET);
		int attackDamage = pokePhysicDamage + 8;
		String attackType = "Grass";
		Boolean attackMagic = false;
		return new Attack(attackDamage, attackType, attackMagic);
	}
	public void Synthesis() {
		System.out.println(FONT_GREEN + pokeName + "'s Synthesis!" + RESET);
		System.out.println(FONT_GREEN + pokeName + " regenerate HP!" + RESET);
		pokeHP = pokeHP + pokeHP / 2;
	}
	public void SolarBeamReady() {
			System.out.println(FONT_GREEN + pokeName + "'s Solar Beam!" + RESET);
			System.out.println(FONT_GREEN + pokeName + " is gathering solar power!" + RESET);
	}
	public Attack SolarBeamAttack() {
		System.out.println(FONT_GREEN + pokeName + "'s Solar Beam!" + RESET);
		int attackDamage = pokeMagicDamage + 25;
		String attackType = "Grass";
		Boolean attackMagic = true;
		return new Attack(attackDamage, attackType, attackMagic);
	}

	//Fire Skill List
	public Attack Ember() {
		System.out.println(FONT_RED + pokeName + "'s Ember!" + RESET);
		int attackDamage = pokeMagicDamage + 3;
		String attackType = "Fire";
		Boolean attackMagic = true;
		return new Attack(attackDamage, attackType, attackMagic);
	}
	public Attack FireFang() {
		System.out.println(FONT_RED + pokeName + "'s Fire Fang!" + RESET);
		int attackDamage = pokePhysicDamage + 8;
		String attackType = "Fire";
		Boolean attackMagic = false;
		return new Attack(attackDamage, attackType, attackMagic);
	}
	public Attack Flamethrower() {
		System.out.println(FONT_RED + pokeName + "'s Flamethrower!" + RESET);
		int attackDamage = pokeMagicDamage + 12;
		String attackType = "Fire";
		Boolean attackMagic = true;
		return new Attack(attackDamage, attackType, attackMagic);
	}
	public Attack FlareBlitz() {
		System.out.println(FONT_RED + pokeName + "'s Flare Blitz!" + RESET);
		int attackDamage = pokePhysicDamage + 20;
		String attackType = "Fire";
		Boolean attackMagic = false;
		System.out.println(FONT_RED + pokeName + "'s damaged by recoil!" + RESET);
		pokeHP = pokeHP - pokePhysicDamage / 2;
		return new Attack(attackDamage, attackType, attackMagic);
	}
	
	
	
	//Water Skill List
	public Attack WaterGun() {
		System.out.println(FONT_BLUE + pokeName + "'s Water Gun!" + RESET);
		int attackDamage = pokeMagicDamage + 3;
		String attackType = "Water";
		Boolean attackMagic = true;
		return new Attack(attackDamage, attackType, attackMagic);
	}
	public void Withdraw() {
		System.out.println(FONT_BLUE + pokeName + "'s Withdraw!" + RESET);
		System.out.println(FONT_BLUE + pokeName + "'s Physical Defense have rankup!" + RESET);
		pokePhysicDefense = (int) (pokePhysicDefense + pokePhysicDefense * 0.3);
	}
	public Attack WaterPulse() {
		System.out.println(FONT_BLUE + pokeName + "'s Water Pulse!" + RESET);
		int attackDamage = pokeMagicDamage + 8;
		String attackType = "Water";
		Boolean attackMagic = true;
		return new Attack(attackDamage, attackType, attackMagic);
	}
	public Attack HydroPump() {
		System.out.println(FONT_BLUE + pokeName + "'s Hydro Pump!" + RESET);
		int attackDamage = pokeMagicDamage + 16;
		String attackType = "Water";
		Boolean attackMagic = true;
		return new Attack(attackDamage, attackType, attackMagic);
	}
	
	
	public void LevelUp(int candy) {
		for(int i=0;i<candy;i++) { // Feed candy
			pokeLevel++;
			pokeTotalHP++;
			pokeHP++;
			pokePhysicDamage++;
			pokePhysicDefense++;
			pokeMagicDamage++;
			pokeMagicDefense++;
		}
		System.out.println(pokeName + "has become Level " + pokeLevel + "!!");
	}

	public void skillList() {
		System.out.println("print skill list");
	}

	public Attack useAttackSkill(int skill, Pokemon enemy) {
		return Tackle();
	}
	public void useUtilSkill(int skill, Pokemon enemy) {
		Growl(enemy);
		return;
	}
}
