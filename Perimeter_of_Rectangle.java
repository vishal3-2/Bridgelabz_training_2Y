package Practice_Problems;

import java.util.Scanner;

public class Perimeter_of_Rectangle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter length: ");
        double l=s.nextDouble();
        System.out.println("Enter breadth: ");
        double b=s.nextDouble();
        double Perimeter=2*(l+b);
        System.out.println("Perimeter of Rectangle :- "+Perimeter);
    }
}
