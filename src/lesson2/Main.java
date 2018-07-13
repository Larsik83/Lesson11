package lesson2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 8, 7, 7, 7, 2, 2, 8, 5};
        int count = 0;


        Arrays.sort(arr);


        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                count = count + 1;

            }
        }

        System.out.println("парных чисел " + count);

        char a = '%';
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(a);

            }
            System.out.println();
        }

        a = '$';
        for (int i = 5; i > 0; i--) {
            for (int j = i; j < 5; j++) {
                System.out.print(a);

            }
            System.out.println();
        }
    }
}


