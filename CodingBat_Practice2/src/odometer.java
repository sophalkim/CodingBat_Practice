import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;


public class odometer {
	
	static ActionListener tp = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			System.out.println("cool");
		}
	};
	public static void main(String[] args) {
		int delay = 1000;
		new Timer(delay, tp).start();
	}

	
}
