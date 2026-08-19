package Practice_Problems;

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Principle amount: ");
        double p=s.nextInt();
        System.out.println("Enter rate of interest: ");
        int r=s.nextInt();
        System.out.println("Enter time: ");
        int t=s.nextInt();
        double SI=(p*r*t)/100;
        System.out.println("Total interest will be :- "+SI);
    }
}
