package searching;

import java.util.Arrays;
import java.util.Scanner;

public class Binary {
	//binary search
	public static int binarySearch(int[] arr, int x) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = (left + right) / 2; //find middle index

            if (arr[mid] == x) {
                return mid; 
            } else if (arr[mid] < x) {
                left = mid + 1; 
            } else {
            	 right = mid - 1; 
            }
        }

        return -1; // if value not found 
    }
         

	public static void main(String[] args) {
		
		//array containing ordered items
		 int[] array = {2, 4, 8, 12, 24, 64, 50};
	       System.out.println("Original Array: " + Arrays.toString(array));
			//input key from user
			Scanner sca=new Scanner(System.in);
			System.out.println("Enter key value to search using binary searching: ");
	       int y = sca.nextInt();
	       
	       int index1 = binarySearch(array, y); // Call binary search
	       if (index1 == -1) {
	           System.out.println(y + " not found in the array");
	       } else {
	           System.out.println(y + " found at index " + index1);
	       }     
		}

	}

