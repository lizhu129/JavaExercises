package leetcode;

import java.util.Arrays;

public class AmountPaidInTaxes {
    public double calculateTax(int[][] brackets, int income) {
        double sum = 0, prev = 0;

        for (int i = 0; i < brackets.length; i++) {
            double amount = Math.min(brackets[i][0], income);
            double tax = brackets[i][1];
            sum += (amount - prev) * tax;
            prev = amount;

        }

        return sum / 100;


    }
}
