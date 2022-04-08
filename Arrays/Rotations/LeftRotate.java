package Rotations;

import java.util.Arrays;

public class LeftRotate {
    private static int[] leftRotate(int[] arr, int beginIndex, int endingIndex, int rotatingCount) {
        int[] temp = Arrays.copyOfRange(arr, beginIndex, endingIndex + 1);
        rotatingCount %= temp.length;
        deeplyLeftRotate(temp, rotatingCount);
        System.arraycopy(temp, 0, arr, beginIndex, temp.length);
        return arr;
    }

    private static void deeplyLeftRotate(int[] arr, int rotatingCount) {
        if (rotatingCount != 0) {
            for (int i = 0; i < rotatingCount; i++) {
                int temp = arr[0];
                System.arraycopy(arr, 1, arr, 0, arr.length - 1);
                arr[arr.length - 1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7};
        int[] left = leftRotate(arr, 2, 5, 79);
        System.out.println(Arrays.toString(left));
    }
}