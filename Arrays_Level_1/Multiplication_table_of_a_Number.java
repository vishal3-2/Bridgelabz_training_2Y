package Arrays.Arrays_Level_1;

import java.util.Scanner;

public class Multiplication_table_of_a_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = sc.nextInt();

        int arr[] = new int[11];
        for (int i = 1; i < 11; i++) {
            arr[i] = number * i;
            System.out.println(number + " * " + i + " = " + arr[i]);
        }
    }
}
