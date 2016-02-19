package ch01;
import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Ex_11728 {
	public static void main(String[] args) {
		long arrA[] = null;
		long arrB[] = null;
		long arrAT[] = null;
		long arrBT[] = null;
		long arrResult[] = null;
		String aa = "";
		String bb = "";
		List resultArr = new ArrayList();
		int aIndex=0,bIndex=0,nmIndex=0;
		int check = 1;
		int MAX_ARRAY_SIZE = 1000000;
		
		try {
			/*
			Scanner s = new Scanner(System.in);
			
			while(s.hasNextLine()){				
				String line = s.nextLine();
				Scanner s1 = new Scanner(line).useDelimiter(" ");
				
				while(s1.hasNextInt()){
					//System.out.print(s1.nextInt() + " ");
					switch (check) {
					case 1:
						if((nmIndex++) == 0) arrA = new long[s1.nextInt()];
						else arrB = new long[s1.nextInt()];
						break;
					case 2:		
						arrA[aIndex++] = s1.nextInt();
						break;
					case 3:
						arrB[bIndex++] = s1.nextInt();
						break;
					default:
						break;
					}
				}				
				check++;
				if((check) > 3) break;
			} // end while
			
			arrAT = new long[aIndex];
			arrBT = new long[bIndex];
			
			System.arraycopy(arrA, 0, arrAT, 0, arrAT.length);
			System.arraycopy(arrB, 0, arrBT, 0, arrBT.length);
			
			for(int i=0; i<aIndex; i++){
				arrAT[i] = arrA[i];
			}
			for(int i=0; i<bIndex; i++){
				arrBT[i] = arrB[i];
			}
			
			Arrays.sort(arrAT);
			Arrays.sort(arrBT);
			
			arrResult = new long[(aIndex+bIndex)];
			
			System.arraycopy(arrAT, 0, arrResult, 0, arrAT.length);
			System.arraycopy(arrBT, 0, arrResult, arrAT.length, arrBT.length);
			
			Arrays.sort(arrResult);*/
			
			arrAT = new long[MAX_ARRAY_SIZE];
			arrBT = new long[MAX_ARRAY_SIZE];
			
			for(int i=0; i<MAX_ARRAY_SIZE-1; i++){
				arrAT[i] = (i+1);
				arrBT[i] = (i+1);
			}
			
			Arrays.sort(arrAT);
			Arrays.sort(arrBT);
			
			arrResult = new long[(MAX_ARRAY_SIZE*2)];
			
			System.arraycopy(arrAT, 0, arrResult, 0, arrAT.length);
			System.arraycopy(arrBT, 0, arrResult, arrAT.length, arrBT.length);
			
			Arrays.sort(arrResult);
			
			

			//for(long temp: arrResult) System.out.println(temp);
			
			//System.out.println(Arrays.toString(arrResult));
			
			Collections.addAll(resultArr, arrAT);
			
			//Collections.sort(resultArr);
			
			//Iterator it = Arrays.asList(arrResult).iterator();
			
			Iterator it = resultArr.iterator();
			
			while (it.hasNext()){
				//Object temp = it.next();
				System.out.println(it.next());
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
