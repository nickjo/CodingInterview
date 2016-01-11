package MySort;

public class QuickSort1 {
	/*
	 * ����Ʈ(��͹���)
	 * �迭 a[1] ~ a[r]�� ��Ȱ. ������ ÷�� ��ȯ
	 * */
	private static int partition(int[] a, int l, int r){
		// ������ i�� j �ʱ�ȭ
		int i = l-1;
		int j = r;
		
		// ������ �� ��Ҹ� �������� �Ѵ�.
		int pivot = a[r];
		
		// ������ i�� j�� �浿�� ������ �ݺ�
		for(;;){
			while(a[++i] < pivot); // ������ i�� ���������� �̵� ��Ų��.
			while(i < --j && pivot < a[j]); // ������ j�� �������� �̵� ��Ų��.
			
			// ������ i�� j�� �浹�ϸ� ������ ����������
			if(i >= j) break;
			
			// i�� ����Ű�� ��ҿ� j�� ����Ű�� ��Ҹ� ��ȯ
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			
		} // end for
		
		// a[i]�� ������ ��ȯ�Ѵ�.
		int temp = a[i];
		a[i] = a[r];
		a[r] = temp;
		
		return i;
	}
	
	/*
	 * ���� �� ��Ʈ ����
	 * �迭 a���� a[l] ~ a[r]�� ����
	 * */
	private static int[] quickSort(int[] a, int l, int r){
		
		// ������ ��Ұ� �ϳ���� ����
		if(l >= r){
			return a;
		} 
		// ���� v�� �������� ����
		int v = partition(a, l, r);
		
		quickSort(a, l, v-1); // ���� �κ� �迭 a[l] ~ a[v-1]�� ����
		quickSort(a, v+1, r); // ������ �κ� �迭 a[v+1] ~ a[r]�� ����
		
		return a;
	}
	
	public static int[] sort(int[] a){
		return quickSort(a, 0, a.length-1);
	}
}
