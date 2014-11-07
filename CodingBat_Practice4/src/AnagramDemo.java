import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;


public class AnagramDemo {

	public static boolean array123(int[] nums) {
		int len = nums.length;
		for (int i = 0; i < len - 2; i++) {
			if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
				return true;
			}
		}
		return false;
	}
	
	static String readFile(String path, Charset encoding) 
			  throws IOException 
			{
			  byte[] encoded = Files.readAllBytes(Paths.get(path));
			  return new String(encoded, encoding);
	}
	
	static List<String> convertStringtoArrayList(String str) {
		List<String> items = Arrays.asList(str.split("\\s*,\\s*"));
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
		List<String> z = convertStringtoArrayList(y);
		printList(z);
	}
	
	
	public static void main(String[] args) throws IOException {
		start();
	}
}
