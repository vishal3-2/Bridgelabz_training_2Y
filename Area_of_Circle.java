package Practice_Problems;

import java.util.Scanner;

public class Area_of_Circle {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter radius: ");
        double r=s.nextDouble();
        double area=Math.PI *r*r;
        System.out.print("Area of the Circle is :- "+area);
    }
}

