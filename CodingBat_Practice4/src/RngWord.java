import java.util.Random;

public class RngWord {
	
	public static String RngWord() {
		Random r = new Random();
		String[] x = {"cool", "awesome", "neat", "rad"};
		return x[r.nextInt(4)];
	}

	public static void main(String[] args) {
		System.out.println(RngWord());
	}
}

