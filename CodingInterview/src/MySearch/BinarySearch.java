package MySearch;

// ���� Ž��
public class BinarySearch {
	int retrunIndex;
	public static int binarySearch(int[] a, int inputNum){
		int pivot = (a.length-1)/2;
		int left = 0;
		int right= a.length-1;
		int count = 0;
		for(;;){
			// ���� ã�� ��� �ش� �ε��� ��ȯ
			if(inputNum == a[pivot]){
				return pivot;
			}else if(pivot <= 0){ // ���� ã���� ����(�����ʿ�...���۾���...)
				return -1;
			}else if(inputNum > a[pivot]){
				// �Ǻ�+1���� �迭�� ������ ������� �迭 �� ���ο� �Ǻ� ����
				System.out.println("inputNum Up");
				System.out.println("left: " + left + ", right: " + right + ", pivot: " + pivot + ", pivotValue: " + a[pivot]);
				left = pivot+1;
				pivot = ((right) + (pivot+1))/2;
			}else if(inputNum < a[pivot]){
				// ���� �Ǻ�-1�� �߰��� ���ο� �Ǻ����� ����
				System.out.println("inputNum Down");
				System.out.println("left: " + left + ", right: " + right + ", pivot: " + pivot + ", pivotValue: " + a[pivot]);
				right = pivot-1;
				pivot = (left + (pivot-1))/2;
			}
			System.out.println();
			
			// ���� ���� ����
			if(count > a.length-1){
				return -1;
			}
			count++;
		}
	}
}
