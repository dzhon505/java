package day2;

import java.util.Scanner;

// Реализовать программу №2, используя цикл while.
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (a < b){
            if (a % 5 == 0 && a % 10 != 0){
                System.out.print(a+" ");

            }
            a++;
        }

    }
}
