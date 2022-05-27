package codeforces.sortingAlgorithms;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            int max = arr.length - 1 - i;
            for (int j = arr.length - 2 - i; j >= 0; j--) {
                count++;
                if(arr[max] < arr[j]){
                    max = j;
                }
            }
            int temp = arr[arr.length - 1 - i];
            arr[arr.length - i - 1] = arr[max];
            arr[max] = temp;
        }
        System.out.println(count);
        for (int num :
                arr) {
            System.out.print(num + " ");
        }
    }
}
