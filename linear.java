package searching;

import java.util.Arrays;
import java.util.Scanner;

public class Linear {

	//linear search
	public static int linearSearch(int[] arr, int x) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) { //check key equal or not
                return i; // if value found
            }
        }

        return -1; // if value not found
    }
	
	public static void main(String[] args) {
		//array containing unordered items
		int[] arr = {4, 1, 8, 5, 2, 6, 10};
		System.out.println("Original Array: " + Arrays.toString(arr));
		//input key from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter key value to search using linear searching: ");
        int x = sc.nextInt();
        
        int index = linearSearch(arr, x); // Call linear search method 
        if (index == -1) {
            System.out.println(x + " not found in the array");
        } else {
            System.out.println(x + " found at index " + index);
        }
        		
	}

}
