package MySort;

public class MergeSortArray {
	/*
	 * �迭�� ���� ��Ʈ�Ѵ�.
	 * a[low] ~ a[high] ��Ҹ� ����
	 * */
	
	private static void mergeSortArray(int[] a,int low,int high){
		// ���� ��Ұ� �ϳ����̶�� �ٷ� ���ư�
		if(low >= high){
			return;
		}
		
		// ���� 2���� ������ ��� mid�� ���Ѵ�.
		int mid = (low+high)/2;
		
		// ���� �� ��� a[low] ~ a[mid]�� �����Ѵ�
		mergeSortArray(a, low, mid);
		
		// ���� �� ��� a[mid+1] ~ a[high]�� �����Ѵ�.
		mergeSortArray(a, mid+1, high);
		
		// ���� �� ��Ҹ� �״�� �۾��� �迭 b�� �����Ѵ�.
		int[] b = new int[a.length];
		for(int i = low; i <= mid; i++){
			b[i] = a[i];
		}
		
		// ���� �� ��Ҹ� �ݴ� ������ �۾��� �迭 b�� �����Ѵ�
		for(int i = mid+1, j = high; i <= high; i++,j--){
			b[i] = a[j];
		}
		
		// �۾��� �迭 b�� �糡���� ���� �����͸� �����Ͽ� �迭 a�� �ִ´�
		int i = low;
		int j = high;
		for(int k = low; k <= high; k++){
			if(b[i] <= b[j]){
				a[k] = b[i++];
			}else{
				a[k] = b[j--];
			}
		}
	}
	
	public static void sort(int[] a){
		mergeSortArray(a, 0, a.length-1);
	}
}
