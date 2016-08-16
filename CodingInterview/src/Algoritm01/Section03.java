package Algoritm01;

import java.util.Scanner;

/**
 * Created by nick on 16. 8. 17.
 */
public class Section03 {
    // 두수 의 최대공약수
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int inputNum1, inputNum2;
        int num;
        int max = 0;

        System.out.println("====Input Two Numbers===");

        System.out.printf("Number One==>");
        inputNum1 = s.nextInt();
        System.out.println();

        System.out.printf("Number Two==>");
        inputNum2 = s.nextInt();
        System.out.println();

        if (inputNum1 > inputNum2) {
            num = inputNum1;
        }else {
            num = inputNum2;
        }

        for (int i = 1; i <= num ; i++) {
            if((inputNum1 % i == 0) && (inputNum2 % i == 0)){
                max = i;
            }

            if((inputNum1 == i) || (inputNum2 == i)){
                System.out.println("Number One: " + inputNum1 + ", Number Two: " + inputNum2);
                System.out.println("두수 의최 대공약수: " + max);
                break;
            }
        }
    }
}
