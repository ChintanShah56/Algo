import java.util.Arrays;

public class Algo {
    public static void main(String args[]) {
        int[] num = {1 , 2, 5, 5, 11, 8, 7, 4, 3, 6, 9};
        twoSum(num, 10);
    }

    public static void twoSum(int[] nums, int target) {
        int[] output = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    output[0] = nums[i];
                    output[1] = nums[j];
                    getPrintResult(output, nums[i], nums[j]);
                }
            }
        }

    }

    private static void getPrintResult(int[] output, int num, int num1) {

        output[0] = num;
        output[1] = num1;
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
        System.out.println();
    }
}
