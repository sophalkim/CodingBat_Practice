
public class Sorting {
	public static int[] sort(int[] data) {
		int lenD = data.length;
		int j = 0;
		int tmp = 0;
		for (int i=0; i<lenD; i++) {
			j=i;
			for (int k=i; k<lenD; k++) {
				if(data[j]<data[k]) {
					j=k;
				}
			}
			tmp = data[i];
			data[i] =data[j];
			data[j] = tmp;
		}
		return data;
	}
	
	public static void main(String[] args) {
		int[] x = {2,5,1};
		int[] y = sort(x);
		for (int i=0; i<x.length; i++) {
			System.out.println(y[i]);
		}
	}
	
}
