package anagramDemo;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;


public class AnagramDemo {
	
	static String readFile(String path, Charset encoding) 
			  throws IOException 
			{
			  byte[] encoded = Files.readAllBytes(Paths.get(path));
			  return new String(encoded, encoding);
	}
	
	static List<String> convertStringtoArrayList(String str) {
		String x = str.replaceAll("\\.", "");
		List<String> items = Arrays.asList(x.split("\\s*,\\s*"));
		return items;
	}
	
	static void printList(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
	
	static void start() throws IOException {
		Charset x = StandardCharsets.UTF_8;
		String y = readFile("raw/anagramlist.txt", x);
		List<String> list = convertStringtoArrayList(y);
		int index = 0;
		for (int i = 0; i < list.size(); i++) {
			String word1 = list.get(i).toString();
			for (int j = i + 1; j < list.size(); j++) {
				String word2 = list.get(j).toString();
				if (isAnagram(word1, word2)) {
					System.out.println(word1 + ", " + word2);
				}
			}
		}
	}
	
	private static boolean isAnagram(String str1, String str2) {
    
	    // If string lengths are not same, the strings are not anagrams.
	    if (str1.length() != str2.length()) {
	        return false;
	    }
	    
	    // Sort characters of both the strings.
	    str1 = sortCharacters(str1.toLowerCase());
	    str2 = sortCharacters(str2.toLowerCase());
	    
	    // After sorting if strings are equal then they are anagrams.
	    if (str1.equals(str2)) {
	        return true;
	    }
	    return false;
    }
	
	private static String sortCharacters(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return String.valueOf(charArray);
    }
	
	
	public static void main(String[] args) throws IOException {
		start();
	}
}
