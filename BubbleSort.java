package codeforces.sortingAlgorithms;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        //Для оптимизации было использовано три приёма - сокращение n - 1, сокращение n - i, boolean check!
        //Благодаря arr.length - 1 я в добавок пропускаю одну конечную итерацию
        //Благодаря arr.length - i я не сравниваю с уже отсортированными элементами
        //Boolean весит мало, и если размер массива 1000, и он отсортирован то я бы пробегался по нему примерно 1000^2, а с boolean только 1000!

        //Using (arr.length - i - 1): 100 99 78 12 32 893 73 1111 32 432 - 45 (9 + 8 + ... 1 = 45)
        //Without boolean: 100 99 78 12 32 893 73 1111 32 432 - 45 (9 + 8 + ... 1 = 45)
        //Typical: 100 99 78 12 32 893 73 1111 32 432 - 81 (9 * 9 = 81)

        //When boolean works: 1 2 3 4 5 6 7 8 9 10 - 9 (9)
        //Without boolean: 1 2 3 4 5 6 7 8 9 10 - 45 (9 * 9 = 81)

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        boolean check = false;
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                count++;
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    check = true;
                }
            }
            if(!check){
                break;
            }
        }
        for (int number: arr) {
            System.out.print(number+" ");
        }
        System.out.println(count);
    }
}
