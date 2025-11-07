class Solution {
    public static void print_divisors(int n) {
        // code here
         ArrayList<Integer> divisors = new ArrayList<>();
        
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }

        // Print remaining divisors in correct order
        for (int i = divisors.size() - 1; i >= 0; i--) {
            System.out.print(divisors.get(i) + " ");
        }

    }
}
