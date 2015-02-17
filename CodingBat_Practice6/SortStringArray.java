import java.util.LinkedList;


public class SortStringArray {
  
	public LinkedList<String> sort(String[] words) {
	    String temp = "";
	    for (int i = 1; i < words.length; i++) {
	      for (int j = i; j > 0; j--) {
	        if (words[j].compareTo(words[j - 1]) < 0) {
	          temp = words[j];
	          words[j] = words[j - 1];
	          words[j - 1] = temp;
	        }
	      }
	    }
	    
	    
	    // Add words to List
	    LinkedList<String> list = new LinkedList<String>();
	    for (String word : words) {
	      list.add(word);
	    }
	    return list;
	  }
	  
	  public static void main(String[] args) {
	    String[] words = { "cool", "amazing", "awesome", "rad", "neat" };
	    SortStringArray s = new SortStringArray();
	    System.out.println(s.sort(words));
	  }
  
}
