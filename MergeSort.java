package codeforces.sortingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = in.nextInt();
        }
        int[] results = mergeSort(arr);
        for(int elem: results){
            System.out.print(elem + " ");
        }
    }
    public static int[] mergeSort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        } else {
            int[] a = mergeSort(Arrays.copyOfRange(arr, 0, arr.length / 2));
            int[] b = mergeSort(Arrays.copyOfRange(arr, arr.length / 2, arr.length));
            int[] c = new int[a.length + b.length];
            int index1 = 0, index2 = 0, indexResult = 0;
            while (index1 < a.length && index2 < b.length){
                if(a[index1] < b[index2]){
                    c[indexResult] = a[index1];
                    index1++;
                }
                else{
                    c[indexResult] = b[index2];
                    index2++;
                }
                indexResult++;
            }
            if (index1 < a.length){
                System.arraycopy(a,index1,c,indexResult,(a.length - index1));
            }
            if (index2 < b.length){
                System.arraycopy(b,index2,c,indexResult,(b.length - index2));
            }
            return c;
        }
    }
}