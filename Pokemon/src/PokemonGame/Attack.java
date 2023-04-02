package PokemonGame;

public class Attack {
	
	public int attackValue;
	public String attackType;
	public Boolean attackMagic;

	public Attack(int attackValue, String attackType, Boolean attackMagic) {
		this.attackValue = attackValue;
		this.attackType = attackType;
		this.attackMagic = attackMagic;
	}
}
