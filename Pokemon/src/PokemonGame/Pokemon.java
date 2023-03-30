package PokemonGame;

public class Pokemon {
	protected String pokeName;
	protected String pokeType;
	protected int pokeLevel;
	protected int pokeTotalHP;
	protected int pokeHP;
	protected int pokePhysicDamage;
	protected int pokePhysicDefense;
	protected int pokeMagicDamage;
	protected int pokeMagicDefense;
	
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
		System.out.println("	HP : " + pokeTotalHP + "/" + pokeHP);
		System.out.println("	Pyhsic Damage : " + pokePhysicDamage);
		System.out.println("	Pyhsic Defense : " + pokePhysicDefense);
		System.out.println("	Magic Damage : " + pokePhysicDamage);
		System.out.println("	Magic Defense : " + pokePhysicDefense);
		System.out.println("===========================================");
	}
	
	public void Evolution(int candy, String name) {
		for(int i=0;i<candy;i++) { // Feed candy
			pokeLevel++;
			pokeHP++;
			pokePhysicDamage++;
			pokePhysicDefense++;
			pokeMagicDamage++;
			pokeMagicDefense++;
			System.out.println(name + "'s LevelUP");
		}
	}
}
