public class Task4 {
    public static String binaryStringSum(String a, String b) {
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder sum = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {
            int digitA = (i >= 0) ? a.charAt(i--) - '0' : 0;
            int digitB = (j >= 0) ? b.charAt(j--) - '0' : 0;
            int digitSum = digitA + digitB + carry;
            sum.append(digitSum % 2);
            carry = digitSum / 2;
        }

        return sum.reverse().toString();
    }

    public static void main(String[] args) {
        //testing
        String a = "1010";
        String b = "1011";
        String sum = binaryStringSum(a, b);
        System.out.println(sum);
    }
}

