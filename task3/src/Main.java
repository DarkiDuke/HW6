import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(40, 100);
        }
        System.out.println(Arrays.toString(nums));

        int sumNums = 0;
        int count = 0;
        for (int num : nums) {
            if (num >= 60 && num <= 80) {
                count++;
            }
            sumNums += num;
        }

        System.out.println("Средний вес всех людей = " + (sumNums / nums.length));
        System.out.println("Количество людей, у которых вес находится в промежутке от 60 до 80 кг включительно = " + count);
    }
}
