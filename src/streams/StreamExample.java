package streams;

import java.util.ArrayList;
import java.util.List;

/*
* The steps regarding streams are:
* 1. Create a stream
* 2. Perform one or more Intermediate operations like filter(), sorted(), map(), distinct()
* 3. Perform one  terminal operations like collect(), reduce() and count()
* */

public class StreamExample {


    public static void main(String[] args) {
        List<Integer> salaryList = new ArrayList<>();
        salaryList.add(3000);
        salaryList.add(2000);
        salaryList.add(1000);
        salaryList.add(500);
        salaryList.add(3500);
        salaryList.add(4000);
        salaryList.add(2500);

        long output = salaryList.stream().filter(salary -> salary > 3000).count();
        System.out.println("Total Salary greater than 3000 are " + output);
    }
}
