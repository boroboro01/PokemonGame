package PokemonGame;
import java.util.Scanner;

public class Battle {
	Trainer player;
	Trainer enemyTrainer;
	
	public Battle(Trainer player, Trainer enemyTrainer) {
		this.player = player;
		this.enemyTrainer = enemyTrainer;
	}
	
	Scanner scan = new Scanner(System.in);
	
	public int select() {
		System.out.println("====> ");
		
		int index = scan.nextInt();
		int i = index;
		return i;
	}
	public Trainer Run() {
		int i = 0;
		int j = 0;
		System.out.println("===========================================");
		System.out.println("Battle start with " + enemyTrainer.trainerName + " !");
		System.out.println(enemyTrainer.trainerName + "fileded " + enemyTrainer.pokemon[j].pokeName + " !");
		System.out.println("Let's go " + player.pokemon[i].pokeName + " !");
		
		while(true) {
			System.out.println("What should I do?");
			System.out.println(player.pokemon[i].pokeName + "'s HP : " + player.pokemon[i].pokeTotalHP);
			player.pokemon[i].skillList();
			System.out.println("5) Change pokemon");
			System.out.println("6) Surrender");
			System.out.println("====> ");
			int command = scan.nextInt();
			
			if(command <= 2) {
				enemyTrainer.pokemon[j].Defense(player.pokemon[i].useAttackSkill(command, enemyTrainer.pokemon[j]));
			} else if (2 < command && command <= 4) {
				player.pokemon[i].useUtilSkill(command, enemyTrainer.pokemon[j]);
			} else if (command == 5) { // change pokemon
				System.out.println("Select change pokemon");
				player.myPokemonList();
				System.out.println("====> ");
				
				int index = scan.nextInt();
				i = index;
			} else if (command == 6) { // surrend battle
				System.out.println("I lose battle with " + enemyTrainer.trainerName);
				break;
			}
			
			player.pokemon[i].pokeHP = player.pokemon[i].pokeHP - player.pokemon[i].pokeHP;
			
			if(player.pokemon[i].pokeHP == 0) { // check player lose
				int lose = 0;
				System.out.println(player.pokemon[i].pokeName + "be retired !");
				
				for(int k=0;k<player.pokeNum;k++) { // check player have other pokemon
					if(player.pokemon[k].pokeHP == 0) {
						lose++;
					}
				}
			
				if(lose == player.pokeNum) {
					System.out.println("I lose battle with " + enemyTrainer.trainerName);
					break;
				} else {
					System.out.println("Select next pokemon to battle");
					player.myPokemonList();
					i = select();
				}
			}
		}
		return player;
	}
}
