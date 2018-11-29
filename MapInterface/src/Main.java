import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> map = new HashMap<Integer,String>();
		Map<Integer,String> treeMap = new TreeMap<Integer,String>();
		Map<Integer,String> likedHashMap = new LinkedHashMap<Integer,String>();
		
		map.put(1, "Hola");
		map.put(1, "Mundo");
		
		Iterator<Integer> it = map.keySet().iterator();
		while (it.hasNext()) {
			Integer key = (Integer) it.next();
			System.out.println("Key " + key + " -> value: " + map.get(key));
		}
		
		treeMap.put(2, "Hello");
		treeMap.put(1, "World");
		
		Iterator<Integer> it2 = treeMap.keySet().iterator();
		while (it2.hasNext()) {
			Integer key = (Integer) it2.next();
			System.out.println("Key " + key + " -> value: " + treeMap.get(key));
		}
		 	
		likedHashMap.put(1, "Hello");
		likedHashMap.put(2, "World");
		
		Iterator<Integer> it3 = likedHashMap.keySet().iterator();
		while (it3.hasNext()) {
			Integer key = (Integer) it3.next();
			System.out.println("Key " + key + " -> value: " + likedHashMap.get(key));
		}
		

	}

}
