package Arrays.Arrays_Level_1;

import java.util.Scanner;

public class Positive_Negative_or_Zero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the Array:- ");
        int n=sc.nextInt();
        if(n<=0){
            System.out.println("Invalid input :");
        }else {
            int[] arr = new int[n];
            System.out.println("Enter elements of Array:- ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                if (arr[j] > 0) {
                    if (arr[j] % 2 == 0) {
                        System.out.println("Number " + arr[j] + " is Positive and Even.");
                    } else {
                        System.out.println("Number " + arr[j] + " is Positive but Odd.");
                    }
                } else if (arr[j] < 0) {
                    System.out.println("Number " + arr[j] + " is Negative.");
                } else {
                    System.out.println("This number is Zero.");
                }
            }
        }
    }
}
