package PokemonGame.SkillList;

import PokemonGame.Attack;
import PokemonGame.Pokemon;

public interface NormalSkill {
	public Attack Tackle();
	public Attack Slash();
	public void TailWhip(Pokemon pokemon);
	public void Growl(Pokemon pokemon);
}
