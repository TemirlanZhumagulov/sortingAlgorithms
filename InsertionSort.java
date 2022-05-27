package codeforces.sortingAlgorithms;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            int el = arr[i];
            int j = i;
            while (j > 0 && arr[j] < arr[j-1]){
                counter++;
                arr[j] = arr[j-1];
                j--;
                arr[j] = el;
            }
        }
        for (int num: arr) {
            System.out.print(num + " ");
        }
        System.out.println(counter);
    }
}
