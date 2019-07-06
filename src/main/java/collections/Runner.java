package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        List<Employee> arrEmp = new ArrayList<>();
        List<Employee> linkedEmp = new LinkedList<>();
        Employee.initList(arrEmp, 100);
        Employee.initList(linkedEmp, 100);
    }

    static void insertNumberOfEmployees(int quantity, List<Employee> list) {

        long start = System.currentTimeMillis();
        for (int i = 0; i < quantity; i++)
            list.add((list.size() / 2), new Employee());
        long end = System.currentTimeMillis();
        System.out.println("Execution time: " + (end - start) + " ms");

    }
}
