public class Task3 {
    //solution
    public static int notContains(int[] array) {
        int n = array.length;
        boolean[] present = new boolean[n];

        // Mark the presence of each number in the input array
        for (int num : array) {
            if (num > 0 && num <= n) {
                present[num - 1] = true;
            }
        }

        // Find the first missing number
        for (int i = 0; i < n; i++) {
            if (!present[i]) {
                return i+1;
            }
        }

        // If all numbers are present, return n+1
        return n+1;
    }
    //testing
    public static void main(String[] args) {
        int[] arr = {-8,3,4,4,5,6,3,5,-2,3,-2};
        System.out.println(notContains(arr));
    }
}

