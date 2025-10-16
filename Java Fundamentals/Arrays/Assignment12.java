public class Assignment12 {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] b1 = {4, 5, 6};
        int[] a2 = {7, 7, 7};
        int[] b2 = {3, 8, 0};
        int[] a3 = {5, 2, 9};
        int[] b3 = {1, 4, 5};

        printArray(middleWay(a1, b1)); // [2, 5]
        printArray(middleWay(a2, b2)); // [7, 8]
        printArray(middleWay(a3, b3)); // [2, 4]
    }

    public static int[] middleWay(int[] a, int[] b) {
        int[] result = new int[2];
        result[0] = a[1];
        result[1] = b[1];
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
