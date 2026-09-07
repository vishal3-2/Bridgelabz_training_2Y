package Arrays.Arrays_Level_1;

import java.util.Scanner;

public class Sum_of_Elements_in_an_Array_with_Conditional_Break {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array:- ");
        int n=sc.nextInt();
        if(n<=0){
            System.out.println("Invalid input :");
        }else {
            double arr[]=new double[n];
            System.out.println("Enter elements of Array:- ");
            double sum=0.0;
            int i=0;
            while(true){
                if (i==n){
                    System.out.println("Array is full:- ");
                    break;
                }
                arr[i]=sc.nextDouble();
                if (arr[i]<=0) {
                    System.out.println("Terminated because of invalid input: ");
                    break;
                }
                i++;
            }
            for(int j=0;j<i;j++){
                sum=sum+arr[j];
            }
            System.out.println("The total value of entered numbers is: "+sum);

        }
    }
}
