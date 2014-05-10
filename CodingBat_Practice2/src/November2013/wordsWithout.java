package November2013;


public class wordsWithout {

	public static String[] wordsWithout(String[] words, String target) {
		  int count = 0;
		  for (int i = 0; i < words.length; i++) {
			  if (words[i].equals(target)) {
				  count++;
			  }
		  }
		  int size = words.length - count;
		  String[] x = new String[size];
		  int y = 0;
		  for (int i = 0; i < words.length; i++) {
			  if (!words[i].equals(target)) {
				  x[y] = words[i];
				  y++;
			  }
		  }
		  return x;
		}
	
	public static void main(String[] args) {
		
		String[] words = {"a", "b", "c", "a"};
		String target = "a";
		System.out.println(wordsWithout(words, target).length);
	}
}
