
public class starOutArray {
	public static void main(String[] args) {
		String str = "sm***eil*ly";
		String[] x = new String[str.length()];
		for (int i=0; i<str.length(); i++) {
			x[i] = str.substring(i, i+1);
		}
		
		String[] y = new String[x.length];
		int count = 0;
		for (int i=0; i<x.length; i++) {
			if (x[i].equals("*")) {
				count++;
			}
		}
		
		
		
		/*for (int i=0; i<x.length; i++) {
			System.out.println(x[i]);
		}*/
	}
}
