
public class Sorting3 {
	public static void main(String[] args) {
		
		String[] x = {"cool", "awesome", "bad", "fourt", "no"};
		String temp = x[0];
		for (int i=0; i<x.length; i++) {
			for (int j=i; j<x.length; j++) {
				temp = x[i];
				if (x[i].length()>x[j].length()) {
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		for (int i=0; i<x.length; i++) {
			System.out.println(x[i]);
		}
	}
}
