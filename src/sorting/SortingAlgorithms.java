package sorting;

import java.util.Arrays;

public class SortingAlgorithms {
    public static void main(String[] args) {
        int[] arr = {3,12,7,2,5,8,1};
        //bubblesort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Time complexity is O(n^2)
     * @param arr
     * @param n
     */
    private static void bubblesort(int[] arr, int n) {
        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++) {
                if(arr[i]>arr[j]) {
                    int tmp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
    }

    /**
     * Time complexity is O(n*log N)
     * @param arr
     * @param n
     */
    private static void quicksort(int[] arr, int n){

    }

}
