package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class EmployeeHandler {
    public static void main(String[] args) {
        List<Employee> l = new ArrayList<>();

    }

    static void insertNumberOfEmployees(int quantity, List<Employee> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < quantity; i++)
            list.add(list.size()/2, new Employee());
        long end = System.currentTimeMillis();
        System.out.println("Execution time: " + (end - start) + " ms");

    }
}
