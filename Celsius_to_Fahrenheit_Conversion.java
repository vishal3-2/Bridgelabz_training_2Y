package Practice_Problems;

import java.util.Scanner;

public class Celsius_to_Fahrenheit_Conversion {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter temperature in celcius: ");
        double a=s.nextDouble();
        double b=(a*9/5) + 32;
        System.out.print("Temperature in Fahrenheit is :-"+b);
    }
}
