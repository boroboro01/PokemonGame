
import java.util.Random;
import java.util.Scanner;
import java.util.random;

public class Collection {
	private static Collection instance = new Collection;
	private Collection() {};
	pokemon p_list[]; // 포켓몬 배열
	
	Random ran = new Random();
	
	private Pokemon pokemon;
	Scanner scan = new Scanner(System.in);

	public static Collection getCollection() {
		if(instance==null) {
			instance = new Collection; //싱글톤 패턴 인스턴트가 하나만 만들어지고 하나만 쓰임
		}
		return instance;
	}
	
	public void select_act(Trainner t) {
		int a;
		System.out.println("========================================");
		System.out.println("choose what ot do");
		System.out.println("0 : [show my pokemon list] 1 : [go on a trip ]");
		System.out.println(">> ");
		
		a = scan.nextInt();
		
		if(a==0) {
			this.show_status(t);
		}
		else this.run(t);
	}
	
	
	public void show_status(Trainner t) {
		int a;
		t.showMypokemon;
		System.out.print("current battle pokemon : ");
		t.battle_p.printPokeInfo();
		
		System.out.println("Do you want to change your battle Pokemon?");
		System.out.println("enter (yes : 0, no : 1)>> ");
		a = scan.nextInt();
		
		if(a == 1) {
			a = -1;
			System.out.println("Choose a Pokemon Number to replace");
			for(int i=0;i<pokeNum;i++) {
				System.out.println(i+" : [ "+this.pokemon[i].pokeName+" ] "); // 0 : [포케몬 이름] 형식으로 출력
			}
			
			t.battle_p = t.pokemon[a];
			System.out.println("change battle pokomon to ["+t.pokemon[a].pokeName+"]");
			
		}
		
	}
	
	
	public int run(Trainner t) {
		int destination = 5;
		int destination_code; 
		System.out.println("Where would you like to go?");
		System.out.println("0 : [mountain],  1 : [ocean],  2 : [desrt]");
		System.out.print("enter a Number >>");
		destitation_code = scan.nextInt();
		
		
		while (destination>0) {
			int ranNum = ran.nextInt(3)+1;
			int sel;
			
			if(destination_code == 0) {
				System.out.print("riding the mountain");
			}
			else if(destination_code == 1) {
				System.out.print("walking on the beach");
			}
			else {
				System.out.print("walking in the desert");
			}
			
			for(int i=0; i<ranNum;i++) {
				
				System.out.print("...");
			}
			
			
			System.out.println("===========================================");
			System.out.println("A wild Pokemon has appeared!");
			
			while(true) {
				
				System.out.println("0 : [attack]  1 : [run]  2 : [open bag]");
				sel = scan.nextInt();
				
				if(sel == 0) { // 공격을 선택
					
				}
				
				else if(sel == 1) { // 도망가기 선택
					
				}
				
				else { // 가방 선택
					
				}
			
			}
			
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

