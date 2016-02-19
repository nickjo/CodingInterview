package ch01;

import java.util.Random;
import java.util.Scanner;

public class Ex_2167 {

	public static void main(String[] args) {
		int n,m,k;
		String nm;
		String[] arrNM;
		int[][] intNM;
		int[][] intK;

		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		nm = s.nextLine();
		arrNM = nm.split("\\s");
		intNM = new int[Integer.parseInt(arrNM[0])][Integer.parseInt(arrNM[1])];
		
		// insert Random Integer into array
		for(int i=0; i < intNM.length; i++){
			for(int j=0; j < intNM[i].length; j++){
				intNM[i][j] = r.nextInt(300)+1;
			}
		} // end for
		
		for(int i=0; i < intNM.length; i++){
			System.out.println();
			for(int j=0; j < intNM[i].length; j++){
				System.out.print(intNM[i][j] + " ");
			}
		}// end for
		System.out.println();
		
		k = s.nextInt();
		
		// make k arr...[k][m] && insert Number
		intK = insertIntK(new int[k][4]);
		

		
		// print intK
		for(int i=0; i < intK.length; i++){
			System.out.println();
			for(int j=0; j < intK[i].length; j++){
				System.out.print(intK[i][j] + " ");
			}
		}// end for
	}
	
	// return between n1 and n2 Number
	public static int randomRange(int n1, int n2){
		return (int)(Math.random() * (n2-n1+1)) + n1;
	}
	
	// insert i,j,x,y (i<=x, j<=y)
	public static int[][] insertIntK(int[][] intK){
		
		return intK;
	}
}
