package MySearch;

// 이진 탐색
public class BinarySearch {
	int retrunIndex;
	public static int binarySearch(int[] a, int inputNum){
		int pivot = (a.length-1)/2;
		int left = 0;
		int right= a.length-1;
		int count = 0;
		for(;;){
			// 값을 찾은 경우 해당 인덱스 반환
			if(inputNum == a[pivot]){
				return pivot;
			}else if(pivot <= 0){ // 값을 찾을수 없음(수정필요...동작안함...)
				return -1;
			}else if(inputNum > a[pivot]){
				// 피봇+1에서 배열의 마지막 행까지의 배열 중 새로운 피봇 정의
				System.out.println("inputNum Up");
				System.out.println("left: " + left + ", right: " + right + ", pivot: " + pivot + ", pivotValue: " + a[pivot]);
				left = pivot+1;
				pivot = ((right) + (pivot+1))/2;
			}else if(inputNum < a[pivot]){
				// 현재 피봇-1의 중간을 새로운 피봇으로 지정
				System.out.println("inputNum Down");
				System.out.println("left: " + left + ", right: " + right + ", pivot: " + pivot + ", pivotValue: " + a[pivot]);
				right = pivot-1;
				pivot = (left + (pivot-1))/2;
			}
			System.out.println();
			
			// 무한 루프 방지
			if(count > a.length-1){
				return -1;
			}
			count++;
		}
	}
}
