package collections;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.function.Supplier;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {

    private String name;
    private int age;
    private int salary;

    public static <T> void initList(List<T> list, int capacity, Supplier<T> supplier){
        for (int i = 0; i < capacity; i++){
            list.add(i, supplier.get());
        }
    }
}
