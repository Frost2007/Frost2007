package Lesson7;

public class ForEach2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int x : nums) {
            System.out.println("value is : " + x);
            sum += x;
            if (x == 5) break;
        }
        System.out.println("The sum of first five elements is " + sum);

    }
}
