package Java_Coding_Challenge_1_30days;

import java.util.Scanner;

public class day7_arrays {
    public static void print(String[] arr){
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] arr = in.nextLine().split(" ");
        in.close();
        print(arr);
    }
}
