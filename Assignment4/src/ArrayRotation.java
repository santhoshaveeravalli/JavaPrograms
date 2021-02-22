import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array");
		int len = sc.nextInt();// Reading Length of the array 
		int[] arr = new int[len];// Initializing and assigning the array length 
		System.out.println("Enter Array Elements:");
		for(int i=0;i<len;i++)
			arr[i] = sc.nextInt();
        System.out.println("Array: " +Arrays.toString(arr));// Printing Array Elements
        System.out.println("Enter k value:");
        int k = sc.nextInt();
        //Rotating Array to right
       for(int i=0;i<k;i++)
       {
    	   int temp = arr[arr.length-1]; //Stores last elements in the temp variable.
      	   for(int j= arr.length-1;j>0;j--) 
      	   {
    	   arr[j]=arr[j-1]; //Move elements by one. 
      	   }
      	   arr[0]=temp;//Last elements will add to start of array
      	   
       }
       System.out.println("Array after right rotation:" +Arrays.toString(arr));
     }
}