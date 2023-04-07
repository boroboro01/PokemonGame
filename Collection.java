
import java.util.Scanner;

public class Collection {
	private static Collection instance = new Collection;
	private Collection() {};
	
	private Pokemon pokemon;
	Scanner scan = new Scanner(System.in);

	public static Collection getCollection() {
		if(instance==null) {
			instance = new Collection; //싱글톤 패턴 인스턴트가 하나만 만들어지고 하나만 쓰임
		}
		return instance;
	}
	
	public int run(Trainner t) {
		int destination = 5;
		int destination_code; 
		System.out.println("Where would you like to go?");
		System.out.println("0 : [mountain],  1 : [ocean],  2 : [desrt]");
		System.out.print("enter a Number >>");
		destitation_code = scan.nextInt();
		while (destination>0) {
			// destination_code*3 +3 으로 %연산, 난수 생성
			
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

