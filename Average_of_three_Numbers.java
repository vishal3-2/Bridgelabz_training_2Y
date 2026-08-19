package Practice_Problems;

import java.util.Scanner;

public class Average_of_three_Numbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=s.nextInt();
        System.out.println("Eneter second number: ");
        int b=s.nextInt();
        System.out.println("Enter third number: 1");
        int c=s.nextInt();
        double average=(a+b+c)/3;
        System.out.println("Average of three numbers will be :-"+average);

    }
}
