package acmicpc;

import java.util.Random;

public class Ex_10946 {

	/*@ 문제
	 * 1부터 2,147,483,647까지 수 중에 하나를 출력한다. 
	 * 이 숫자가 채점 프로그램이 랜덤으로 얻은 수와 같으면 이 문제를 맞출 수 있다. 
	 * 채점 프로그램은 채점을 할 때마다 랜덤을 수행한다.
	        이 문제의 점수는 MAX(0, 100 - (채점 프로그램이 랜덤으로 얻은 수와의 차이)0.25))점 이다.
    *@ 입력
	* 이 문제는 입력이 없다.
	* @출력
	* 첫째 줄에 1부터 2,147,483,647까지 수 중에 하나를 출력한다. 
	 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int a = 0;
		
		a = random.nextInt(10)+1;
		//System.out.println(a);
	}
}
