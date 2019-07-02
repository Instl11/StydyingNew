package sorting;

import java.util.Arrays;
import java.util.Random;

import static sorting.Operation.actionRuntimeCounting;

public class Sorts {

    public static void sortWithSelection(int[] arr, SortType sortType, boolean timeCounting) {

        switch (sortType) {
            case MY: {
                double runtime = actionRuntimeCounting(() -> mySort(arr));
                if (timeCounting) print(sortType, runtime);
                break;
            }
            case BUBBLE: {
                double runtime = actionRuntimeCounting(() -> bubbleSort(arr));
                if (timeCounting) print(sortType, runtime);
                break;
            }
            case QUICK: {
                double runtime = actionRuntimeCounting(() -> quickSort(arr));
                if (timeCounting) print(sortType, runtime);
                break;
            }
            case JAVABOX: {
                double runtime = actionRuntimeCounting(() -> Arrays.sort(arr));
                if (timeCounting) print(sortType, runtime);
                break;
            }
        }
    }

    private static void mySort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j])
                    min = j;
            }
            swap(arr, i, min);
        }

    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) swap(arr, i, j);
            }
        }

    }

    private static void quickSort(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        quickSortWithDiap(arr, low, high);
    }

    private static void quickSortWithDiap(int[] arr, int low, int high) {

        int pivot = arr[(low + high) >>> 1];
        int left = low - 1;
        int right = high + 1;

        while (left < right) {
            while (arr[++left] < pivot) ;
            while (arr[--right] > pivot) ;

            if (left < right) swap(arr, left, right);
        }
        if (low < high) {
            quickSortWithDiap(arr, low, right);
            quickSortWithDiap(arr, right + 1, high);
        }
    }

    private static void swap(int[] arr, int i, int min) {
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }

    public static void shuffle(int[] arr) {
        Random random = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            swap(arr, index, i);
        }
    }

    private static void print(SortType sortType, double time) {
        System.out.println("\"" + sortType + " sort\" execution time is: " + time + " ms");
    }
}
