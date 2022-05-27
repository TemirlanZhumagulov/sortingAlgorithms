package codeforces.sortingAlgorithms;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        //Благодаря arr.length - 1 я в добавок пропускаю одну конечную итерацию
        //Благодаря arr.length - i я не сравниваю с уже отсортированными элементами
        //Boolean весит мало, и если размер массива 1000, и он отсортирован то я бы пробегался по нему примерно 1000^2, а с boolean только 1000!

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
