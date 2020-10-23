package Prog1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class prog1{
public static void main(String[] args) {


    try {
        System.out.println("Введите целое число");
        Scanner d=new Scanner(System.in);

        long num=d.nextLong();

        long reversed =0;

        while (num != 0) {
            long gg = num % 10;
            reversed = reversed * 10 + gg;
            num /= 10;
        }
        System.out.println("Число в перевернутом виде выглядит так : " + reversed);

    }
    catch(InputMismatchException e){
        System.out.println("Вы ввели не число");
    }
}
}