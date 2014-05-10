import java.util.ArrayList;


public class wordsWithoutList {
	public static void main(String[] args) {
		String[] words = {"a", "bb", "b", "ccc"};
		int len = 1;
		int count = 0;
		for (int i=0; i<words.length; i++) {
			if (words[i].length()!=len) count++;
		}
		String[] x = new String[count];
		int index = 0;
		for (int i=0; i<words.length; i++) {
			if (words[i].length()!=len) {
				x[index] = words[i];
				index++;
			}
		}
		for (int i=0; i<x.length; i++) {
			System.out.println(x[i]);
		}
		ArrayList<String[]> y = null;
		y.add(0, x);
		
	}
}
