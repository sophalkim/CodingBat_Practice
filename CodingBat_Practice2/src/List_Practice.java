import java.util.ArrayList;
import java.util.List;


public class List_Practice {
	public static void main(String[] args) {
		String[] words = {"Awesome", "Cool", "Rad"};
		int[] x = {4,6,8,2,45,2,4,8};
		List list = new ArrayList();
		for (String i: words) {
			list.add(i);
		}
		for (int i: x) {
			list.add(i);
		}
		List list_2 = list.subList(2, list.size());
		System.out.println(list_2.toString());
	}
}
