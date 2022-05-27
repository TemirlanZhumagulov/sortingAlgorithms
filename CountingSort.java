package codeforces.sortingAlgorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingSort {
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int[] a = new int[n];
        String[] w = in.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(w[i]);
            if (a[i] < min)
            {
                min = a[i];
            }
            if (a[i] > max)
            {
                max = a[i];
            }
        }
        int[] buckets = new int[max - min + 1];
        for (int element : a)
        {
            buckets[element - min]++;
        }
        int arrayIndex = 0;
        for (int i = 0; i < buckets.length; i++)
        {
            for (int j = buckets[i]; j > 0; j--)
            {
                a[arrayIndex] = i + min;
                System.out.print(a[arrayIndex++]+ " ");
            }
        }
    }
}
