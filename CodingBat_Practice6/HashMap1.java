import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class HashMap1 {

	// Take the array and create a new hashmap
	public HashMap<Integer, String> arrayToMap(String[] words) {
		int len = words.length;
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		for (int i = 0; i < len; i++) {
			map.put(i, words[i]);
		}
		return map;
	}
	
	
	public static void main(String[] args) {
		
		String[] words = { "cool", "awesome", "neat", "amazing", "great" };
		ArrayList<String> list = new ArrayList<String>();
		for (int i = words.length - 1; i >= 0; i--) {
			list.add(words[i]);
		}
//		for (String x : list) {
//			System.out.println("word:" + x);
//		}
		
		HashMap1 hm = new HashMap1();
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1 = hm.arrayToMap(words);
		
		// Old style iteration
//		Iterator i = map1.entrySet().iterator();
//		while(i.hasNext()) {
//			Map.Entry me = (Map.Entry) i.next();
//			System.out.print(me.getKey() + ": ");
//			System.out.println(me.getValue());
//		}
		
		// Compact Iteration for Keys
//		for (Integer key : map1.keySet()) {
//			System.out.println("key:" + key);
//		}
		
		// Compact Iteration for Values
//		for (String word : map1.values()) {
//			System.out.println("value:" + word);
//		}
		
		// Compact Iteration for Both
		for (Map.Entry<Integer, String> entry : map1.entrySet()) {
			Integer key = entry.getKey();
			String word = entry.getValue();
			System.out.println("key:" + key + "  value:" + word);
		}
		
		String x = "cool";
		int hash = x.hashCode();
		String y = "cool";
		int hash2 = y.hashCode();
		System.out.println("hash1:" + hash + " , hash2:" + hash2);
	}
}
