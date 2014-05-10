
public class getSandwich {
	public static void main(String[] args) {
		String x = "breadbreadbreadbread";
		int first = x.indexOf("bread");
		int last = x.lastIndexOf("bread");
		int z = first+5;
		char w = x.charAt(z);
		
		System.out.println(x.substring(z, last));
	}

}
