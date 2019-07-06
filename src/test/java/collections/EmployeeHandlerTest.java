package collections;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class EmployeeHandlerTest {

    private List<Employee> arrEmpSmall = new ArrayList<>();
    private List<Employee> arrEmpMid = new ArrayList<>();
    private List<Employee> arrEmpLong = new ArrayList<>();
    private List<Employee> linkedEmpSmall = new LinkedList<>();
    private List<Employee> linkedEmpMid = new LinkedList<>();
    private List<Employee> linkedEmpLong = new LinkedList<>();


    @Nested
    @DisplayName("Lists of 100 elements")
    class testSmallLists {

        @ParameterizedTest
        @DisplayName("ArrayList | Number of insertions:")
        @ValueSource(ints = {100, 1000, 10000, 100000})
        void testSmallArrayList(int quantity) {
            Employee.initList(arrEmpSmall, 100, Employee::new);
            EmployeeHandler.insertNumberOfEmployees(quantity, arrEmpSmall);
        }

        @ParameterizedTest
        @DisplayName("LinkedList | Number of insertions:")
        @ValueSource(ints = {100, 1000, 10000, 100000})
        void testSmallLinkedList(int quantity) {
            Employee.initList(linkedEmpSmall, 100, Employee::new);
            EmployeeHandler.insertNumberOfEmployees(quantity, arrEmpSmall);
        }
    }

    @Nested
    @DisplayName("Lists of 1000 elements")
    class testMidLists {

        @ParameterizedTest
        @DisplayName("ArrayList | Number of insertions:")
        @ValueSource(ints = {100, 1000, 10000, 100000})
        void testSmallArrayList(int quantity) {
            Employee.initList(arrEmpMid, 1000, Employee::new);
            EmployeeHandler.insertNumberOfEmployees(quantity, arrEmpMid);
        }

        @ParameterizedTest
        @DisplayName("LinkedList | Number of insertions:")
        @ValueSource(ints = {100, 1000, 10000, 100000})
        void testSmallLinkedList(int quantity) {
            Employee.initList(linkedEmpMid, 1000, Employee::new);
            EmployeeHandler.insertNumberOfEmployees(quantity, linkedEmpMid);
        }
    }

    @Nested
    @DisplayName("Lists of 10000 elements")
    class testLongLists {

        @ParameterizedTest
        @DisplayName("ArrayList | Number of insertions:")
        @ValueSource(ints = {100, 1000, 10000, 100000})
        void testSmallArrayList(int quantity) {
            Employee.initList(arrEmpLong, 10000, Employee::new);
            EmployeeHandler.insertNumberOfEmployees(quantity, arrEmpLong);
        }

        @ParameterizedTest
        @DisplayName("LinkedList | Number of insertions:")
        @ValueSource(ints = {100, 1000, 10000, 100000})
        void testSmallLinkedList(int quantity) {
            Employee.initList(linkedEmpLong, 10000, Employee::new);
            EmployeeHandler.insertNumberOfEmployees(quantity, linkedEmpLong);
        }
    }

}