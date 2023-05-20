import java.util.HashMap;
import java.util.Iterator;


public class HashMap {
	private HashMap<Integer, Pokemon> hashMap;
	
	public HashMap() {
		hashMap = new HashMap<Integer, Pokemon>();
	}
	
	public void addPokemon(Pokemon p) {
		hashMap.put(p.getDetCode, p);
	}
	
	public Pokemon getPokemon(int det) {
		
		if(hashMap.containsKey(det)) {
			return hashMap.get(det);
		}
		else return null;
		
	}
}
