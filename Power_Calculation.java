package Practice_Problems;

import java.util.Scanner;


public class Power_Calculation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter base: ");
        double base=s.nextDouble();
        System.out.println("Enter exponent: ");
        int exponent=s.nextInt();
        double result=Math.pow(base,exponent);
        System.out.println("Output will be :-"+result);
    }
}
