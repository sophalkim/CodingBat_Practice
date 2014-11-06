import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;


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
	
	
	public static void main(String[] args) {
		int[] nums = {1, 1, 2, 4, 1};
		Charset x = Charset.defaultCharset();
		try {
			System.out.println(readFile("anagramlist.txt", x));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
