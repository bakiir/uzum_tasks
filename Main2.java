public class Main2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 6, 7, 8};
        int target = 11;

        findTwoSum(nums, target);
    }

    public static void findTwoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {
            int sum = numbers[i] + numbers[j];

            if (sum == target) {
                System.out.println(numbers[i] + " + " + numbers[j] + " = " + target);
                return; 
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        System.out.println("Пары не найденныы");
    }
}
