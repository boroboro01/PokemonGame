package Pokemon;

public class pokemon {
	String pokeName;
	String pokeType;
	int pokeLevel;
	int pokeHP;
	int pokePhysicDamage;
	int pokePhysicDefense;
	int pokeMagicDamage;
	int pokeMagicDefense;
	
	pokemon(String pokeName, String pokeType, int pokeLevel, int pokeHP, int pokePhysicDamage, int pokePhysicDefense,
			int pokeMagicDamage, int pokeMagicDefense ) {
		this.pokeName = pokeName;
		this.pokeType = pokeType;
		this.pokeLevel = pokeLevel;
		this.pokeHP = pokeHP;
		this.pokePhysicDamage = pokePhysicDamage;
		this.pokePhysicDefense = pokePhysicDamage;
		this.pokeMagicDamage = pokePhysicDamage;
		this.pokeMagicDefense = pokePhysicDamage;
	}
	
	public void printPokeInfo() {
		System.out.println("	Name : " + pokeName);
		System.out.println("	Type : " + pokeType);
		System.out.println("	Level : " + pokeLevel);
		System.out.println("	HP : " + pokeHP);
		System.out.println("	Pyhsic Damage : " + pokePhysicDamage);
		System.out.println("	Pyhsic Defense : " + pokePhysicDefense);
		System.out.println("	Magic Damage : " + pokePhysicDamage);
		System.out.println("	Magic Defense : " + pokePhysicDefense);
	}
}
