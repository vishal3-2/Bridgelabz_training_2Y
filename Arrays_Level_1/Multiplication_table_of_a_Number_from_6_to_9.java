package Arrays.Arrays_Level_1;

import java.util.Scanner;

public class Multiplication_table_of_a_Number_from_6_to_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:- ");
        int number= sc.nextInt();
        int arr[] = new int[4];
        int index = 0;
        for (int i = 6; i < 10; i++) {
            arr[index] = number * i;
            System.out.println(number + " * " + i + " = " + arr[index]);
            index++;
        }
    }
}
