package Arrays.Arrays_Level_1;

import java.util.Scanner;

public class Student_can_vote_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers of student:- ");
        int n= sc.nextInt();
        if(n<=0){
            System.out.println("Invalid input :");
        }else {
            int arr[] = new int[n];
            System.out.println("Enter the age of n students:- ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                if (arr[j] < 0) {
                    System.out.println("Invalid Age: " + arr[j]);
                } else if (arr[j] >= 0 && arr[j] < 18) {
                    System.out.println("Student with age " + arr[j] + " cannot vote.");
                } else {
                    System.out.println("Student with age " + arr[j] + " can vote.");
                }
            }
        }
    }
}
