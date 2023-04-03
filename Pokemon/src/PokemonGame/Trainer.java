package PokemonGame;

import java.util.ArrayList;
import java.util.Scanner;

public class Trainer {
	String trainerName;
	int trainerLevel;
	int[] trainerExp;
	int trainerCandy;
	int trainerMonsteball;
	Pokemon[] pokemon;
	
	public Trainer() {
		this.trainerName = "testName";
		this.trainerLevel = 1;
		this.trainerExp = {1,0};
		this.trainerCandy = 0;
		this.trainerMonsteball = 0;
		this.pokemon = new Pokemon[6];
	}
	
	Scanner scan = new Scanner(System.in);
	
	
	public void LevelUp() {
		this.trainerLevel++;	
		this.trainerExp[1] = 0;
		this.trainerExp[0] *= 2;
	}
	
	public void feedingCandy() {
		int pokeNum;
		if(this.trainerCandy<=0) {
			System.out.println("you have no candy"); //사탕 없을 때
			return;
		}
		
		System.out.println("Choose a Pokemon Number to feed candy");
		for(int i=0;i<6;i++) {
			System.out.print(i+" : [ "+this.pokemon[i].pokeName+" ] "); // 0 : [포케몬 이름] 형식으로 출력
		}
		System.out.println();
		System.out.print(">>");
		pokeNum = scan.nextInt();
		
		if(this.pokemon[pokeNum]==null || (pokeNum>6) || (pokeNum<0)) { //포케몬이 없거나 포케몬 번호가 0~5이 아닐때
			System.out.println("dose not exist pokemon");
			return;
		}
		
		this.pokemon[pokeNum].pokeLevel++;
		this.trainerCandy--;
	}
	
	public void releasePokemon(){
		int pokeNum;
		System.out.println("Choose a Pokemon Number to release");
		for(int i=0;i<6;i++) {
			System.out.print(i+" : [ "+this.pokemon[i].pokeName+" ] "); // 0 : [포케몬 이름] 형식으로 출력
		}
		
		System.out.println();
		System.out.print(">>");
		pokeNum = scan.nextInt();
		
		if(this.pokemon[pokeNum]==null || (pokeNum>6) || (pokeNum<0)) { //포케몬이 없거나 포케몬 번호가 0~5이 아닐때
			System.out.println("dose not exist pokemon");
			return;
		}
		
		this.pokemon[pokeNum] = null;
		
	}
	
	
}























































