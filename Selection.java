
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

// // 
// public class SelectionSortExample {  
//     public static void selectionSort(int[] arr){  
//         for (int i = 0; i < arr.length - 1; i++)  
//         {  
//             int index = i;  
//             for (int j = i + 1; j < arr.length; j++){  
//                 if (arr[j] < arr[index]){  
//                     index = j;//searching for lowest index  
//                 }  
//             }  
//             int smallerNumber = arr[index];   
//             arr[index] = arr[i];  
//             arr[i] = smallerNumber;  
//         }  
//     }  
       
//     public static void main(String a[]){  
//         int[] arr1 = {9,14,3,2,43,11,58,22};  
//         System.out.println("Before Selection Sort");  
//         for(int i:arr1){  
//             System.out.print(i+" ");  
//         }  
//         System.out.println();  
          
//         selectionSort(arr1);//sorting array using selection sort  
         
//         System.out.println("After Selection Sort");  
//         for(int i:arr1){  
//             System.out.print(i+" ");  
//         }  
//     }  
// }  
