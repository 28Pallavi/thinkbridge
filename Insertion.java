package sorting;

import java.util.*;


class Insertion{
   public static void bubbleSort(int arr[]) {
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



       //insertion sort
       for(int i=1; i<arr.length; i++) {
           int current = arr[i];
           int j = i - 1;
               while(j >= 0 && arr[j] > current) {
                   //Keep swapping
                   arr[j+1] = arr[j];
                   j--;
               }
           arr[j+1] = current;
       }
       System.out.println("Insertion Sort: " + Arrays.toString(arr)); //after sorting
       bubbleSort(arr);//call insertion sort
   }
}

