package MySort;

public class InsertionSort {
	public static int[] sort(int[] a){
		/*
		 * 삽입 소트: 배열의 일부분을 정렬시켜주고, 남은 요소를 하나씩 적절한 위치에 삽입해 가는 정렬 알고리즘
		 * */
		int n = a.length;
		
		for(int i = 1; i < n; i++){
			int j = i;
			while(j >= 1 && a[j-1] > a[j]){
				int temp = a[j];
				a[j] = a[j-1];
				a[j-1] = temp;
				j--;
			}
		}
		return a;
	}
}
