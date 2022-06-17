package AverageNumbers;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Divisible {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        ArrayList<Integer> divisible = numbers.stream().filter(number -> (number % 3 == 0 || number % 2 == 0 || number % 5 == 0)).collect(Collectors.toCollection(ArrayList::new));


        divisible.stream()
                .forEach(num -> System.out.println(num));
    }

}
