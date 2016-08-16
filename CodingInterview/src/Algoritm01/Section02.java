package Algoritm01;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by nick on 16. 8. 17.
 */
public class Section02 {
    // 0~9 사이 의 랜덤 한 수 맞추기
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int randomNum;
        int inputNum;
        int index = 0;

        // Generate Random number(0~9)
        randomNum = (r.nextInt(10));

        System.out.println("===Input Number Between 0 and 9===");

        for (;;) {
            System.out.println("----" + (index++) + "번 째 도전---");
            System.out.printf("###Input Number==> ");
            inputNum = s.nextInt();

            if(inputNum == randomNum){
                System.out.println("Correct Number!!!");
                break;
            }else if (inputNum > 9){
                System.out.println("Please Input Number Between 0 and 9!!!");
                index--;
            }else if (inputNum > randomNum){
                System.out.println(inputNum + " 보 다작습니다.");
            }else if (inputNum < randomNum){
                System.out.println(inputNum + " 보 다큽니다.");
            }

            System.out.println();
        }
    }
}
