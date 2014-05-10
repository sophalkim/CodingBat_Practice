
public class wordsWithout {
	public static void main(String[] args) {
		String[] words = {"a", "b", "c", "a"};
		String target = "a";
		int count = 0;
		for (int i=0; i<words.length; i++) {
			if (words[i].equals(target)) count++;
		}
		String[] x = new String[words.length-count];
		int index = 0;
		for (int i=0; i<words.length; i++) {
			if (!words[i].equals(target)) {
				x[index]=words[i];
				index++;
			}
		}
		for (int i=0; i<x.length; i++) {
			System.out.println(x[i]);
		}
	}
}
