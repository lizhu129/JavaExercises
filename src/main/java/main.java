public class main {

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 4, 5, 5, 7, 8, 9, 10, 9};
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    break;
                }
                continue;
            }
            continue;
        }
        if (count == 0) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }


}
