// Reverse array using swap method

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,3,10,2,5,4};
        int start;
        int end;
        System.out.println("Before swap: " + Arrays.toString(arr));
        start = 0;
        end = arr.length - 1;
        reverse(arr, start, end);
        

    }

    public static int[] swap1(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    //reverse the array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap1(arr, start, end);
            start++;
            end--;
        }
        System.out.println("After swap: " + Arrays.toString(arr));
    }
}
