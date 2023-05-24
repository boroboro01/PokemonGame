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
		
		int i = scan.nextInt();
		return i;
	}
	public Trainer Run() {
		int command = 0;
		int i = 0;
		int j = 0;
		System.out.println("==========================================="); // Notify starting of battle to player
		System.out.println("Battle start with " + enemyTrainer.trainerName + " !");
		System.out.println(enemyTrainer.trainerName + " fileded " + enemyTrainer.pokemon[j].pokeName + " !");
		System.out.println("Let's go " + player.pokemon[i].pokeName + " !");
		
		while(true) {
			System.out.println("What should I do?"); // Print information of pokemons HP
			System.out.println(player.pokemon[i].pokeName + "'s HP : " + player.pokemon[i].pokeHP + " / " + player.pokemon[i].pokeTotalHP);
			System.out.println(enemyTrainer.pokemon[j].pokeName + "'s HP : " + enemyTrainer.pokemon[j].pokeHP + " / " + enemyTrainer.pokemon[j].pokeTotalHP);
			
			//Player's turn
			
			player.pokemon[i].skillList(); // Print option to select 1~2 : Attack, 3~4 : Utilites
			System.out.println("5) Change pokemon");
			System.out.println("6) Surrender");
			System.out.println("====> ");
			while(true) {
				command = scan.nextInt();
				
				if(1 <= command || command <= 6) {
					break;
				}
				System.out.println("That's is not available command number.");
			}
			
			if(command <= 2) { // Use Attack Skill
				enemyTrainer.pokemon[j].Defense(player.pokemon[i].useAttackSkill(command, enemyTrainer.pokemon[j]));
			} else if (2 < command && command <= 4) { // Use Util Skill
				player.pokemon[i].useUtilSkill(command, enemyTrainer.pokemon[j]);
			} else if (command == 5) { // Change pokemon
				System.out.println("Select change pokemon");
				player.myPokemonList();
				i = select();
			} else if (command == 6) { // Surrend battle
				System.out.println("I lose battle with " + enemyTrainer.trainerName);
				break;
			}
			
			//Check Enemy's lose
			
			if(enemyTrainer.pokemon[j].pokeHP <= 0) { 
				int lose = 0;
				System.out.println(enemyTrainer.pokemon[j].pokeName + "be retired !");
				
				for(int k=0;k<enemyTrainer.pokeNum;k++) { // Check player have other pokemon
					if(enemyTrainer.pokemon[k].pokeHP <= 0) {
						lose++;
					}
				}
			
				if(lose == enemyTrainer.pokeNum) {
					System.out.println("I win the battle with " + enemyTrainer.trainerName + " !");
					break;
				} else {
					j++;
					System.out.println(enemyTrainer.trainerName + "filded " + enemyTrainer.pokemon[j].pokeName + " !");
				}
			} else {
				command = (int) (Math.random() * 4 + 1);
				
				if(command <= 2) { // Use Attack Skill
					player.pokemon[i].Defense(enemyTrainer.pokemon[j].useAttackSkill(command, player.pokemon[i]));
				} else if (2 < command && command <= 4) { // Use Util Skill
					enemyTrainer.pokemon[j].useUtilSkill(command, player.pokemon[i]);
				}
			}
			
			// Check player's lose
			
			if(player.pokemon[i].pokeHP <= 0) { 
				int lose = 0;
				System.out.println(player.pokemon[i].pokeName + "be retired !");
				
				for(int k=0;k<player.pokeNum;k++) { // Check player have other pokemon
					if(player.pokemon[k].pokeHP <= 0) {
						lose++;
					}
				}
			
				if(lose == player.pokeNum) {
					System.out.println("I losed the battle with " + enemyTrainer.trainerName + " ...");
					break;
				} else {
					System.out.println("Select next pokemon to battle");
					while(true) {
						player.myPokemonList();
						i = select();
						if(player.pokemon[i].pokeHP > 0) {
							break;
						} else {
							System.out.println("I can't filed a fallen pokemon !");
						}
					}
					System.out.println("I beleive you ! " + player.pokemon[i].pokeName + " !");
				}
			}
		}
		return player;
	}
}
