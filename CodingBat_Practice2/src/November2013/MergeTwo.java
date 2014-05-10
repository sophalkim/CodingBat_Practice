package November2013;



public class MergeTwo {

	public static String[] mergeTwo(String[] a, String[] b, int n) {
		String[] x = a;
		int counter = 0;
		int bcounter = 0;
		for (int i = 0; i < n; i++) {
			if (numericValue(x[counter]) > numericValue(a[i])) {
				x[counter] = a[i];
			}
			for (int j = bcounter; j < n; j++) {
				if (numericValue(x[counter]) > numericValue(b[j])) {
					x[counter] = b[j];
					bcounter++;
				}
			}
			counter++;
		}
		return x;
	}
	
	public static int numericValue(String letter) {
		switch(letter) {
		case "a": return 1;
		case "b": return 2;
		case "c": return 3;
		case "d": return 4;
		case "e": return 5;
		case "f": return 6;
		case "g": return 7;
		case "h": return 8;
		case "i": return 9;
		case "j": return 10;
		case "k": return 11;
		case "l": return 12;
		case "m": return 13;
		case "n": return 14;
		case "o": return 15;
		case "p": return 16;
		case "q": return 17;
		case "r": return 18;
		case "s": return 19;
		case "t": return 20;
		case "u": return 21;
		case "v": return 22;
		case "w": return 23;
		case "x": return 24;
		case "y": return 25;
		case "z": return 26;
		}
		return 0;
	}
	
	
	public static void main(String[] args) {
		
		String[] a = {"a", "c", "z"};
		String[] b = {"b", "f", "z"};
		int n = 3;
		for (int i = 0; i < n; i++) {
			System.out.println(mergeTwo(a, b, n)[i]);
		}
	}
}
