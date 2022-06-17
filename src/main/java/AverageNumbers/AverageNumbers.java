package AverageNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nums  = new ArrayList<>();
        System.out.println("Input numbers, type 'end' to stop.");

        while (true) {
            String input = scanner.nextLine();
            if(input.equals("end")) {
                break;
            } else if (input.equals("")) {
                continue;
            }

            nums.add(input.trim());
        }

        double avgPositive = nums.stream().mapToInt(s -> Integer.valueOf(s)).filter(number -> number > 0).average().getAsDouble();
        double avgNegative = nums.stream().mapToInt(s -> Integer.valueOf(s)).filter(number -> number < 0).average().getAsDouble();

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String choice = scanner.nextLine();

        if (choice.equals("n")) {
            System.out.println(avgNegative);
        } else if (choice.equals("p")) {
            System.out.println(avgPositive);
        }






    }
}
