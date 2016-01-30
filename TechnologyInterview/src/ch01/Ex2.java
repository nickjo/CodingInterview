package ch01;

import java.util.ArrayList;

public class Ex2 {
	public static void main(String[] args) {
		String encryptionCode = 
				"MNACBRUTSRVUTSY^]\\[Z &%$#\"!MTSRQPONEMLKJIHGF";
		
		ArrayList<String> decodingCode = new ArrayList<String>();
		int k = 0; // get할 배열의 index
		int count = 1;
		String resultStr = "";
		
		// K + (countt++);
		
		// 문자열을 배열에 저장
		for(int i=0; i < encryptionCode.length(); i++){
			decodingCode.add(encryptionCode.charAt(i)+"");
		}
		
		for(int i=0; i < decodingCode.size(); i++){
			// get할 문자 index계산
			if(count != 1) k = k+count;
			// get할 index가 배열의 size이상일때 반복문 정지
			if(k >= decodingCode.size()) break;
			
			resultStr += decodingCode.get(k);
			count++;
		}
		System.out.println(resultStr);
	}
}
