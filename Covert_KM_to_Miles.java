package Practice_Problems;

import java.util.Scanner;

public class Covert_KM_to_Miles {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter distance in Kilometer: ");
        double KM=s.nextDouble();
        double Miles=KM*0.621371;
        System.out.println("Kilometers tp Miles conversion will be :- " +Miles);
    }
}
