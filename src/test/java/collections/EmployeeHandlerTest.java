package collections;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class EmployeeHandlerTest {

    private List<Employee> arrEmp = new ArrayList<>();
    private List<Employee> linkedEmp = new LinkedList<>();

    @Nested
    @DisplayName("Lists of 100 elements")
    class testSmallLists {

        @ParameterizedTest
        @DisplayName("ArrayList | Number of insertions:")
        @ValueSource(ints = {100, 1000, 10000, 100000})
        void testShortArrayList(int quantity) {
            Employee.initList(arrEmp, 100, Employee::new);
            EmployeeHandler.insertNumberOfEmployees(quantity, arrEmp);
        }

        @ParameterizedTest
        @DisplayName("LinkedList | Number of insertions:")
        @ValueSource(ints = {100, 1000, 10000, 100000})
        void testShortLinkedList(int quantity) {
            Employee.initList(linkedEmp, 100, Employee::new);
            EmployeeHandler.insertNumberOfEmployees(quantity, linkedEmp);
        }
    }

    @Nested
    @DisplayName("Lists of 1000 elements")
    class testMidLists {

        @ParameterizedTest
        @DisplayName("ArrayList | Number of insertions:")
        @ValueSource(ints = {100, 1000, 10000, 100000})
        void testMidArrayList(int quantity) {
            Employee.initList(arrEmp, 1000, Employee::new);
            EmployeeHandler.insertNumberOfEmployees(quantity, arrEmp);
        }

        @ParameterizedTest
        @DisplayName("LinkedList | Number of insertions:")
        @ValueSource(ints = {100, 1000, 10000, 100000})
        void testMidLinkedList(int quantity) {
            Employee.initList(linkedEmp, 1000, Employee::new);
            EmployeeHandler.insertNumberOfEmployees(quantity, linkedEmp);
        }
    }

    @Nested
    @DisplayName("Lists of 10000 elements")
    class testLongLists {

        @ParameterizedTest
        @DisplayName("ArrayList | Number of insertions:")
        @ValueSource(ints = {100, 1000, 10000, 100000})
        void testLongArrayList(int quantity) {
            Employee.initList(arrEmp, 10000, Employee::new);
            EmployeeHandler.insertNumberOfEmployees(quantity, arrEmp);
        }

        @ParameterizedTest
        @DisplayName("LinkedList | Number of insertions:")
        @ValueSource(ints = {100, 1000, 10000, 100000})
        void testLongLinkedList(int quantity) {
            Employee.initList(linkedEmp, 10000, Employee::new);
            EmployeeHandler.insertNumberOfEmployees(quantity, linkedEmp);
        }
    }

    @Nested
    @DisplayName("Lists of 100000 elements")
    class testVeryLongLists {

        @ParameterizedTest
        @DisplayName("ArrayList | Number of insertions:")
        @ValueSource(ints = {100, 1000, 10000, 100000})
        void testShortArrayList(int quantity) {
            Employee.initList(arrEmp, 100000, Employee::new);
            EmployeeHandler.insertNumberOfEmployees(quantity, arrEmp);
        }

        @ParameterizedTest
        @DisplayName("LinkedList | Number of insertions:")
        @ValueSource(ints = {100, 1000, 10000, 100000})
        void testShortLinkedList(int quantity) {
            Employee.initList(linkedEmp, 100000, Employee::new);
            EmployeeHandler.insertNumberOfEmployees(quantity, linkedEmp);
        }
    }

}