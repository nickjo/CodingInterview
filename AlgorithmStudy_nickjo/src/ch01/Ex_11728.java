package ch01;
import java.util.Arrays;
import java.util.Scanner;

public class Ex_11728 {
	public static void main(String[] args) {
		int arrA[];
		int arrB[];
		int j=0;
		String a,b,nm;
		String strarrNM[];
		String strarra[];
		String strarrb[];

		try {
			Scanner s = new Scanner(System.in);
			
			//BufferedReader  read = new BufferedReader(s);
			

			nm = s.nextLine();
			a = s.nextLine();
			b = s.nextLine();

			// 배열  A,B 사이즈 초기화
			strarrNM = nm.split("\\s");
			arrA = new int[Integer.parseInt(strarrNM[0])];
			arrB = new int[Integer.parseInt(strarrNM[1])];

			strarra= a.split("\\s");
			strarrb = b.split("\\s");

			// 배열 A 할당
			for(int i=0; i < strarra.length; i++){
				arrA[i] = Integer.parseInt(strarra[i]);
				j = i;
			}

			// 배열B 할당
			for(int i=0; i < strarrb.length; i++){
				arrB[i] = Integer.parseInt(strarrb[i]);
			}

			for(int i=0; i < arrB.length; i++){
				if(arrB[i] == 0) break;
				arrA[++j] = arrB[i];
			}
			
			Arrays.sort(arrA);
			
			System.out.println();
			for(int t:arrA) {
				if(t != 0) 
				System.out.print(t + " ");
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
