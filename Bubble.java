package sorting;

import java.util.*;


class Sorting {
   public static void BubbleSort(int arr[]) {
       for(int i=0; i<arr.length; i++) {
           //System.out.print(arr[i]+" ");
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


       //bubble sort
       for(int i=0; i<arr.length-1; i++) {
           for(int j=0; j<arr.length-i-1; j++) {
               if(arr[j] > arr[j+1]) {
                   //swap
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
       }

       System.out.println("Bubble Sort: " + Arrays.toString(arr)); //after sorting
       BubbleSort(arr); //call bubble sort method
   }
}
