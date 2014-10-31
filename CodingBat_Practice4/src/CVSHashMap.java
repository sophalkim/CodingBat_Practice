import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class CVSHashMap {

	
	public static void main(String[] args) {
		CVSHashMap cv = new CVSHashMap();
		cv.run();
	}
	
	public void run() {
		String csvFile = "c:\file.txt";
		BufferedReader br = null;
		String line = "";
		String comma = ",";
		
		try {
			Map<String, String> maps = new HashMap<String, String>();
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
				String[] country = line.split(comma);
				maps.put(country[4], country[5]);
			}
			
			for (Map.Entry<String, String> entry : maps.entrySet()) {
				System.out.println("Country [code= " + entry.getKey() + ", name=" + entry.getValue() + "]");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("Done");
	}
}
