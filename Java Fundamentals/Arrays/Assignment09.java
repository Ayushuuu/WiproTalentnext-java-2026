public class Assignment09 {
    public static void main(String[] args) {
        int[] arr1 = {1, 10, 10, 2};
        int[] arr2 = {10, 2, 10};
        int[] arr3 = {1, 99, 10};

        printArray(withoutTen(arr1)); // [1, 2, 0, 0]
        printArray(withoutTen(arr2)); // [2, 0, 0]
        printArray(withoutTen(arr3)); // [1, 99, 0]
    }

    public static int[] withoutTen(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;

        for (int num : nums) {
            if (num != 10) {
                result[index] = num;
                index++;
            }
        }
        return result;
    }

    public s
