package MySort;

public class QuickSort1 {
	/*
	 * 퀵소트(재귀버전)
	 * 배열 a[1] ~ a[r]을 분활. 추축의 첨자 반환
	 * */
	private static int partition(int[] a, int l, int r){
		// 포인터 i와 j 초기화
		int i = l-1;
		int j = r;
		
		// 오른쪽 끝 요소를 주축으로 한다.
		int pivot = a[r];
		
		// 포인터 i와 j가 충동할 때까지 반복
		for(;;){
			while(a[++i] < pivot); // 포인터 i를 오른쪽으로 이동 시킨다.
			while(i < --j && pivot < a[j]); // 포인터 j를 왼쪽으로 이동 시킨다.
			
			// 포인터 i와 j가 충돌하면 루프를 빠져나간다
			if(i >= j) break;
			
			// i가 가리키는 요소와 j가 가리키는 요소를 교환
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			
		} // end for
		
		// a[i]와 추축을 교환한다.
		int temp = a[i];
		a[i] = a[r];
		a[r] = temp;
		
		return i;
	}
	
	/*
	 * 실제 퀵 소트 수행
	 * 배열 a에서 a[l] ~ a[r]을 정렬
	 * */
	private static int[] quickSort(int[] a, int l, int r){
		
		// 정렬할 요소가 하나라면 멈춤
		if(l >= r){
			return a;
		} 
		// 추축 v를 기준으로 분할
		int v = partition(a, l, r);
		
		quickSort(a, l, v-1); // 왼쪽 부분 배열 a[l] ~ a[v-1]을 정렬
		quickSort(a, v+1, r); // 오른쪽 부분 배열 a[v+1] ~ a[r]을 정렬
		
		return a;
	}
	
	public static int[] sort(int[] a){
		return quickSort(a, 0, a.length-1);
	}
}
