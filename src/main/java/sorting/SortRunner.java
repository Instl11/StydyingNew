package sorting;

import java.util.Arrays;
import java.util.Random;

import static sorting.Sorts.sortWithSelection;

// Это не тест =) Читай про ЮнитТесты
public class SortRunner {
    public static void main(String[] args) {
        int[] arr1 = new int[500];
        Random random = new Random();
        for (int i = 0; i < arr1.length; i++)
            arr1[i] = random.nextInt(1000);
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);
        int[] arr3 = Arrays.copyOf(arr1, arr1.length);
        int[] arr4 = Arrays.copyOf(arr1, arr1.length);

       /* sortWithSelection(arr1, SortType.MY, true);
        sortWithSelection(arr2, SortType.BUBBLE, true);*/
        sortWithSelection(arr3, SortType.QUICK, true);
        sortWithSelection(arr4, SortType.JAVABOX, true);

        //System.out.println(Arrays.toString(arr1));



        //for (int i = 0; i < arr1.length; i++) System.out.printf("%-4d %s", arr1[i], (i + 1) % 30 == 0 ? "\n" : " ");


    }


}
