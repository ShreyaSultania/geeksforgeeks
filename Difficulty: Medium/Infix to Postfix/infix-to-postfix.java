class Solution {

    static int prior(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        if (ch == '^') return 3;
        return 0;
    }

    static boolean isRightAssociative(char ch) {
        return ch == '^';
    }

    public static String infixToPostfix(String s) {

        Stack<Character> op = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // 1️⃣ Operand
            if (Character.isLetterOrDigit(ch)) {
                ans.append(ch);
            }

            // 2️⃣ Opening bracket
            else if (ch == '(') {
                op.push(ch);
            }

            // 3️⃣ Closing bracket
            else if (ch == ')') {
                while (!op.isEmpty() && op.peek() != '(') {
                    ans.append(op.pop());
                }
                op.pop(); // remove '('
            }

            // 4️⃣ Operator
            else {
                while (!op.isEmpty() &&
                      (prior(ch) < prior(op.peek()) ||
                      (prior(ch) == prior(op.peek()) && !isRightAssociative(ch)))) {

                    ans.append(op.pop());
                }
                op.push(ch);
            }
        }

        // 5️⃣ Remaining operators
        while (!op.isEmpty()) {
            ans.append(op.pop());
        }

        return ans.toString();
    }
}
