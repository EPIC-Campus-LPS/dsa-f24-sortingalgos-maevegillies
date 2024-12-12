import java.util.Scanner;

public class QuadSorts {


/**
* Bubblesort. Compares i and i+1 within arr and swaps them if i+1 is smaller by seperating them into two arrays, then putting i+1 back into the original arr.
* the if statement checks to see if the next element is smaller than the current. If it is, swap them. 
*/
    public static int[] bubbleSort(int[] arr) {
        int l = arr.length; 
        boolean z = true;

        while (z) {
            z = false;
            for (int i = 0; i < l - 1; i++) {
                if (arr[i + 1] < arr[i]) {
                    int x = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = x;
                    z = true;
                }
            }
        }
        for (int j = 0; j < l; j++) {
            System.out.println(arr[j]);
        }
        return new int[]{0};
    }

    /**
    * Selectionsort. Sorts the arr by seperating the arr into two (unsorted and sorted), finding the minimum value then putting that value in the sorted arr. This way, the sorted arr will contain all the values and will be swapped back to the original arr.
    * Z for loop is to find the minimum value of the arr
    * Swaps current element (min) with i and then sets that smallest element with the current element of i in arr
    */
    public static int[] selectionSort(int[] arr) {
        int l = arr.length;
        for (int i = 0; i < l - 1; i++) {
            int min = arr[i];
            int mini = 0;

            for (int z = i; z < l; z++) {
                if (arr[z] < min) {
                    min = arr[z];
                    mini = z;
                }
            }
            arr[mini] = arr[i];
            arr[i] = min;
        }
        for (int j = 0; j < l; j++) {
            System.out.println(arr[j]);
        }
        return new int[]{0};
    }
    

    /**
    * Insertionsort. Divide the arr into two (sorted and unsorted) and insert elements of the unsorted into the sorted using comparisons
    * Arr2 stores the sorted values from arr. I copied all of the values from arr to arr2 and set x to the value of arr2 at j. X is then swapped as long as the current element is smaller than the previous.
    */
    public static int[] insertionSort(int[] arr) {
        int l = arr.length;
        int[] arr2 = new int[l];
        for (int i = 0; i <= l - 1; i++) {
            arr2[i] = arr[i];
            int j = i;
            int x = arr2[j];
            while (j > 0 && arr2[j] < arr2[j - 1]) {
                    arr2[j] = arr2[j - 1];
                    arr2[j - 1] = x;
                    j--;
                }
            }
        for (int z = 0; z < l; z++) {
            System.out.print(arr2[z] + " ");
        }
        return new int[]{0};
    }

    /**
    * </3
    */
    public static int[] mergeSort(int[] arr){
        return new int[]{0};
    }
}
