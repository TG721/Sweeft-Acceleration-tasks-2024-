//solution
public class Task2 {
    public static int minSplit(int amount) {
        int[] coins = {50, 20, 10, 5, 1};
        int count = 0;
        for (int coin : coins) {
            while (amount >= coin) {
                amount -= coin;
                count++;
            }
        }
        return count;
    }
    //testing
    public static void main(String[] args) {
        System.out.println(minSplit(65));
    }
};
