public class Assignment10 {
    public static void main(String[] args) {
        int[] arr1 = {1, 0, 1, 0, 0, 1, 1};
        int[] arr2 = {3, 3, 2};
        int[] arr3 = {2, 2, 2};

        printArray(evenOdd(arr1)); // [0, 0, 0, 1, 1, 1, 1]
        printArray(evenOdd(arr2)); // [2, 3, 3]
        printArray(evenOdd(arr3)); // [2, 2, 2]
    }

    public static int[] evenOdd(int[] nums) {
        int[] result = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                result[start] = num;
                start++;
            } else {
                result[end] = num;
                end--;
            }
        }
        return result;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
