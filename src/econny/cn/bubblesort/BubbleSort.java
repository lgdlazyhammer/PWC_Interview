package econny.cn.bubblesort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = { 6, 2, 4, 1, 5, 9 };
        bubble_sort(x);
        
        System.out.println(x.toString());
        for(int k=0;k<x.length;k++){
        	System.out.print(x[k]);
        }
	}

	static void bubble_sort(int[] unsorted) {
		for (int i = 0; i < unsorted.length; i++) {
			for (int j = 0; j < unsorted.length - (i+1); j++) {
				if (unsorted[j] > unsorted[j + 1]) {
					int temp = unsorted[j];
					unsorted[j] = unsorted[j + 1];
					unsorted[j + 1] = temp;
				}
			}
		}
	}

}
