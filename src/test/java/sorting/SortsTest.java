package sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static sorting.Sorts.sortWithSelection;

class SortsTest {

    private int[] arr;
    private int[] copyArr;

    @ParameterizedTest
    @DisplayName("Method with sort selection")
    @EnumSource(SortType.class)
    void testSortWithSelection(SortType sortType) {
        arraysInit(10000);
        sortWithSelection(arr, sortType, true);
        Arrays.sort(copyArr);
        assertArrayEquals(this.copyArr, arr, "The array is not sorted");
    }

    void arraysInit(int arrCapacity){
        Random random = new Random();
        arr = new int[arrCapacity];
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(10000) - 5000;
        }
        copyArr = Arrays.copyOf(arr, arr.length);
    }
}