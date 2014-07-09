
public class StartOz {

	public static String startOz(String str) {
		int len = str.length();
		String x = "";
		if (len >= 1 && str.substring(0, 1).equals("o")) {
			x = x + "o";
		}
		if (len >= 2 && str.substring(1, 2).equals("z")) {
			x = x + "z";
		}
		return x;	
	}
	
	
	public static void main(String[] args) {
		String str = "ozymandias";
		System.out.println(startOz(str));
	}
}
