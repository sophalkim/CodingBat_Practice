import java.util.Iterator;


public class If_then {
	public static void main(String[] args) {
		Iterator<String> y;
		int x = 10;
		try {
			if (x==10)
				System.out.println(x);
			System.out.println(7);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
}
