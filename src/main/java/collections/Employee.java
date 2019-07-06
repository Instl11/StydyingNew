package collections;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {

    private String name;
    private int age;
    private int salary;

    public static void initList(List<Employee> list, int capacity){
        for (int i = 0; i < capacity; i++){
            list.add(i, new Employee());
        }
    }
}
