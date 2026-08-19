package Practice_Problems;

import java.util.Scanner;

public class Volume_of_Cylinder {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter radius: ");
        double r=s.nextDouble();
        System.out.println("Enter height: ");
        double h=s.nextDouble();
        double Volume=Math.PI*r*r*h;
        System.out.print("Volume of a Cylinder is :- "+Volume);
    }
}
