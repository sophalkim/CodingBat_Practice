
public class MakeBricksNoLoops {
	
	public boolean makeBricks(int small, int big, int goal) {
		  int s = small * 1;
		    int b = big * 5;
		    if (s + b == goal) return true;
		    if (s + b < goal) return false;
		    if (b == goal) return true;
		    if (s == goal) return true;
		    if ( (big - 1) * 5 + s == goal) return true;
		    if (goal % 5 <= small) return true;
		    return false;
		}
}
