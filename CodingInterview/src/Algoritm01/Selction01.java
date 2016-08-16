package Algoritm01;

import java.util.Scanner;

/**
 * Created by nick on 16. 8. 15.
 */
public class Selction01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("======a: Decimal, b: Hex======");
        for (;;){
            String input1 = s.nextLine();

            if(input1.equals("a")){ // Decimal
                System.out.println("Decimal Number");
                System.out.println(s.nextInt());
                break;
            }else if (input1.equals("b")){ // Hex
                System.out.println("Hex Number");
                System.out.println(Integer.toHexString(s.nextInt()));
                break;
            }else{
                System.out.println("Wrong Input!!!");
            }
        }
    }
}
