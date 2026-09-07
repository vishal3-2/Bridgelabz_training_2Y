package Arrays.Arrays_Level_1;

import java.util.Scanner;

public class Natural_Number_Array_Separator_Odd_and_Even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Natural number: ");
        int n=sc.nextInt();
        int size=(n/2)+1;
        if(n<=0){
            System.out.println("Invalid Input");
            System.out.println("The input must be a Natural Number: ");
        }else {

            int arr1[]=new int[size];
            int arr2[]=new int[size];
            int evenindex=0;
            int oddIndex=0;
            for(int i=1;i<=n;i++){
                if(i%2==0){
                    arr1[evenindex]=i;
                    evenindex++;
                }else {
                    arr2[oddIndex]=i;
                    oddIndex++;
                }
            }
            System.out.println("Even Elements are :-" );
            for(int j=0;j<evenindex;j++){
                System.out.println(arr1[j]);
            }

            System.out.println("Odd Elemenets are :-");
            for(int k=0;k<oddIndex;k++){
                System.out.println(arr2[k]);
            }
        }
    }
}
