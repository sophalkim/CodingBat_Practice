import java.util.ArrayList;
import java.util.List;


public class wordsWithout2 {
	public static void main(String[] args) {
		String[] words = {"a", "b", "c", "a"};
		String target = "a";
		List<String> list = new ArrayList<String>();
		for (String i: words) {
			if(i!=target) {
				list.add(i);
			}
		}
		list.toArray(words);
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(words[i]);
		}
	}
}
