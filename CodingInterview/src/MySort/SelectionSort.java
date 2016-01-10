package MySort;

public class SelectionSort {
	public static int[] sort(int[] a){
		/*
		 * 선택 소트: 정렬되지 않은 부분에서 가장 작은 요소를 골라, 그것을 처음으로 이동 시킴
		 * */
		int n = a.length;
		
		for(int i = 0; i < n-1; i++){
			int lowest = i;
			int lowkey = a[i];
			for(int j = i+1; j < n; j++){
				if(a[j] < lowkey){
					lowest = j;
					lowkey = a[j];
				}
			}
			int temp = a[i];
			a[i] = a[lowest];
			a[lowest] = temp;
		}
		return a;
	}
}
