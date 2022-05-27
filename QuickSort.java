package codeforces.sortingAlgorithms;

import java.util.Scanner;

public class QuickSort {

    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            int pivot = arr[high];
            int i = (low - 1);
            for(int j = low; j <= high - 1; j++)
            {
                if (arr[j] < pivot)
                {
                    i++;
                    swap(arr, i, j);
                }
            }
            swap(arr, i + 1, high);
            int pi = i + 1;

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        quickSort(arr, 0, n - 1);
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}

//public class QuickSort {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int N = in.nextInt();
//        int[] arr = new int[N];
//        for (int i = 0; i < N; i++) {
//            arr[i] = in.nextInt();
//        }
//        int[] res = quickSort(arr);
//        for (int i = N - 1; i >= 0; i--) {
//            System.out.print(res[i] + " ");
//        }
//    }
//    public static int[] quickSort(int[] arr){
//
//        if(arr.length < 2){
//            return arr;
//        }
//        int pivot = arr[arr.length - 1];
//
//        int i = -1;
//        int index1 = 0, d = 0;
//        for (int j = 0; j < arr.length; j++) {
//            if(j != arr.length - 1 && arr[j] == arr[j+1]){
//                d++;
//            }
//            if(j == arr.length - 1){
//                while(j != i+1){
//                    int term = arr[j-1];
//                    arr[j-1] = arr[j];
//                    arr[j] = term;
//                    j--;
//                }
//                break;
//            }
//            if(arr[j]<pivot){
//                i++;
//                int temp = arr[j];
//                arr[j] = arr[i];
//                arr[i] = temp;
//                index1++;
//            }
//        }
//        if(d == arr.length - 1){
//            index1 = d;
//        }
//        int[] l = Arrays.copyOfRange(arr, 0, index1);
//        int[] r = Arrays.copyOfRange(arr, index1, arr.length);
//
//        return merge(quickSort(r),quickSort(l));
//    }
//    public static int[] merge(int[] l, int[] r) {
//        int[] c = new int[l.length + r.length];
//        int index1 = 0, index2 = 0, indexResult = 0;
//        while(index1 < l.length){
//            c[indexResult] = l[index1];
//            index1++;
//            indexResult++;
//        }
//        while(index2 < r.length){
//            c[indexResult] = r[index2];
//            index2++;
//            indexResult++;
//        }
//        return c;
//    }
//}
