package MySort;

public class SelectionSort {
	public static int[] sort(int[] a){
		/*
		 * ���� ��Ʈ: ���ĵ��� ���� �κп��� ���� ���� ��Ҹ� ���, �װ��� ó������ �̵� ��Ŵ
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
