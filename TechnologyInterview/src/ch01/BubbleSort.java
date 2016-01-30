package ch01;

public class BubbleSort {
	public static int[] sort(int[] a){
		/*
		 * 버블 소트: 배열의 뒤에서부터 가장 처음 요소를 향해 스캔하다 인접한 두 요소의 대소관계가
		 * 반대라면 순서를 바꿔주는 것
		 * */
		int n = a.length;
		
		for(int i=0; i<n-1; i++){
			for(int j=n-1; j>i; j--){
				if(a[j-1] > a[j]){
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
		return a;
	}
}
