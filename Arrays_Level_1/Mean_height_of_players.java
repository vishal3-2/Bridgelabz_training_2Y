package Arrays.Arrays_Level_1;

import java.util.Scanner;

public class Mean_height_of_players {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array:-");
        int n=sc.nextInt();
        if(n<=0){
            System.out.println("Invalid Input");
        }else {
            double arr[]=new double[n];
            System.out.println("Enter elements in array: ");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextDouble();
            }
            double sum=0.0;
            for(int j=0;j<n;j++){
                sum=sum+arr[j];
            }
            double avg=sum/n;
            System.out.println("The mean height of players in the team is : "+avg);

        }
    }
}
