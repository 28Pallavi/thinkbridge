
package sorting;

import java.util.Arrays;
import java.util.Scanner;

class Selection {
   public static void selectionSort(int arr[]) {
       for(int i=0; i<arr.length; i++) {
          // System.out.print(arr[i]+" ");
       }
       System.out.println();
   }


   public static void main(String args[]) {
	  //input from user
	   Scanner sc = new Scanner(System.in);
		
	   System.out.print("Enter the size of the array: ");
       int size = sc.nextInt();
       int[] arr = new int[size]; //array size allocation
       System.out.println("Enter the elements of the array: ");  
       for(int i=0; i<size; i++){
       //reading array elements from the user   
       arr[i]=sc.nextInt();  
       }  

       //selection sort
       for(int i=0; i<arr.length-1; i++) {
           int smallest = i;
           for(int j=i+1; j<arr.length; j++) {
               if(arr[j] < arr[smallest]) {
                   smallest = j;
               }
           }
           //swap
           int temp = arr[smallest];
           arr[smallest] = arr[i];
           arr[i] = temp;
       }

       System.out.println("Selection Sort: " + Arrays.toString(arr)); //after sorting
       selectionSort(arr);//call selection sort method
   }
}
