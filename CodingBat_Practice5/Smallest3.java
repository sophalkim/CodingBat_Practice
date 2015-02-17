import java.util.LinkedList;


public class Smallest3 {

	public static void main(String[] args) {
		int[] x = {9, 5, 1, 4, 13, 6};
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < x.length; i++) {
			list.add(x[i]);
		}
		int[] smallest = new int[3];
		int min = x[0];
		int index = 0;
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < list.size(); i++) {
				if (min > list.get(i)) {
					min = list.get(i);
					index = i;
				}
			}
			smallest[j] = min;
			list.remove(index);
			min = x[0];
		}
		System.out.println(list);
		for (int i = 0; i < smallest.length; i++) {
			System.out.println(smallest[i]);
		}
	}
}
