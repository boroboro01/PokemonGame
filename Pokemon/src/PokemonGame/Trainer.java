package PokemonGame;

import java.util.Scanner;

public class Trainer {
	String trainerName;
	int trainerLevel;
	int[] trainerExp = {1, 0};
	int trainerCandy;
	int trainerMonsterball;
	int drug;
	int pokeNum;
	Pokemon[] pokemon;
	Pokemon battle_P;
	
	
	public Trainer() {
		this.trainerName = "testName";
		this.trainerLevel = 1;
		this.trainerCandy = 0;
		this.trainerMonsterball = 0;
		this.pokeNum = 0;
		this.pokemon = new Pokemon[6];
	}
	
	Scanner scan = new Scanner(System.in);
	
	
	public void LevelUp() {
		this.trainerLevel++;
		this.trainerExp[1] = 0;
		this.trainerExp[0] *= 2;
	}
	
	public void catchPokemon(Pokemon pokemon) {
		this.pokemon[pokeNum] = pokemon;
		System.out.println("Yes! Catch " + pokemon.pokeName);
		this.pokeNum = pokeNum + 1;
	}
	
	
	public void showMyPokemon() {
		for(int i=0;i<pokeNum;i++) {
			this.pokemon[i].printPokeInfo(); // 0 : [포케몬 이름] 형식으로 출력
		}
	}
	
	
	public void showMyBag{
		System.out.println("===========================================");
		System.out.println("0 [monster Ball] : "+this.trainerMonsterball + "1 [drug] : "+ this.drug + "2 [candy] : "+ this.trainerCandy);
	}
	
	
	public void feedingCandy() {
		int feedPokemon;
		
		if(this.trainerCandy<=0) {
			System.out.println("you have no candy"); //사탕 없을 때
			return;
		}
		
		System.out.println("Choose a Pokemon Number to feed candy");
		for(int i=0;i<pokeNum;i++) {
			System.out.println(i+" : [ "+this.pokemon[i].pokeName+" ] "); // 0 : [포케몬 이름] 형식으로 출력
		}
		System.out.print(">>");
		feedPokemon = scan.nextInt();
		
		if(this.pokemon[feedPokemon]==null || (feedPokemon>pokeNum) || (feedPokemon<0)) { //포케몬이 없거나 포케몬 번호가 0~5이 아닐때
			System.out.println("dose not exist pokemon");
			return;
		}
		
		this.pokemon[feedPokemon].LevelUp(this.pokemon[feedPokemon]);
		this.trainerCandy--;
	}
	
	public void releasePokemon(){
		int releasePoke;
		System.out.println("Choose a Pokemon Number to release");
		for(int i=0;i<pokeNum;i++) {
			System.out.print(i+" : [ "+this.pokemon[i].pokeName+" ] "); // 0 : [포케몬 이름] 형식으로 출력
		}
		
		System.out.println();
		System.out.print(">>");
		releasePoke = scan.nextInt();
		
		if(this.pokemon[releasePoke]==null || (releasePoke>pokeNum) || (releasePoke<0)) { //포케몬이 없거나 포케몬 번호가 0~5이 아닐때
			System.out.println("dose not exist pokemon");
			return;
		}
		
		this.pokemon[releasePoke] = null;
		this.pokeNum--;
		
	}
	
	
}























































