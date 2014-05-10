
public class xyzMiddle {
	public static void main(String[] args) {
		String str = "xyzxyzAxyzBxyzxyz";
		int index = str.indexOf("xyz", str.length()/2-2);
		
		int rhs = str.length()-index-3;
		// System.out.println(index);
		String x = str.replace("x", "");
		System.out.println(x);
	}
}
