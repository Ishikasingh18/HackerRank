

   // Write your code here

public static PerformOperation isOdd() {
        return n -> ((n & 1) == 1);
    }

    public static PerformOperation isPrime() {
        return n -> {
            if (n < 2) {
                return false;
            } else {
                int k = (int) Math.sqrt(n);
                for (int i = 2; i <= k; i++) {
                    if (n % i == 0)
                        return false;
                }
                return true;
            }
        };
    }

    public static PerformOperation isPalindrome() {
        return n -> {
            String org = n + "";
            String newString = new StringBuffer(org).reverse().toString();
            return org.equals(newString);
        };
    }
}
