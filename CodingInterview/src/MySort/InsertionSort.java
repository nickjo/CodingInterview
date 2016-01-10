package MySort;

public class InsertionSort {
	public static int[] sort(int[] a){
		/*
		 * ���� ��Ʈ: �迭�� �Ϻκ��� ���Ľ����ְ�, ���� ��Ҹ� �ϳ��� ������ ��ġ�� ������ ���� ���� �˰���
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
