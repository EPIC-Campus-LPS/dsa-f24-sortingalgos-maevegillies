import java.util.Scanner;

public class QuadSorts {

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

    public static int[] insertionSort(int[] arr) {
        int l = arr.length;
        int[] arr2 = new int[l];
        for (int i = 0; i <= l - 1; i++) {
            arr2[i] = arr[i];
//            for (int j = i; j < l; j++) { // remove
            int j = i;
            int x = arr2[j]; // x = 0
            while (j > 0 && arr2[j] < arr2[j - 1]) { //while
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


    public static int[] mergeSort(int[] arr){
        return new int[]{0};
    }
}
