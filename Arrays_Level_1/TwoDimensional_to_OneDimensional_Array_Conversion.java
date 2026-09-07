package Arrays.Arrays_Level_1;

import java.util.Scanner;

public class TwoDimensional_to_OneDimensional_Array_Conversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int row=sc.nextInt();
        System.out.println("Enter number of columns: ");
        int column=sc.nextInt();
        if(row<=0||column<=0){
            System.out.println("Invalid input: ");
        }else {
            int arr[][]=new int[row][column];
            System.out.println("Enter elements in 2D-Array: ");
            for(int i=0;i<row;i++){
                for(int j=0;j<column;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            System.out.println("2D array:-");
            for(int i=0;i<row;i++){
                for(int j=0;j<column;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }

            int arr1[]=new int[row*column];
            int index=0;
            for(int i=0;i<row;i++){
                for(int j=0;j<column;j++){
                    arr1[index]=arr[i][j];
                    index++;
                }
            }
            System.out.println("1D array: ");
            for(int i=0;i<index;i++){
                System.out.println(arr1[i]);
            }
        }
    }
}
