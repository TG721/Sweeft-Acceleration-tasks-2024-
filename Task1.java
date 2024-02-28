import java.util.HashMap;
import java.util.Map;

public class Task1 {
    static int singleNumber(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {3, 4, 4, 5, 6, 3, 5, -2, 3, -2};
        System.out.println(singleNumber(arr));
    }
}
