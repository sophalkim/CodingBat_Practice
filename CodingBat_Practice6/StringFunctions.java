
public class StringFunctions {

	public static class Utils {
		
		static String x = "";
		
		public static String get() {
			return x;
		}
		
		public static void set(String str) {
			x = str;
		}
		
		public static void add(String str) {
			x += str;
		}
		
		public static void remove(String str) {
			int len = x.length();
			int lenS = str.length();
			String temp = x;
			x = "";
			for (int i = 0; i < len; i++) {
				if (i + lenS <= len && temp.substring(i, i + lenS).equals(str)) {
					i += lenS - 1;
					continue;
				}
				x += temp.charAt(i);
			}
		}
	}
	
	public static void main(String[] args) {
		Utils.set("cool");
		Utils.add("neato");
		Utils.remove("o");
		Utils.add("amazing");
		Utils.remove("a");
		System.out.println(Utils.get());
	}
	
}
